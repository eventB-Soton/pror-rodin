/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pror.presentation.wrspm;

import de.itemis.rif12.ExchangeFile.DatatypeDefinitionString;

import org.pror.ui.ProRPresentationConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WRSPM Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pror.presentation.wrspm.WRSPMConfiguration#getIdType <em>Id Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pror.presentation.wrspm.WrspmPackage#getWRSPMConfiguration()
 * @model
 * @generated
 */
public interface WRSPMConfiguration extends ProRPresentationConfiguration {
	/**
	 * Returns the value of the '<em><b>Id Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Type</em>' reference.
	 * @see #setIdType(DatatypeDefinitionString)
	 * @see org.pror.presentation.wrspm.WrspmPackage#getWRSPMConfiguration_IdType()
	 * @model required="true"
	 * @generated
	 */
	DatatypeDefinitionString getIdType();

	/**
	 * Sets the value of the '{@link org.pror.presentation.wrspm.WRSPMConfiguration#getIdType <em>Id Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Type</em>' reference.
	 * @see #getIdType()
	 * @generated
	 */
	void setIdType(DatatypeDefinitionString value);

} // WRSPMConfiguration
