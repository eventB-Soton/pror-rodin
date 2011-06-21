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
package org.pror.presentation.rodin.phenomenon;

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
 * @see org.pror.presentation.rodin.phenomenon.PhenomenonFactory
 * @model kind="package"
 * @generated
 */
public interface PhenomenonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "phenomenon";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://pror.org/presentation/phenomenon";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "phenomenon";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PhenomenonPackage eINSTANCE = org.pror.presentation.rodin.phenomenon.impl.PhenomenonPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pror.presentation.rodin.phenomenon.impl.PhenomenonHighlightConfigurationImpl <em>Highlight Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pror.presentation.rodin.phenomenon.impl.PhenomenonHighlightConfigurationImpl
	 * @see org.pror.presentation.rodin.phenomenon.impl.PhenomenonPackageImpl#getPhenomenonHighlightConfiguration()
	 * @generated
	 */
	int PHENOMENON_HIGHLIGHT_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHENOMENON_HIGHLIGHT_CONFIGURATION__DATATYPE = UIPackage.PRO_RPRESENTATION_CONFIGURATION__DATATYPE;

	/**
	 * The number of structural features of the '<em>Highlight Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHENOMENON_HIGHLIGHT_CONFIGURATION_FEATURE_COUNT = UIPackage.PRO_RPRESENTATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pror.presentation.rodin.phenomenon.impl.PhenomenonDescriptorConfigurationImpl <em>Descriptor Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pror.presentation.rodin.phenomenon.impl.PhenomenonDescriptorConfigurationImpl
	 * @see org.pror.presentation.rodin.phenomenon.impl.PhenomenonPackageImpl#getPhenomenonDescriptorConfiguration()
	 * @generated
	 */
	int PHENOMENON_DESCRIPTOR_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHENOMENON_DESCRIPTOR_CONFIGURATION__DATATYPE = UIPackage.PRO_RPRESENTATION_CONFIGURATION__DATATYPE;

	/**
	 * The feature id for the '<em><b>Spec Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHENOMENON_DESCRIPTOR_CONFIGURATION__SPEC_TYPE = UIPackage.PRO_RPRESENTATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Descriptor Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHENOMENON_DESCRIPTOR_CONFIGURATION_FEATURE_COUNT = UIPackage.PRO_RPRESENTATION_CONFIGURATION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.pror.presentation.rodin.phenomenon.PhenomenonHighlightConfiguration <em>Highlight Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Highlight Configuration</em>'.
	 * @see org.pror.presentation.rodin.phenomenon.PhenomenonHighlightConfiguration
	 * @generated
	 */
	EClass getPhenomenonHighlightConfiguration();

	/**
	 * Returns the meta object for class '{@link org.pror.presentation.rodin.phenomenon.PhenomenonDescriptorConfiguration <em>Descriptor Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptor Configuration</em>'.
	 * @see org.pror.presentation.rodin.phenomenon.PhenomenonDescriptorConfiguration
	 * @generated
	 */
	EClass getPhenomenonDescriptorConfiguration();

	/**
	 * Returns the meta object for the reference '{@link org.pror.presentation.rodin.phenomenon.PhenomenonDescriptorConfiguration#getSpecType <em>Spec Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Spec Type</em>'.
	 * @see org.pror.presentation.rodin.phenomenon.PhenomenonDescriptorConfiguration#getSpecType()
	 * @see #getPhenomenonDescriptorConfiguration()
	 * @generated
	 */
	EReference getPhenomenonDescriptorConfiguration_SpecType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PhenomenonFactory getPhenomenonFactory();

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
		 * The meta object literal for the '{@link org.pror.presentation.rodin.phenomenon.impl.PhenomenonHighlightConfigurationImpl <em>Highlight Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pror.presentation.rodin.phenomenon.impl.PhenomenonHighlightConfigurationImpl
		 * @see org.pror.presentation.rodin.phenomenon.impl.PhenomenonPackageImpl#getPhenomenonHighlightConfiguration()
		 * @generated
		 */
		EClass PHENOMENON_HIGHLIGHT_CONFIGURATION = eINSTANCE.getPhenomenonHighlightConfiguration();
		/**
		 * The meta object literal for the '{@link org.pror.presentation.rodin.phenomenon.impl.PhenomenonDescriptorConfigurationImpl <em>Descriptor Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pror.presentation.rodin.phenomenon.impl.PhenomenonDescriptorConfigurationImpl
		 * @see org.pror.presentation.rodin.phenomenon.impl.PhenomenonPackageImpl#getPhenomenonDescriptorConfiguration()
		 * @generated
		 */
		EClass PHENOMENON_DESCRIPTOR_CONFIGURATION = eINSTANCE.getPhenomenonDescriptorConfiguration();
		/**
		 * The meta object literal for the '<em><b>Spec Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHENOMENON_DESCRIPTOR_CONFIGURATION__SPEC_TYPE = eINSTANCE.getPhenomenonDescriptorConfiguration_SpecType();

	}

} //PhenomenonPackage
