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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pror.presentation.rodin.phenomenon.PhenomenonPackage
 * @generated
 */
public interface PhenomenonFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PhenomenonFactory eINSTANCE = org.pror.presentation.rodin.phenomenon.impl.PhenomenonFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Highlight Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Highlight Configuration</em>'.
	 * @generated
	 */
	PhenomenonHighlightConfiguration createPhenomenonHighlightConfiguration();

	/**
	 * Returns a new object of class '<em>Descriptor Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Descriptor Configuration</em>'.
	 * @generated
	 */
	PhenomenonDescriptorConfiguration createPhenomenonDescriptorConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PhenomenonPackage getPhenomenonPackage();

} //PhenomenonFactory
