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

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.pror.presentation.rodin.phenomenon.PhenomenonDescriptorConfiguration;
import org.pror.presentation.rodin.phenomenon.PhenomenonFactory;

import de.itemis.rif12.ExchangeFile.AttributeDefinitionSimple;
import de.itemis.rif12.ExchangeFile.DatatypeDefinitionString;
import de.itemis.rif12.ExchangeFile.ExchangeFileFactory;
import de.itemis.rif12.ExchangeFile.SpecType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Descriptor Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.pror.presentation.rodin.phenomenon.PhenomenonDescriptorConfiguration#isConfiguredCorrectly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Is Configured Correctly</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PhenomenonDescriptorConfigurationTest extends TestCase {

	private final ExchangeFileFactory factory = ExchangeFileFactory.eINSTANCE;
	/**
	 * The fixture for this Descriptor Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhenomenonDescriptorConfiguration fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PhenomenonDescriptorConfigurationTest.class);
	}

	/**
	 * Constructs a new Descriptor Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhenomenonDescriptorConfigurationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Descriptor Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PhenomenonDescriptorConfiguration fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Descriptor Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhenomenonDescriptorConfiguration getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PhenomenonFactory.eINSTANCE.createPhenomenonDescriptorConfiguration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.pror.presentation.rodin.phenomenon.PhenomenonDescriptorConfiguration#isConfiguredCorrectly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Is Configured Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pror.presentation.rodin.phenomenon.PhenomenonDescriptorConfiguration#isConfiguredCorrectly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testIsConfiguredCorrectly__DiagnosticChain_Map() {
		PhenomenonDescriptorConfiguration config = getFixture();
		assertFalse(Diagnostic.OK == Diagnostician.INSTANCE.validate(config)
				.getSeverity());
	}

	public void testIsConfiguredCorrectlyTypeMissing() {
		PhenomenonDescriptorConfiguration config = getFixture();
		config.setSpecType(factory.createSpecType());
		assertFalse(Diagnostic.OK == Diagnostician.INSTANCE.validate(config)
				.getSeverity());
	}

	public void testIsConfiguredCorrectlySpecObjectTypeMissing() {
		PhenomenonDescriptorConfiguration config = getFixture();
		config.setDatatype(factory.createDatatypeDefinitionString());
		assertFalse(Diagnostic.OK == Diagnostician.INSTANCE.validate(config)
				.getSeverity());
	}

	public void testIsConfiguredCorrectlySpecObjectTypeIncomplete() {
		PhenomenonDescriptorConfiguration config = getFixture();
		config.setDatatype(factory.createDatatypeDefinitionString());
		config.setSpecType(factory.createSpecType());
		assertFalse(Diagnostic.OK == Diagnostician.INSTANCE.validate(config)
				.getSeverity());
	}

	public void testIsConfiguredCorrectlyAllCorrect() {
		PhenomenonDescriptorConfiguration config = getFixture();
		DatatypeDefinitionString datatype = factory
				.createDatatypeDefinitionString();
		config.setDatatype(datatype);
		SpecType specObjectType = factory.createSpecType();
		AttributeDefinitionSimple ad = factory
				.createAttributeDefinitionSimple();
		ad.setType(datatype);
		specObjectType.getSpecAttributes().add(ad);
		config.setSpecType(specObjectType);
		assertTrue(Diagnostic.OK == Diagnostician.INSTANCE.validate(config)
				.getSeverity());
	}

} //PhenomenonDescriptorConfigurationTest
