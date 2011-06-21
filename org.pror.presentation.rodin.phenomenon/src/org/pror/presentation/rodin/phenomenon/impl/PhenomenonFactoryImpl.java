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
package org.pror.presentation.rodin.phenomenon.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.pror.presentation.rodin.phenomenon.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhenomenonFactoryImpl extends EFactoryImpl implements PhenomenonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PhenomenonFactory init() {
		try {
			PhenomenonFactory thePhenomenonFactory = (PhenomenonFactory)EPackage.Registry.INSTANCE.getEFactory("http://pror.org/presentation/phenomenon"); 
			if (thePhenomenonFactory != null) {
				return thePhenomenonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PhenomenonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhenomenonFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PhenomenonPackage.PHENOMENON_HIGHLIGHT_CONFIGURATION: return createPhenomenonHighlightConfiguration();
			case PhenomenonPackage.PHENOMENON_DESCRIPTOR_CONFIGURATION: return createPhenomenonDescriptorConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhenomenonHighlightConfiguration createPhenomenonHighlightConfiguration() {
		PhenomenonHighlightConfigurationImpl phenomenonHighlightConfiguration = new PhenomenonHighlightConfigurationImpl();
		return phenomenonHighlightConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhenomenonDescriptorConfiguration createPhenomenonDescriptorConfiguration() {
		PhenomenonDescriptorConfigurationImpl phenomenonDescriptorConfiguration = new PhenomenonDescriptorConfigurationImpl();
		return phenomenonDescriptorConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhenomenonPackage getPhenomenonPackage() {
		return (PhenomenonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PhenomenonPackage getPackage() {
		return PhenomenonPackage.eINSTANCE;
	}

} //PhenomenonFactoryImpl
