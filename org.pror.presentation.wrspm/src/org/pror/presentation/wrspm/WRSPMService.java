package org.pror.presentation.wrspm;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.pror.ui.ProRPresentationConfiguration;
import org.pror.ui.api.PresentationService;

import de.itemis.rif12.ExchangeFile.RIF;

public class WRSPMService implements PresentationService {

	public WRSPMService() {
	}

	@Override
	public Class<? extends ProRPresentationConfiguration> getConfigurationInterface() {
		return WRSPMConfiguration.class;
	}

	@Override
	public ProRPresentationConfiguration getConfigurationInstance() {
		return WrspmFactory.eINSTANCE.createWRSPMConfiguration();	}

	@Override
	public void openRIF(RIF rif) {
	}

	@Override
	public Command handleDragAndDrop(Collection<?> source, Object target,
			EditingDomain editingDomain, int operation) {
		return null;
	}

}
