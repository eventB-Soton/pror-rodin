/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pror.presentation.wrspm.impl;

import de.itemis.rif12.ExchangeFile.AttributeValue;
import de.itemis.rif12.ExchangeFile.DatatypeDefinitionString;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.CellEditor;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.edit.domain.EditingDomain;

import org.pror.presentation.wrspm.WRSPMConfiguration;
import org.pror.presentation.wrspm.WrspmPackage;

import org.pror.ui.api.IProrCellRenderer;
import org.pror.ui.impl.ProRPresentationConfigurationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WRSPM Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pror.presentation.wrspm.impl.WRSPMConfigurationImpl#getIdType <em>Id Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WRSPMConfigurationImpl extends ProRPresentationConfigurationImpl implements WRSPMConfiguration {
	/**
	 * The cached value of the '{@link #getIdType() <em>Id Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdType()
	 * @generated
	 * @ordered
	 */
	protected DatatypeDefinitionString idType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WRSPMConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrspmPackage.Literals.WRSPM_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeDefinitionString getIdType() {
		if (idType != null && idType.eIsProxy()) {
			InternalEObject oldIdType = (InternalEObject)idType;
			idType = (DatatypeDefinitionString)eResolveProxy(oldIdType);
			if (idType != oldIdType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WrspmPackage.WRSPM_CONFIGURATION__ID_TYPE, oldIdType, idType));
			}
		}
		return idType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeDefinitionString basicGetIdType() {
		return idType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdType(DatatypeDefinitionString newIdType) {
		DatatypeDefinitionString oldIdType = idType;
		idType = newIdType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrspmPackage.WRSPM_CONFIGURATION__ID_TYPE, oldIdType, idType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WrspmPackage.WRSPM_CONFIGURATION__ID_TYPE:
				if (resolve) return getIdType();
				return basicGetIdType();
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
			case WrspmPackage.WRSPM_CONFIGURATION__ID_TYPE:
				setIdType((DatatypeDefinitionString)newValue);
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
			case WrspmPackage.WRSPM_CONFIGURATION__ID_TYPE:
				setIdType((DatatypeDefinitionString)null);
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
			case WrspmPackage.WRSPM_CONFIGURATION__ID_TYPE:
				return idType != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public IProrCellRenderer getCellRenderer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLabel(AttributeValue av) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CellEditor getCellEditor(AgileGrid agileGrid,
			EditingDomain editingDomain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canEdit() {
		// TODO Auto-generated method stub
		return false;
	}

} //WRSPMConfigurationImpl
