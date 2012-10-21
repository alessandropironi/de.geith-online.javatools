package de.og.batterycreator.creators.batt;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class BubbleCreator extends AbstractIconCreator {

	protected static String name = "BubbleBattery";

	public BubbleCreator() {
		super();
		stylSettings.setFontXOffset(-1);
		// stylSettings.setStrokewidth(3);
	}

	@Override
	public boolean supportsStrokeWidth() {
		return true;
	}

	@Override
	public boolean supportsFlip() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.og.creators.AbstractCreator#createImage(int, boolean)
	 */
	@Override
	public ImageIcon createImage(final int percentage, final boolean charge) {

		// Create a graphics contents on the buffered image
		BufferedImage img = new BufferedImage(40, 40, BufferedImage.TYPE_INT_ARGB);
		final Graphics2D g2d = initGrafics2D(img);

		g2d.setColor(stylSettings.getIconColorInActiv());
		g2d.fillArc(0, 0, 40, 40, 0, 360);

		final Color col = stylSettings.getActivIconColor(percentage, charge);
		g2d.setXORMode(col);

		int strokew = 0;
		if (stylSettings.isFlip()) {
			strokew = stylSettings.getStrokewidth();
		}

		final int h = Math.round((40 - strokew) / 100f * percentage);
		final int y = img.getHeight() - strokew - h;
		g2d.fillRect(0, y, 40, h);

		g2d.setPaintMode();
		if (stylSettings.isFlip()) {
			g2d.setColor(stylSettings.getActivIconColor(percentage));
			final int arcx = Math.round(strokew / 2);
			final int arcy = Math.round(strokew / 2);
			final int arcw = 40 - strokew;
			final int arch = 40 - strokew;
			g2d.drawArc(arcx, arcy, arcw, arch, 0, 360);
		}
		drawPercentage(g2d, percentage, charge, img);

		// Filewriting
		img = writeFile(percentage, charge, img);
		return new ImageIcon(img);
	}

	@Override
	public String toString() {
		return name;
	}
}