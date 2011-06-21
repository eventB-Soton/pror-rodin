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
package org.pror.presentation.rodin.phenomenon.impl;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.CellEditor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.pror.presentation.linewrap.core.LinewrapCellEditor;
import org.pror.presentation.rodin.phenomenon.PhenomenonHighlightConfiguration;
import org.pror.presentation.rodin.phenomenon.PhenomenonPackage;
import org.pror.presentation.rodin.phenomenon.core.PhenomenonHighlightCellRenderer;
import org.pror.presentation.rodin.phenomenon.core.RodinService;
import org.pror.ui.api.IProrCellRenderer;
import org.pror.ui.impl.ProRPresentationConfigurationImpl;

import de.itemis.rif12.ExchangeFile.AttributeValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Highlight Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PhenomenonHighlightConfigurationImpl extends ProRPresentationConfigurationImpl implements PhenomenonHighlightConfiguration {

	PhenomenonHighlightCellRenderer renderer = new PhenomenonHighlightCellRenderer();
	private RodinService rodinService;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PhenomenonHighlightConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhenomenonPackage.Literals.PHENOMENON_HIGHLIGHT_CONFIGURATION;
	}

	@Override
	public IProrCellRenderer getCellRenderer() {
		renderer.setRodinService(getRodinService());
		return renderer;
	}

	/**
	 * Lazily retrieves the RodinService. It also registers a listener with the
	 * Rodin Project to keep the Keyword Map up to date.
	 * 
	 * @return
	 */
	private RodinService getRodinService() {
		if (rodinService == null) {
			if (getDatatype() == null || getDatatype().eResource() == null) {
				return null;
			}
			rodinService = RodinService.getRodinService(getDatatype()
					.eResource());
		}
		return rodinService;
	}

	/**
	 * We use the default editor.
	 */
	@Override
	public CellEditor getCellEditor(AgileGrid agileGrid,
			EditingDomain editingDomain) {
		return new LinewrapCellEditor(agileGrid, editingDomain);
	}

	@Override
	public boolean canEdit() {
		return true;
	}

	@Override
	public String getLabel(AttributeValue av) {
		return null;
	}

} //PhenomenonHighlightConfigurationImpl
