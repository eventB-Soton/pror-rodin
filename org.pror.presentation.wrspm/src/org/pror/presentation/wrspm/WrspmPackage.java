/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pror.presentation.wrspm;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.pror.ui.UIPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.pror.presentation.wrspm.WrspmFactory
 * @model kind="package"
 * @generated
 */
public interface WrspmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wrspm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://pror.org/presentation/wrspm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wrspm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WrspmPackage eINSTANCE = org.pror.presentation.wrspm.impl.WrspmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pror.presentation.wrspm.impl.WRSPMConfigurationImpl <em>WRSPM Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pror.presentation.wrspm.impl.WRSPMConfigurationImpl
	 * @see org.pror.presentation.wrspm.impl.WrspmPackageImpl#getWRSPMConfiguration()
	 * @generated
	 */
	int WRSPM_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRSPM_CONFIGURATION__DATATYPE = UIPackage.PRO_RPRESENTATION_CONFIGURATION__DATATYPE;

	/**
	 * The feature id for the '<em><b>Id Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRSPM_CONFIGURATION__ID_TYPE = UIPackage.PRO_RPRESENTATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WRSPM Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRSPM_CONFIGURATION_FEATURE_COUNT = UIPackage.PRO_RPRESENTATION_CONFIGURATION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.pror.presentation.wrspm.WRSPMConfiguration <em>WRSPM Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WRSPM Configuration</em>'.
	 * @see org.pror.presentation.wrspm.WRSPMConfiguration
	 * @generated
	 */
	EClass getWRSPMConfiguration();

	/**
	 * Returns the meta object for the reference '{@link org.pror.presentation.wrspm.WRSPMConfiguration#getIdType <em>Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Id Type</em>'.
	 * @see org.pror.presentation.wrspm.WRSPMConfiguration#getIdType()
	 * @see #getWRSPMConfiguration()
	 * @generated
	 */
	EReference getWRSPMConfiguration_IdType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WrspmFactory getWrspmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.pror.presentation.wrspm.impl.WRSPMConfigurationImpl <em>WRSPM Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pror.presentation.wrspm.impl.WRSPMConfigurationImpl
		 * @see org.pror.presentation.wrspm.impl.WrspmPackageImpl#getWRSPMConfiguration()
		 * @generated
		 */
		EClass WRSPM_CONFIGURATION = eINSTANCE.getWRSPMConfiguration();

		/**
		 * The meta object literal for the '<em><b>Id Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRSPM_CONFIGURATION__ID_TYPE = eINSTANCE.getWRSPMConfiguration_IdType();

	}

} //WrspmPackage
