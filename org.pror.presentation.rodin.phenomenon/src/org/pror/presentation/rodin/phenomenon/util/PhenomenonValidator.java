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
package org.pror.presentation.rodin.phenomenon.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.pror.presentation.rodin.phenomenon.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.pror.presentation.rodin.phenomenon.PhenomenonPackage
 * @generated
 */
public class PhenomenonValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PhenomenonValidator INSTANCE = new PhenomenonValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.pror.presentation.rodin.phenomenon";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Is Configured Correctly' of 'Descriptor Configuration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PHENOMENON_DESCRIPTOR_CONFIGURATION__IS_CONFIGURED_CORRECTLY = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhenomenonValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PhenomenonPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case PhenomenonPackage.PHENOMENON_HIGHLIGHT_CONFIGURATION:
				return validatePhenomenonHighlightConfiguration((PhenomenonHighlightConfiguration)value, diagnostics, context);
			case PhenomenonPackage.PHENOMENON_DESCRIPTOR_CONFIGURATION:
				return validatePhenomenonDescriptorConfiguration((PhenomenonDescriptorConfiguration)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhenomenonHighlightConfiguration(PhenomenonHighlightConfiguration phenomenonHighlightConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(phenomenonHighlightConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhenomenonDescriptorConfiguration(PhenomenonDescriptorConfiguration phenomenonDescriptorConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(phenomenonDescriptorConfiguration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(phenomenonDescriptorConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(phenomenonDescriptorConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(phenomenonDescriptorConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(phenomenonDescriptorConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(phenomenonDescriptorConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(phenomenonDescriptorConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(phenomenonDescriptorConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(phenomenonDescriptorConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validatePhenomenonDescriptorConfiguration_isConfiguredCorrectly(phenomenonDescriptorConfiguration, diagnostics, context);
		return result;
	}

	/**
	 * Validates the isConfiguredCorrectly constraint of '<em>Descriptor Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhenomenonDescriptorConfiguration_isConfiguredCorrectly(PhenomenonDescriptorConfiguration phenomenonDescriptorConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return phenomenonDescriptorConfiguration.isConfiguredCorrectly(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PhenomenonValidator
