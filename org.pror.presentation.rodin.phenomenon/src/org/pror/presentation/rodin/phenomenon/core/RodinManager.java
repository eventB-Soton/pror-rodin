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
package org.pror.presentation.rodin.phenomenon.core;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eventb.emf.core.Annotation;
import org.eventb.emf.core.EventBNamed;
import org.eventb.emf.core.EventBObject;

public class RodinManager {

	private final Map<String, KeywordInfo> keywordMap = new HashMap<String, KeywordInfo>();
	private final Map<String, EventBObject> idMap = new HashMap<String, EventBObject>();
	private final RodinService rodinService;

	public RodinManager(RodinService rodinService) {
		this.rodinService = rodinService;
		updateRodinMaps();
		registerKeywordUpdater();
	}

	/**
	 * Rebuilds the Keyword map.
	 */
	private void updateRodinMaps() {
		keywordMap.clear();
		idMap.clear();
		for (TreeIterator<Object> i = EcoreUtil.getAllContents(
				rodinService.getRodinProject(), false); i.hasNext();) {
			Object obj = i.next();
			if (obj instanceof EventBNamed) {
				EventBNamed eventBNamed = (EventBNamed) obj;
				keywordMap.put(eventBNamed.getName(), new KeywordInfo(
						eventBNamed));

			}
			if (obj instanceof EventBObject) {
				EventBObject element = (EventBObject) obj;
				Annotation rodinAnnotation = element
						.getAnnotation("http:///org/eventb/core/RodinInternalAnnotations");
				if (rodinAnnotation != null) {
					String rodinId = rodinAnnotation.getDetails().get("name");
					if (rodinId != null) {
						idMap.put(rodinId, element);
					}
				}
			}
		}
	}

	public Collection<String> getKeywords() {
		return keywordMap.keySet();
	}

	public EventBNamed getEventBNamedForKeyword(String keyword) {
		return keywordMap.get(keyword).getEventBNamed();
	}

	public EventBObject getElementForId(String id) {
		return idMap.get(id);
	}

	/**
	 * Registers a Listener on the Workspace. TODO there must be a better way to
	 * do this. This way, we are listening to far too much!
	 */
	private void registerKeywordUpdater() {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(
				new IResourceChangeListener() {
					@Override
					public void resourceChanged(IResourceChangeEvent event) {
						updateRodinMaps();
					}
				});
	}

	private class KeywordInfo {
		private final EventBNamed eventBNamed;

		public KeywordInfo(EventBNamed eventBNamed) {
			this.eventBNamed = eventBNamed;
		}

		public EventBNamed getEventBNamed() {
			return eventBNamed;
		}
	}

}
