
package org.pror.presentation.wrspm.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class WrspmDomainmodelStandaloneSetup extends WrspmDomainmodelStandaloneSetupGenerated{

	public static void doSetup() {
		new WrspmDomainmodelStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

