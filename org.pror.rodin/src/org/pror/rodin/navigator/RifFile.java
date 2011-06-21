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

import org.rodinp.core.IInternalElement;
import org.rodinp.core.IInternalElementType;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.RodinCore;
import org.rodinp.core.basis.InternalElement;

public class RifFile extends InternalElement {

	public static final IInternalElementType<RifFile> ELEMENT_TYPE = RodinCore
			.getInternalElementType("org.pror.rodin.RifFile");

	public RifFile(String arg0, IRodinElement arg1) {
		super(arg0, arg1);
	}

	@Override
	public IInternalElementType<? extends IInternalElement> getElementType() {
		return ELEMENT_TYPE;
	}

}
