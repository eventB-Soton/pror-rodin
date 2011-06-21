/**
 * <copyright>
 * </copyright>
 *
 */
package org.pror.presentation.wrspm.xtext.wrspmDomainmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.WrspmDomainmodelPackage
 * @generated
 */
public interface WrspmDomainmodelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WrspmDomainmodelFactory eINSTANCE = org.pror.presentation.wrspm.xtext.wrspmDomainmodel.impl.WrspmDomainmodelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Domain Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domain Model</em>'.
   * @generated
   */
  DomainModel createDomainModel();

  /**
   * Returns a new object of class '<em>Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Part</em>'.
   * @generated
   */
  Part createPart();

  /**
   * Returns a new object of class '<em>Any Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Any Text</em>'.
   * @generated
   */
  AnyText createAnyText();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Definition</em>'.
   * @generated
   */
  Definition createDefinition();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  WrspmDomainmodelPackage getWrspmDomainmodelPackage();

} //WrspmDomainmodelFactory
