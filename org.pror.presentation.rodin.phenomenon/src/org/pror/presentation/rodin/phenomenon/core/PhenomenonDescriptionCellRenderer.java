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

import java.io.File;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eventb.emf.core.EventBNamedCommentedPredicateElement;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;
import org.eventb.emf.core.machine.Parameter;
import org.pror.ui.api.IProrCellRenderer;

import de.itemis.rif12.ExchangeFile.AttributeValueSimple;

public class PhenomenonDescriptionCellRenderer implements IProrCellRenderer {

	private static final Color LABEL_COLOR = Display.getDefault()
			.getSystemColor(SWT.COLOR_BLUE);
	private static final Color DEFAULT_COLOR = Display.getDefault()
			.getSystemColor(SWT.COLOR_WIDGET_FOREGROUND);

	@Override
	public int doDrawCellContent(GC gc, Rectangle rect, Object value) {
		if (! (value instanceof AttributeValueSimple)) {
			return 18;
		}
		AttributeValueSimple av = (AttributeValueSimple) value;
		RodinService service = RodinService.getRodinService(av.eResource());
		
		EventBObject element = service.getRodinManager().getElementForId(
				av.getTheValue());

		if (element instanceof EventBNamedCommentedPredicateElement) {
			String label = RodinService.elementLabel(element);
			gc.setForeground(LABEL_COLOR);
			gc.drawText(label, rect.x + 2, rect.y + 2);
			gc.setForeground(DEFAULT_COLOR);
			EventBNamedCommentedPredicateElement e = (EventBNamedCommentedPredicateElement) element;
			String detail = ": " + e.getPredicate();
			gc.drawText(detail, rect.x + 2 + gc.textExtent(label).x, rect.y + 2);
			return gc.textExtent(label + detail).y + 4;
		} else if (element instanceof Event) {
			Event e = (Event) element;
			String detail = renderEvent(e);
			gc.drawText(detail, rect.x + 2, rect.y + 2);
			return gc.textExtent(detail).y + 4;
		} else {
			String label = RodinService.elementLabel(element);
			gc.setForeground(LABEL_COLOR);
			gc.drawText(label, rect.x + 2, rect.y + 2);
			return gc.textExtent(label).y + 4;

		}
	}

	@Override
	public String doDrawHtmlContent(Object value, File folder) {
		AttributeValueSimple av = (AttributeValueSimple) value;
		RodinService service = RodinService.getRodinService(av.eResource());

		EventBObject element = service.getRodinManager().getElementForId(
				av.getTheValue());
		StringBuilder sb = new StringBuilder();

		if (element instanceof EventBNamedCommentedPredicateElement) {
			String label = RodinService.elementLabel(element);
			sb.append("<b>" + label + ":</b> ");
			EventBNamedCommentedPredicateElement e = (EventBNamedCommentedPredicateElement) element;
			sb.append(e.getPredicate());
			return sb.toString();
		} else if (element instanceof Event) {
			Event e = (Event) element;
			return "<pre>" + renderEvent(e) + "</pre>";
		} else {
			String label = RodinService.elementLabel(element);
			return label;
		}
	}

	private String renderEvent(Event event) {
		StringBuffer sb = new StringBuffer();
		sb.append("event ");
		sb.append(event.getName());
		sb.append("\n");

		if (event.getParameters().size() > 0) {
			sb.append("  any ");
			for (Parameter parameter : event.getParameters()) {
				sb.append(parameter.getName());
				sb.append(" ");
			}
			sb.append("\n");

		}

		if (event.getGuards().size() > 0) {
			sb.append("  where\n");
			for (Guard guard : event.getGuards()) {
				sb.append("    @");
				sb.append(guard.getName());
				sb.append(" ");
				sb.append(guard.getPredicate());
				sb.append("\n");
			}
		}

		if (event.getActions().size() > 0) {
			sb.append("  then\n");
			for (Action action : event.getActions()) {
				sb.append("    @");
				sb.append(action.getName());
				sb.append(" ");
				sb.append(action.getAction());
				sb.append("\n");
			}
		}
		sb.append("end");
		return sb.toString();
	}

}
