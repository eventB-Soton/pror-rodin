/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pror.presentation.wrspm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.pror.presentation.wrspm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WrspmFactoryImpl extends EFactoryImpl implements WrspmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WrspmFactory init() {
		try {
			WrspmFactory theWrspmFactory = (WrspmFactory)EPackage.Registry.INSTANCE.getEFactory("http://pror.org/presentation/wrspm"); 
			if (theWrspmFactory != null) {
				return theWrspmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WrspmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrspmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WrspmPackage.WRSPM_CONFIGURATION: return createWRSPMConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WRSPMConfiguration createWRSPMConfiguration() {
		WRSPMConfigurationImpl wrspmConfiguration = new WRSPMConfigurationImpl();
		return wrspmConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrspmPackage getWrspmPackage() {
		return (WrspmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WrspmPackage getPackage() {
		return WrspmPackage.eINSTANCE;
	}

} //WrspmFactoryImpl
