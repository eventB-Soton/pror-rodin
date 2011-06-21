/**
 * <copyright>
 * </copyright>
 *
 */
package org.pror.presentation.wrspm.xtext.wrspmDomainmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pror.presentation.wrspm.xtext.wrspmDomainmodel.Entity#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.WrspmDomainmodelPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends Part
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(Definition)
   * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.WrspmDomainmodelPackage#getEntity_Ref()
   * @model
   * @generated
   */
  Definition getRef();

  /**
   * Sets the value of the '{@link org.pror.presentation.wrspm.xtext.wrspmDomainmodel.Entity#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Definition value);

} // Entity
