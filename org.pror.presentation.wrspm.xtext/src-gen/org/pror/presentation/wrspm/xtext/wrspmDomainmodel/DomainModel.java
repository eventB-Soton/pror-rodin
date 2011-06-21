/**
 * <copyright>
 * </copyright>
 *
 */
package org.pror.presentation.wrspm.xtext.wrspmDomainmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pror.presentation.wrspm.xtext.wrspmDomainmodel.DomainModel#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.WrspmDomainmodelPackage#getDomainModel()
 * @model
 * @generated
 */
public interface DomainModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.pror.presentation.wrspm.xtext.wrspmDomainmodel.Part}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.pror.presentation.wrspm.xtext.wrspmDomainmodel.WrspmDomainmodelPackage#getDomainModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Part> getElements();

} // DomainModel
