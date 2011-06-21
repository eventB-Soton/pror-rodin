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

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.pror.rodin.Activator;
import org.rodinp.core.IInternalElement;

public class LabelProvider implements ILabelProvider {

	private Image image;

	@Override
	public Image getImage(Object arg0) {
		if (arg0 instanceof RifFile) {
			if (image == null) {
				ImageDescriptor img = Activator.imageDescriptorFromPlugin(
						"org.pror.ui", "icons/full/obj16/RIF.png");
				image = img.createImage();
			}
		}
		return image;
	}

	@Override
	public String getText(Object element) {
		if (element instanceof IInternalElement) {
			return ((IInternalElement) element).getRodinFile().getResource()
					.getName();
		}
		return null;
	}

	@Override
	public void addListener(ILabelProviderListener arg0) {
		// Do nothing
	}

	@Override
	public void dispose() {
		if (image != null) {
			image.dispose();
			image = null;
		}
	}

	@Override
	public boolean isLabelProperty(Object arg0, String arg1) {
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener arg0) {
		// Do nothing
	}

}
