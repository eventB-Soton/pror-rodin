/**
 * <copyright> 
 *
 * (c) 2010 Lehrstuhl fuer Softwaretechnik und Programmiersprachen, Heinrich
 * Heine Universitaet Duesseldorf (STUPS) and others.
 * 
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   STUPS - Initial API and implementation
 *
 * </copyright>
 */
package org.pror.presentation.rodin.phenomenon.core;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eventb.emf.core.EventBNamedCommentedElement;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.Project;
import org.eventb.emf.core.context.CarrierSet;
import org.eventb.emf.core.context.Constant;
import org.eventb.emf.core.machine.Variable;
import org.eventb.emf.persistence.ProjectResource;
import org.pror.presentation.rodin.phenomenon.PhenomenonDescriptorConfiguration;
import org.pror.ui.ProRPresentationConfiguration;
import org.pror.ui.ProrUiToolExtension;
import org.pror.ui.api.ProrUtil;
import org.rodinp.core.IRodinProject;
import org.rodinp.core.RodinCore;

import de.itemis.rif12.ExchangeFile.AttributeValue;
import de.itemis.rif12.ExchangeFile.AttributeValueSimple;
import de.itemis.rif12.ExchangeFile.DatatypeDefinition;
import de.itemis.rif12.ExchangeFile.ExchangeFileFactory;
import de.itemis.rif12.ExchangeFile.ExchangeFilePackage;
import de.itemis.rif12.ExchangeFile.RIF;
import de.itemis.rif12.ExchangeFile.SpecObject;

/**
 * The PhenomenaService manages Phenomena for ReqIF. The Singleton instance is
 * acquired through the static {@link #getReqifPhenomena(ReqIF)}.
 */
public class RodinService {

	// We have one RodinService per Project.
	private static Map<Project, RodinService> services = new HashMap<Project, RodinService>();

	/**
	 * Retrieves the {@link RodinService} for the given {@link ReqIF}. This
	 * ensures that only one per {@link ReqIF} is instantiated.
	 */
	public static RodinService getRodinService(Resource resource) {
		Path path = new Path(resource.getURI().toPlatformString(true));
		IProject eclipseProject = getEclipseProject(path);
		Project rodinProject = getEmfRodinProject(eclipseProject);

		RodinService service = services.get(rodinProject);
		if (service == null) {
			service = new RodinService(eclipseProject);
			services.put(rodinProject, service);
		}
		return service;
	}

	/**
	 * Attempts to find the {@link Project} for the given {@link Resource}.
	 * Returns null if it cannot be found, or if it is not a Rodin Project.
	 */
	public static Project getEmfRodinProject(IProject eclipseProject) {
		try {
			IRodinProject rodinProject = RodinCore.getRodinDB()
					.getRodinProject(eclipseProject.getName());

			ProjectResource projectResource = new ProjectResource(rodinProject);
			projectResource.load(null);
			Project project = (Project) projectResource.getContents().get(0);
			return project;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Returns an Eclipse {@link IProject} for the given {@link IResource}.
	 * 
	 * @param path
	 * @return
	 */
	private static IProject getEclipseProject(Path path) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		return root.getFile(path).getProject();
	}


	// Non-Static stuff below
	private final IProject eclipseProject;
	private RodinManager rodinManager;
	
	// private ProjectHandler projectHandler;

	private RodinService(IProject eclipseProject) {
		this.eclipseProject = eclipseProject;
	}

	/**
	 * TODO Right now, we're reloading the EMF-Project every single time, very
	 * inefficient. But without this, the model gets stale.
	 */
	public Project getRodinProject() {
		return getEmfRodinProject(eclipseProject);
	}

	public IProject getEclipseProject() {
		return eclipseProject;
	}

	public RodinManager getRodinManager() {
		if (rodinManager == null) {
			rodinManager = new RodinManager(this);
		}
		return rodinManager;
	}

	public SpecObject getSpecObjectForId(String id, RIF rif,
			EditingDomain editingDomain) {
		PhenomenonDescriptorConfiguration config = getRodinIdDatatypeDefinition(rif);
		if (config == null || config.getDatatype() == null
				|| config.getSpecType() == null) {
			return null;
		}
		DatatypeDefinition targetDD = config.getDatatype();

		for (SpecObject specObject : rif.getCoreContent().getSpecObjects()) {
			for (AttributeValue value : specObject.getValues()) {
				DatatypeDefinition dd = ProrUtil.getDatatypeDefinition(value);
				if (targetDD.equals(dd)) {
					if (id.equals(((AttributeValueSimple)value).getTheValue())) {
						return specObject;
					}
				}
			}
		}

		// If we arrive here, we didn't find a matching SpecObject: We'll create it.
		SpecObject specObject = ExchangeFileFactory.eINSTANCE.createSpecObject();
		specObject.setType(config.getSpecType());
		ProrUtil.updateValuesForCurrentType(specObject);
		ProrUtil.setTheValue(specObject, targetDD, id);
		Command command = AddCommand.create(editingDomain,
				rif.getCoreContent(),
				ExchangeFilePackage.Literals.RIF_CONTENT__SPEC_OBJECTS,
				specObject);
		editingDomain.getCommandStack().execute(command);

		return specObject;
	}

	/**
	 * Looks through all configurations of the given rif to find the
	 * {@link DatatypeDefinition} responsible for holding the Rodin ID.
	 */
	private PhenomenonDescriptorConfiguration getRodinIdDatatypeDefinition(
			RIF rif) {
		ProrUiToolExtension extension = ProrUtil.getProrUiToolExtension(rif);
		EList<ProRPresentationConfiguration> configs = extension
				.getPresentationConfigurations()
				.getPresentationConfigurations();
		for (ProRPresentationConfiguration config : configs) {
			if (config instanceof PhenomenonDescriptorConfiguration) {
				return (PhenomenonDescriptorConfiguration) config;
			}
		}
		return null;
	}

	/**
	 * This method provides a meaningful label for {@link EventBObject}s to be
	 * rendered in ProR. Keep in mind that the label should uniquely identify
	 * the element. This means that Variables, for instance, should be
	 * identified as such and should also show the containing machine, etc.
	 */
	public static String elementLabel(EventBObject element) {
		if (element == null) {
			return "REFERENCE MISSING";
		}

		if (element instanceof Variable || element instanceof CarrierSet
				|| element instanceof Constant) {
			EventBNamedCommentedElement e = (EventBNamedCommentedElement) element;
			EventBNamedCommentedElement p = (EventBNamedCommentedElement) element
					.eContainer();
			return e.getName() + " (" + p.getName() + ")";

		} else
		if (element instanceof EventBNamedCommentedElement) {
			EventBNamedCommentedElement e = (EventBNamedCommentedElement) element;
			return e.getName();
		} else {
			return element.toString();
		}
	}

}
