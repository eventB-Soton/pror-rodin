package org.pror.presentation.rodin.phenomenon.core;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.pror.presentation.rodin.phenomenon.PhenomenonFactory;
import org.pror.presentation.rodin.phenomenon.PhenomenonHighlightConfiguration;
import org.pror.ui.ProRPresentationConfiguration;
import org.pror.ui.api.PresentationService;

import de.itemis.rif12.ExchangeFile.RIF;

/**
 * The content of the Attribute is parsed as a Java Property object
 * (name-value-pairs)
 * 
 * @author jastram
 * 
 */
public class PhenomenonHighlightService implements PresentationService {

	/**
	 * Hooks a listener in to make sure that the reqif is updated upon changes
	 * in the Event-B model.
	 * <p>
	 * 
	 */
	@Override
	public void openRIF(final RIF rif) {
	}

	@Override
	public Class<? extends ProRPresentationConfiguration> getConfigurationInterface() {
		return PhenomenonHighlightConfiguration.class;
	}

	@Override
	public ProRPresentationConfiguration getConfigurationInstance() {
		return PhenomenonFactory.eINSTANCE
				.createPhenomenonHighlightConfiguration();
	}

	@Override
	public Command handleDragAndDrop(Collection<?> source, Object target,
			EditingDomain editingDomain, int operation) {
		return null;
	}

}
