/**
 * <copyright>
 * </copyright>
 *
 */
package org.pror.presentation.wrspm.xtext.wrspmDomainmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.WrspmDomainmodelFactory
 * @model kind="package"
 * @generated
 */
public interface WrspmDomainmodelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "wrspmDomainmodel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.pror.org/presentation/wrspm/xtext/WrspmDomainmodel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "wrspmDomainmodel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WrspmDomainmodelPackage eINSTANCE = org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.WrspmDomainmodelPackageImpl.init();

  /**
   * The meta object id for the '{@link org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.DomainModelImpl <em>Domain Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.DomainModelImpl
   * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.WrspmDomainmodelPackageImpl#getDomainModel()
   * @generated
   */
  int DOMAIN_MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Domain Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.PartImpl <em>Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.PartImpl
   * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.WrspmDomainmodelPackageImpl#getPart()
   * @generated
   */
  int PART = 1;

  /**
   * The number of structural features of the '<em>Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.AnyTextImpl <em>Any Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.AnyTextImpl
   * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.WrspmDomainmodelPackageImpl#getAnyText()
   * @generated
   */
  int ANY_TEXT = 2;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_TEXT__CONTENT = PART_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Any Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_TEXT_FEATURE_COUNT = PART_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.EntityImpl
   * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.WrspmDomainmodelPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 3;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__REF = PART_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = PART_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.DefinitionImpl <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.DefinitionImpl
   * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.WrspmDomainmodelPackageImpl#getDefinition()
   * @generated
   */
  int DEFINITION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__NAME = PART_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_FEATURE_COUNT = PART_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.pror.presentation.wrspm.xtext.wrspmDomainmodel.DomainModel <em>Domain Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Model</em>'.
   * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.DomainModel
   * @generated
   */
  EClass getDomainModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.pror.presentation.wrspm.xtext.wrspmDomainmodel.DomainModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.DomainModel#getElements()
   * @see #getDomainModel()
   * @generated
   */
  EReference getDomainModel_Elements();

  /**
   * Returns the meta object for class '{@link org.pror.presentation.wrspm.xtext.wrspmDomainmodel.Part <em>Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Part</em>'.
   * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.Part
   * @generated
   */
  EClass getPart();

  /**
   * Returns the meta object for class '{@link org.pror.presentation.wrspm.xtext.wrspmDomainmodel.AnyText <em>Any Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Any Text</em>'.
   * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.AnyText
   * @generated
   */
  EClass getAnyText();

  /**
   * Returns the meta object for the attribute '{@link org.pror.presentation.wrspm.xtext.wrspmDomainmodel.AnyText#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.AnyText#getContent()
   * @see #getAnyText()
   * @generated
   */
  EAttribute getAnyText_Content();

  /**
   * Returns the meta object for class '{@link org.pror.presentation.wrspm.xtext.wrspmDomainmodel.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the reference '{@link org.pror.presentation.wrspm.xtext.wrspmDomainmodel.Entity#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.Entity#getRef()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Ref();

  /**
   * Returns the meta object for class '{@link org.pror.presentation.wrspm.xtext.wrspmDomainmodel.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition</em>'.
   * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.Definition
   * @generated
   */
  EClass getDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.pror.presentation.wrspm.xtext.wrspmDomainmodel.Definition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.Definition#getName()
   * @see #getDefinition()
   * @generated
   */
  EAttribute getDefinition_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  WrspmDomainmodelFactory getWrspmDomainmodelFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.DomainModelImpl <em>Domain Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.DomainModelImpl
     * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.WrspmDomainmodelPackageImpl#getDomainModel()
     * @generated
     */
    EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_MODEL__ELEMENTS = eINSTANCE.getDomainModel_Elements();

    /**
     * The meta object literal for the '{@link org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.PartImpl <em>Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.PartImpl
     * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.WrspmDomainmodelPackageImpl#getPart()
     * @generated
     */
    EClass PART = eINSTANCE.getPart();

    /**
     * The meta object literal for the '{@link org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.AnyTextImpl <em>Any Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.AnyTextImpl
     * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.WrspmDomainmodelPackageImpl#getAnyText()
     * @generated
     */
    EClass ANY_TEXT = eINSTANCE.getAnyText();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANY_TEXT__CONTENT = eINSTANCE.getAnyText_Content();

    /**
     * The meta object literal for the '{@link org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.EntityImpl
     * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.WrspmDomainmodelPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__REF = eINSTANCE.getEntity_Ref();

    /**
     * The meta object literal for the '{@link org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.DefinitionImpl <em>Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.DefinitionImpl
     * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.WrspmDomainmodelPackageImpl#getDefinition()
     * @generated
     */
    EClass DEFINITION = eINSTANCE.getDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINITION__NAME = eINSTANCE.getDefinition_Name();

  }

} //WrspmDomainmodelPackage
