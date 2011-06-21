/**
 * 
 */
package org.pror.presentation.wrspm;

import org.pror.presentation.wrspm.xtext.ui.internal.WrspmDomainmodelActivator;
import org.pror.presentation.wrspm.xtext.wrspmDomainmodel.Definition;
import org.pror.presentation.wrspm.xtext.wrspmDomainmodel.WrspmDomainmodelFactory;

import com.google.inject.Injector;

import de.itemis.pror.presentation.xtext.core.AbstractXtextInjector;
import de.itemis.pror.presentation.xtext.core.IXtextInjector;

/**
 * @author jastram
 * 
 */
public class WrspmXtextInjector extends AbstractXtextInjector implements
		IXtextInjector {

	/**
	 * 
	 */
	public WrspmXtextInjector() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.itemis.pror.presentation.xtext.core.IXtextInjector#getInjector()
	 */
	@Override
	public Injector getInjector() {
		Injector injector = WrspmDomainmodelActivator.getInstance()
				.getInjector(getLanguage());
		Definition def = WrspmDomainmodelFactory.eINSTANCE.createDefinition();
		def.setName("inject");
		injector.injectMembers(def);
		return injector;
	}

}
