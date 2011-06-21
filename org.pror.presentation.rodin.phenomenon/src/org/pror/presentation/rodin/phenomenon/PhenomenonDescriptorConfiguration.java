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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.pror.ui.ProRPresentationConfiguration;

import de.itemis.rif12.ExchangeFile.SpecHierarchyRoot;
import de.itemis.rif12.ExchangeFile.SpecType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Descriptor Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pror.presentation.rodin.phenomenon.PhenomenonDescriptorConfiguration#getSpecType <em>Spec Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pror.presentation.rodin.phenomenon.PhenomenonPackage#getPhenomenonDescriptorConfiguration()
 * @model
 * @generated
 */
public interface PhenomenonDescriptorConfiguration extends ProRPresentationConfiguration {
	/**
	 * Returns the value of the '<em><b>Spec Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Type</em>' reference.
	 * @see #setSpecType(SpecType)
	 * @see org.pror.presentation.rodin.phenomenon.PhenomenonPackage#getPhenomenonDescriptorConfiguration_SpecType()
	 * @model required="true"
	 * @generated
	 */
	SpecType getSpecType();

	/**
	 * Sets the value of the '{@link org.pror.presentation.rodin.phenomenon.PhenomenonDescriptorConfiguration#getSpecType <em>Spec Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec Type</em>' reference.
	 * @see #getSpecType()
	 * @generated
	 */
	void setSpecType(SpecType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isConfiguredCorrectly(DiagnosticChain diagnostics, Map<?, ?> context);

} // PhenomenonDescriptorConfiguration
