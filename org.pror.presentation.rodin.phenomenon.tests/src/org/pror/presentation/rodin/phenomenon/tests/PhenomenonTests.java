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
package org.pror.presentation.rodin.phenomenon.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>phenomenon</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhenomenonTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new PhenomenonTests("phenomenon Tests");
		suite.addTestSuite(PhenomenonDescriptorConfigurationTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhenomenonTests(String name) {
		super(name);
	}

} //PhenomenonTests
