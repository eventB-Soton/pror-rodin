/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pror.presentation.wrspm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pror.presentation.wrspm.WrspmPackage
 * @generated
 */
public interface WrspmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WrspmFactory eINSTANCE = org.pror.presentation.wrspm.impl.WrspmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>WRSPM Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WRSPM Configuration</em>'.
	 * @generated
	 */
	WRSPMConfiguration createWRSPMConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WrspmPackage getWrspmPackage();

} //WrspmFactory
