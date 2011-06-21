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

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.dnd.DND;
import org.eventb.core.basis.EventBElement;
import org.pror.presentation.rodin.phenomenon.PhenomenonDescriptorConfiguration;
import org.pror.presentation.rodin.phenomenon.PhenomenonFactory;
import org.pror.ui.ProRPresentationConfiguration;
import org.pror.ui.api.PresentationService;
import org.pror.ui.api.ProrUtil;

import de.itemis.rif12.ExchangeFile.ExchangeFileFactory;
import de.itemis.rif12.ExchangeFile.ExchangeFilePackage;
import de.itemis.rif12.ExchangeFile.RIF;
import de.itemis.rif12.ExchangeFile.SpecHierarchy;
import de.itemis.rif12.ExchangeFile.SpecObject;
import de.itemis.rif12.ExchangeFile.SpecRelation;

/**
 * This description
 * 
 * @author jastram
 * 
 */
public class PhenomenonDescriptionService implements PresentationService {

	public PhenomenonDescriptionService() {
		// No action Required
	}

	@Override
	public ProRPresentationConfiguration getConfigurationInstance() {
		return PhenomenonFactory.eINSTANCE
				.createPhenomenonDescriptorConfiguration();
	}

	@Override
	public Class<? extends ProRPresentationConfiguration> getConfigurationInterface() {
		return PhenomenonDescriptorConfiguration.class;
	}

	/**
	 * Hooks a listener in to make sure that the reqif is updated upon changes
	 * in the Event-B model.
	 * <p>
	 * 
	 */
	@Override
	public void openRIF(final RIF reqif) {
	}

	@Override
	public Command handleDragAndDrop(Collection<?> source, Object target,
			EditingDomain editingDomain, int operation) {
		if (!(target instanceof SpecHierarchy)) {
			return null;
		}
		SpecHierarchy specHierarchy = (SpecHierarchy) target;
		RIF rif = ProrUtil.getRIF(target);
		RodinService service = RodinService.getRodinService(rif.eResource());

		for (Object object : source) {
			if (object instanceof EventBElement) {
					String id = ((EventBElement) object).getElementName();
					SpecObject specObject = service.getSpecObjectForId(id, rif,
							editingDomain);

				if (operation == DND.DROP_LINK) {
				return createLinkCommand(editingDomain, rif, specHierarchy,
						specObject);
				} else {
					return createInsertCommand(editingDomain, rif,
							specHierarchy,
							specObject);
				}
			}
		}
		return null;
	}

	private Command createLinkCommand(EditingDomain editingDomain, RIF rif,
			SpecHierarchy dropTarget, SpecObject dragSource) {
		SpecRelation relation = ExchangeFileFactory.eINSTANCE
				.createSpecRelation();
		// Even though we drag from EventB to ProR, we link the other
		// way around. The problem is, that we only control the drag in
		// one direction.
		relation.setTarget(dragSource);
		relation.setSource(dropTarget.getObject());
		return AddCommand.create(editingDomain, rif.getCoreContent(),
				ExchangeFilePackage.Literals.RIF_CONTENT__SPEC_RELATIONS,
				relation);
	}

	private Command createInsertCommand(EditingDomain editingDomain, RIF rif,
			SpecHierarchy dropTarget, SpecObject dragSource) {
		SpecHierarchy sh = ExchangeFileFactory.eINSTANCE.createSpecHierarchy();
		sh.setObject(dragSource);
		return AddCommand.create(editingDomain, dropTarget,
				ExchangeFilePackage.Literals.SPEC_HIERARCHY__CHILDREN, sh);

	}

}
