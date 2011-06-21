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
package org.pror.rodin.navigator;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.rodinp.core.IRodinProject;
import org.rodinp.core.RodinCore;
import org.rodinp.core.RodinDBException;

public class ContentProvider implements ITreeContentProvider {

	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IProject) {
			IProject project = (IProject) parentElement;
			IRodinProject rodinProject = RodinCore.valueOf(project);
			if (rodinProject.exists()) {
				try {
					RifFile[] retValue = rodinProject
							.getRootElementsOfType(RifFile.ELEMENT_TYPE);
					return retValue;
				} catch (RodinDBException e) {
					e.printStackTrace();
				}
			}
		}
		return new Object[0];
	}

	public Object getParent(Object element) {
		return null;
	}

	public boolean hasChildren(Object element) {
		return getChildren(element).length > 0;
	}

	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	public void dispose() {
		// Do nothing
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// Do Nothing
	}

}
