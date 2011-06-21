/**
 * <copyright>
 * </copyright>
 *
 */
package org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pror.presentation.wrspm.xtext.wrspmDomainmodel.AnyText;
import org.pror.presentation.wrspm.xtext.wrspmDomainmodel.Definition;
import org.pror.presentation.wrspm.xtext.wrspmDomainmodel.DomainModel;
import org.pror.presentation.wrspm.xtext.wrspmDomainmodel.Entity;
import org.pror.presentation.wrspm.xtext.wrspmDomainmodel.Part;
import org.pror.presentation.wrspm.xtext.wrspmDomainmodel.WrspmDomainmodelFactory;
import org.pror.presentation.wrspm.xtext.wrspmDomainmodel.WrspmDomainmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WrspmDomainmodelPackageImpl extends EPackageImpl implements WrspmDomainmodelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass partEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anyTextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definitionEClass = null;

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
   * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.WrspmDomainmodelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private WrspmDomainmodelPackageImpl()
  {
    super(eNS_URI, WrspmDomainmodelFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link WrspmDomainmodelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static WrspmDomainmodelPackage init()
  {
    if (isInited) return (WrspmDomainmodelPackage)EPackage.Registry.INSTANCE.getEPackage(WrspmDomainmodelPackage.eNS_URI);

    // Obtain or create and register package
    WrspmDomainmodelPackageImpl theWrspmDomainmodelPackage = (WrspmDomainmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WrspmDomainmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WrspmDomainmodelPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theWrspmDomainmodelPackage.createPackageContents();

    // Initialize created meta-data
    theWrspmDomainmodelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theWrspmDomainmodelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(WrspmDomainmodelPackage.eNS_URI, theWrspmDomainmodelPackage);
    return theWrspmDomainmodelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainModel()
  {
    return domainModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainModel_Elements()
  {
    return (EReference)domainModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPart()
  {
    return partEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnyText()
  {
    return anyTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnyText_Content()
  {
    return (EAttribute)anyTextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_Ref()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefinition()
  {
    return definitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefinition_Name()
  {
    return (EAttribute)definitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WrspmDomainmodelFactory getWrspmDomainmodelFactory()
  {
    return (WrspmDomainmodelFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    domainModelEClass = createEClass(DOMAIN_MODEL);
    createEReference(domainModelEClass, DOMAIN_MODEL__ELEMENTS);

    partEClass = createEClass(PART);

    anyTextEClass = createEClass(ANY_TEXT);
    createEAttribute(anyTextEClass, ANY_TEXT__CONTENT);

    entityEClass = createEClass(ENTITY);
    createEReference(entityEClass, ENTITY__REF);

    definitionEClass = createEClass(DEFINITION);
    createEAttribute(definitionEClass, DEFINITION__NAME);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    anyTextEClass.getESuperTypes().add(this.getPart());
    entityEClass.getESuperTypes().add(this.getPart());
    definitionEClass.getESuperTypes().add(this.getPart());

    // Initialize classes and features; add operations and parameters
    initEClass(domainModelEClass, DomainModel.class, "DomainModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDomainModel_Elements(), this.getPart(), null, "elements", null, 0, -1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(partEClass, Part.class, "Part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(anyTextEClass, AnyText.class, "AnyText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAnyText_Content(), ecorePackage.getEString(), "content", null, 0, 1, AnyText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntity_Ref(), this.getDefinition(), null, "ref", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //WrspmDomainmodelPackageImpl
