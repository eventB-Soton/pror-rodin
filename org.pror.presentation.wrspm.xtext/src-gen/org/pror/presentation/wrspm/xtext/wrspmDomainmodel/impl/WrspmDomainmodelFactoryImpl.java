/**
 * <copyright>
 * </copyright>
 *
 */
package org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.pror.presentation.wrspm.xtext.wrspmDomainmodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WrspmDomainmodelFactoryImpl extends EFactoryImpl implements WrspmDomainmodelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static WrspmDomainmodelFactory init()
  {
    try
    {
      WrspmDomainmodelFactory theWrspmDomainmodelFactory = (WrspmDomainmodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.pror.org/presentation/wrspm/xtext/WrspmDomainmodel"); 
      if (theWrspmDomainmodelFactory != null)
      {
        return theWrspmDomainmodelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new WrspmDomainmodelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WrspmDomainmodelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case WrspmDomainmodelPackage.DOMAIN_MODEL: return createDomainModel();
      case WrspmDomainmodelPackage.PART: return createPart();
      case WrspmDomainmodelPackage.ANY_TEXT: return createAnyText();
      case WrspmDomainmodelPackage.ENTITY: return createEntity();
      case WrspmDomainmodelPackage.DEFINITION: return createDefinition();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainModel createDomainModel()
  {
    DomainModelImpl domainModel = new DomainModelImpl();
    return domainModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Part createPart()
  {
    PartImpl part = new PartImpl();
    return part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyText createAnyText()
  {
    AnyTextImpl anyText = new AnyTextImpl();
    return anyText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition createDefinition()
  {
    DefinitionImpl definition = new DefinitionImpl();
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WrspmDomainmodelPackage getWrspmDomainmodelPackage()
  {
    return (WrspmDomainmodelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static WrspmDomainmodelPackage getPackage()
  {
    return WrspmDomainmodelPackage.eINSTANCE;
  }

} //WrspmDomainmodelFactoryImpl
