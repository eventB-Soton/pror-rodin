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

import java.util.Map;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.CellEditor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eventb.emf.core.EventBObject;
import org.pror.presentation.rodin.phenomenon.PhenomenonDescriptorConfiguration;
import org.pror.presentation.rodin.phenomenon.PhenomenonPackage;
import org.pror.presentation.rodin.phenomenon.core.PhenomenonDescriptionCellRenderer;
import org.pror.presentation.rodin.phenomenon.core.RodinService;
import org.pror.presentation.rodin.phenomenon.provider.PhenomenonEditPlugin;
import org.pror.presentation.rodin.phenomenon.util.PhenomenonValidator;
import org.pror.ui.api.IProrCellRenderer;
import org.pror.ui.impl.ProRPresentationConfigurationImpl;

import de.itemis.rif12.ExchangeFile.AttributeDefinition;
import de.itemis.rif12.ExchangeFile.AttributeDefinitionSimple;
import de.itemis.rif12.ExchangeFile.AttributeValue;
import de.itemis.rif12.ExchangeFile.AttributeValueSimple;
import de.itemis.rif12.ExchangeFile.SpecType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Descriptor Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pror.presentation.rodin.phenomenon.impl.PhenomenonDescriptorConfigurationImpl#getSpecType <em>Spec Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhenomenonDescriptorConfigurationImpl extends ProRPresentationConfigurationImpl implements PhenomenonDescriptorConfiguration {
	/**
	 * The cached value of the '{@link #getSpecType() <em>Spec Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecType()
	 * @generated
	 * @ordered
	 */
	protected SpecType specType;

	private IProrCellRenderer renderer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhenomenonDescriptorConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhenomenonPackage.Literals.PHENOMENON_DESCRIPTOR_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecType getSpecType() {
		if (specType != null && specType.eIsProxy()) {
			InternalEObject oldSpecType = (InternalEObject)specType;
			specType = (SpecType)eResolveProxy(oldSpecType);
			if (specType != oldSpecType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhenomenonPackage.PHENOMENON_DESCRIPTOR_CONFIGURATION__SPEC_TYPE, oldSpecType, specType));
			}
		}
		return specType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecType basicGetSpecType() {
		return specType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecType(SpecType newSpecType) {
		SpecType oldSpecType = specType;
		specType = newSpecType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhenomenonPackage.PHENOMENON_DESCRIPTOR_CONFIGURATION__SPEC_TYPE, oldSpecType, specType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean isConfiguredCorrectly(DiagnosticChain diagnostics,
			Map<?, ?> context) {
		String msg = null;

		// Make sure that a specObjectType is configured.
		if (getSpecType() == null) {
			msg = "_UI_Config_No_SpecObjectType_diagnostic";
		}

		// Make sure that there is one Attribute with the configured Datatype
		if (msg == null) {
			AttributeDefinition attributeDefinition = null;
			for (AttributeDefinition ad : getSpecType()
					.getSpecAttributes()) {
				if (getDatatype() != null
						&& ad instanceof AttributeDefinitionSimple
						&& getDatatype().equals(
								((AttributeDefinitionSimple) ad).getType())) {
					attributeDefinition = ad;
					break;
				}
			}

			if (attributeDefinition == null) {
				msg = "_UI_Config_wrong_SpecObjectType_diagnostic";
			}
		}

		if (msg != null) {
			if (diagnostics != null) {
				Object[] substitutions = { getDatatype() != null ? getDatatype()
						.getLongName()
						: "[DatatypeDefinition missing]" };
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								PhenomenonValidator.DIAGNOSTIC_SOURCE,
								PhenomenonValidator.PHENOMENON_DESCRIPTOR_CONFIGURATION__IS_CONFIGURED_CORRECTLY,
								PhenomenonEditPlugin.INSTANCE.getString(msg,
										substitutions),
								new Object[] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhenomenonPackage.PHENOMENON_DESCRIPTOR_CONFIGURATION__SPEC_TYPE:
				if (resolve) return getSpecType();
				return basicGetSpecType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PhenomenonPackage.PHENOMENON_DESCRIPTOR_CONFIGURATION__SPEC_TYPE:
				setSpecType((SpecType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PhenomenonPackage.PHENOMENON_DESCRIPTOR_CONFIGURATION__SPEC_TYPE:
				setSpecType((SpecType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PhenomenonPackage.PHENOMENON_DESCRIPTOR_CONFIGURATION__SPEC_TYPE:
				return specType != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public IProrCellRenderer getCellRenderer() {
		if (renderer == null) {
			renderer = new PhenomenonDescriptionCellRenderer();
		}
		return renderer;
	}

	@Override
	public CellEditor getCellEditor(AgileGrid agileGrid,
			EditingDomain editingDomain) {
		return null;
	}

	@Override
	public boolean canEdit() {
		return false;
	}

	@Override
	public String getLabel(AttributeValue av) {
		RodinService service = RodinService.getRodinService(av.eResource());
		
		EventBObject element = service.getRodinManager().getElementForId(
				((AttributeValueSimple) av).getTheValue());

		return RodinService.elementLabel(element);
	}

} //PhenomenonDescriptorConfigurationImpl
