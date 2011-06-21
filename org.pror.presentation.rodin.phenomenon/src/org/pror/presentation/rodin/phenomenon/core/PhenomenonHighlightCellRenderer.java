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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eventb.emf.core.EventBNamed;
import org.eventb.emf.core.EventBNamedCommentedComponentElement;
import org.eventb.emf.core.context.Axiom;
import org.eventb.emf.core.context.CarrierSet;
import org.eventb.emf.core.context.Constant;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.Variable;
import org.pror.presentation.linewrap.core.LinewrapCellRenderer;

/**
 * This Presentation monitors the Event-B model and highlights phenomena from
 * the model in the text.
 * 
 * @author jastram
 * 
 */
public class PhenomenonHighlightCellRenderer extends LinewrapCellRenderer {

	private RodinService rodinService;

	public void setRodinService(RodinService rodinService) {
		this.rodinService = rodinService;
	}

	@Override
	public int doDrawCellContent(GC gc, Rectangle rect, Object value) {
		String text = getText(value, gc, rect.width);
		List<TextBlock> textBlocks = getTextBlocks(text);
		return drawTextBlocks(gc, rect, textBlocks);
	}

	private int drawTextBlocks(GC gc, Rectangle rect, List<TextBlock> textBlocks) {
		int x = 1;
		int y = 1;
		int lastHeight = 0;
		for (TextBlock textBlock : textBlocks) {
			textBlock.style.setStyle(gc);
			gc.drawText(textBlock.text, x + rect.x, y + rect.y);
			Point extend = gc.textExtent(textBlock.text);
			x += extend.x;
			lastHeight = extend.y;
			if (textBlock.text.equals("\n")
					|| textBlock.text.equals("\r")) {
				y += gc.textExtent("x").y;
				x = 1;
			}

		}
		return y + lastHeight + 1;
	}

	private List<TextBlock> getTextBlocks(String text) {
		ArrayList<TextBlock> textblocks = new ArrayList<TextBlock>();
		StringTokenizer st = new StringTokenizer(text, "\n\r", true);
		
		while (st.hasMoreTokens()) {
			String line = st.nextToken();
			textblocks.addAll(getTextBlocksForLine(line));
		}
		return textblocks;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private List<TextBlock> getTextBlocksForLine(String line) {
		Collection<String> keywords = rodinService.getRodinManager()
				.getKeywords();

		// This List holds one text line in the beginning and only TextBlocks
		// when complete.
		ArrayList textblocks = new ArrayList();
		textblocks.add(line);

		// Iterate over the contents of textblocks, and start all over if we do
		// a substitution.
		mainloop:
		for (int i = 0; i < textblocks.size(); i++) {
			if (textblocks.get(i) instanceof TextBlock)
				continue;

			String section = (String) textblocks.get(i);

			for (String keyword : keywords) {
				int pos = section.indexOf(keyword);
				if (pos != -1) {
					// Cut out the keyword
					textblocks.remove(i);
					textblocks.addAll(i, cutOutKeyword(section, keyword, pos));
					i = -1;
					continue mainloop;
				}
			}
			// No keywords: Convert the section into a Block
			textblocks.remove(i);
			textblocks.add(i, new TextBlock(section, Style.NORMAL));
		}
		return textblocks;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private List cutOutKeyword(String line, String keyword, int pos) {
		int length = keyword.length();

		Style style;

		// Is keyword surrounded by []?
		if (pos > 0 && line.charAt(pos - 1) == '['
				&& pos + length < line.length()
				&& line.charAt(pos + length) == ']') {
			pos--;
			length = length + 2;
			style = Style.getStyleFor(rodinService.getRodinManager()
					.getEventBNamedForKeyword(keyword));
		} else {
			// TODO hack to ignore irrelevant keywords.
			style = Style.getStyleFor(rodinService.getRodinManager()
					.getEventBNamedForKeyword(keyword));
			style = style == Style.NORMAL ? Style.NORMAL : Style.UNMARKED;
		}

		List result = new ArrayList();
		String segment1 = line.substring(0, pos);
		TextBlock segment2 = new TextBlock(line.substring(pos, length + pos),
				style);
		String segment3 = line.substring(pos + length);
		if (segment1.length() > 0)
			result.add(segment1);
		result.add(segment2);
		if (segment3.length() > 0)
			result.add(segment3);
		return result;
	}


	enum Style {
		NORMAL {
			@Override
			void setStyle(GC gc) {
				gc.setForeground(getColor(SWT.COLOR_BLACK));
			}
		},
		MARKED_PHENOMENON {
			@Override
			void setStyle(GC gc) {
				gc.setForeground(getColor(SWT.COLOR_BLUE));
			}
		},
		MARKED_REQUIREMENT {
			@Override
			void setStyle(GC gc) {
				gc.setForeground(getColor(SWT.COLOR_GREEN));
			}
		},
		MARKED_EVENT {
			@Override
			void setStyle(GC gc) {
				gc.setForeground(getColor(SWT.COLOR_DARK_YELLOW));
			}
		},
		MARKED_SYSTEM {
			@Override
			void setStyle(GC gc) {
				gc.setForeground(getColor(SWT.COLOR_DARK_RED));
			}
		},
		UNMARKED {
			@Override
			void setStyle(GC gc) {
				gc.setForeground(getColor(SWT.COLOR_RED));
			}
		};

		abstract void setStyle(GC gc);

		Color getColor(int colorCode) {
			return Display.getDefault().getSystemColor(colorCode);
		}

		static Style getStyleFor(EventBNamed eventBNamed) {
			if (eventBNamed instanceof Variable
					|| eventBNamed instanceof Constant
					|| eventBNamed instanceof CarrierSet) {
				return MARKED_PHENOMENON;
			}
			if (eventBNamed instanceof Event) {
				return Style.MARKED_EVENT;
			}
			if (eventBNamed instanceof EventBNamedCommentedComponentElement) {
				return Style.MARKED_SYSTEM;
			}
			if (eventBNamed instanceof Axiom
					|| eventBNamed instanceof Invariant) {
				return Style.MARKED_REQUIREMENT;
			}
			return Style.NORMAL;
		}
	}
	
	private class TextBlock {
		final String text;
		final Style style;

		public TextBlock(String text, Style style) {
			this.text = text;
			this.style = style;
		}

		@Override
		public String toString() {
			return "\"" + text + "\"";
		}
	}
	
}
