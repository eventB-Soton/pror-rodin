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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.pror.presentation.rodin.phenomenon.PhenomenonDescriptorConfiguration;
import org.pror.presentation.rodin.phenomenon.PhenomenonFactory;
import org.pror.presentation.rodin.phenomenon.PhenomenonHighlightConfiguration;
import org.pror.presentation.rodin.phenomenon.PhenomenonPackage;
import org.pror.presentation.rodin.phenomenon.util.PhenomenonValidator;
import org.pror.ui.UIPackage;

import de.itemis.rif12.DataTypes.DataTypesPackage;
import de.itemis.rif12.EA_AUTOSARM2_Types_Package.EA_AUTOSARM2_Types_PackagePackage;
import de.itemis.rif12.ExchangeFile.ExchangeFilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhenomenonPackageImpl extends EPackageImpl implements PhenomenonPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phenomenonHighlightConfigurationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phenomenonDescriptorConfigurationEClass = null;
	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.pror.presentation.rodin.phenomenon.PhenomenonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PhenomenonPackageImpl() {
		super(eNS_URI, PhenomenonFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PhenomenonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PhenomenonPackage init() {
		if (isInited) return (PhenomenonPackage)EPackage.Registry.INSTANCE.getEPackage(PhenomenonPackage.eNS_URI);

		// Obtain or create and register package
		PhenomenonPackageImpl thePhenomenonPackage = (PhenomenonPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PhenomenonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PhenomenonPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UIPackage.eINSTANCE.eClass();
		ExchangeFilePackage.eINSTANCE.eClass();
		DataTypesPackage.eINSTANCE.eClass();
		EA_AUTOSARM2_Types_PackagePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePhenomenonPackage.createPackageContents();

		// Initialize created meta-data
		thePhenomenonPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePhenomenonPackage, 
			 new EValidator.Descriptor() {
				 @Override
				public EValidator getEValidator() {
					 return PhenomenonValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePhenomenonPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PhenomenonPackage.eNS_URI, thePhenomenonPackage);
		return thePhenomenonPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhenomenonHighlightConfiguration() {
		return phenomenonHighlightConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhenomenonDescriptorConfiguration() {
		return phenomenonDescriptorConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPhenomenonDescriptorConfiguration_SpecType() {
		return (EReference)phenomenonDescriptorConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhenomenonFactory getPhenomenonFactory() {
		return (PhenomenonFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		phenomenonHighlightConfigurationEClass = createEClass(PHENOMENON_HIGHLIGHT_CONFIGURATION);

		phenomenonDescriptorConfigurationEClass = createEClass(PHENOMENON_DESCRIPTOR_CONFIGURATION);
		createEReference(phenomenonDescriptorConfigurationEClass, PHENOMENON_DESCRIPTOR_CONFIGURATION__SPEC_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UIPackage theUIPackage = (UIPackage)EPackage.Registry.INSTANCE.getEPackage(UIPackage.eNS_URI);
		ExchangeFilePackage theExchangeFilePackage = (ExchangeFilePackage)EPackage.Registry.INSTANCE.getEPackage(ExchangeFilePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		phenomenonHighlightConfigurationEClass.getESuperTypes().add(theUIPackage.getProRPresentationConfiguration());
		phenomenonDescriptorConfigurationEClass.getESuperTypes().add(theUIPackage.getProRPresentationConfiguration());

		// Initialize classes and features; add operations and parameters
		initEClass(phenomenonHighlightConfigurationEClass, PhenomenonHighlightConfiguration.class, "PhenomenonHighlightConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(phenomenonDescriptorConfigurationEClass, PhenomenonDescriptorConfiguration.class, "PhenomenonDescriptorConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhenomenonDescriptorConfiguration_SpecType(), theExchangeFilePackage.getSpecType(), null, "specType", null, 1, 1, PhenomenonDescriptorConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(phenomenonDescriptorConfigurationEClass, ecorePackage.getEBoolean(), "isConfiguredCorrectly", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PhenomenonPackageImpl
