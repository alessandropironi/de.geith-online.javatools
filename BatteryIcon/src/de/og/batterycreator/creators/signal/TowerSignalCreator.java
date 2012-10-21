package de.og.batterycreator.creators.signal;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class TowerSignalCreator extends AbstractSignalCreator {

	public static String name = "TowerSignal";

	private static final int imgMitte = 19;
	private static final int imgWidth = 46;
	private static final int imgHeight = 41;
	private static final int height = 6;
	private static final int width = 7;
	private static final int stroke = 4;

	public TowerSignalCreator() {
	}

	@Override
	public ImageIcon createImage(final int level, final boolean fully) {
		// Create a graphics contents on the buffered image
		BufferedImage img = new BufferedImage(imgWidth, imgHeight, BufferedImage.TYPE_INT_ARGB);
		final Graphics2D g2d = initGrafics2D(img);
		g2d.setStroke(new BasicStroke(stroke));
		final int offsetunten = 12;
		for (int i = 4; i >= 0; i--) {
			Color col = getConnectColor(fully);
			final int x = imgMitte - (i * width);
			int y = offsetunten - ((1 + i) * height);
			final int w = width * (2 * i + 1);
			final int h = height * (2 * i + 1);
			if (i > level) {
				col = stylSettings.getIconColorInActiv();
			}
			if (level == NULL_LEVEL)
				col = stylSettings.getIconColorInActiv().darker().darker();
			g2d.setColor(stylSettings.getBackgroundColor());
			g2d.fillArc(x - 1, y - 1, w + 2, h + 2, -45, -90);
			g2d.setColor(col);
			g2d.fillArc(x, y, w, h, -45, -90);

			if (i == 0) {
				y = y - 2;
				g2d.setColor(stylSettings.getBackgroundColor());
				g2d.fillArc(x - 2, y - 2, w + 4, h + 4, 0, 360);
				g2d.setColor(col);
				g2d.fillArc(x - 1, y - 1, w + 2, h + 2, 0, 360);
			}
		}
		// Filewriting
		img = writeFile(getFileName(level, fully), img);
		return new ImageIcon(img);
	}

	@Override
	public ImageIcon createInOutImage(final boolean in, final boolean out) {
		// Create a graphics contents on the buffered image
		BufferedImage img = new BufferedImage(imgWidth, imgHeight, BufferedImage.TYPE_INT_ARGB);
		final Graphics2D g2d = initGrafics2D(img, true);

		final Rectangle rectin = new Rectangle(imgMitte - width + 1, height * 3 + 2, width * 3, height * 3);
		final Rectangle rectout = new Rectangle(imgMitte - width + 1, 1, width * 3, height * 3);
		if (in) {
			g2d.setColor(stylSettings.getInWifiColor());
			g2d.fillArc(rectin.x, rectin.y, rectin.width, rectin.height, 65, 50);
		}
		if (out) {
			g2d.setColor(stylSettings.getOutWifiColor());
			g2d.fillArc(rectout.x, rectout.y, rectout.width, rectout.height, -65, -50);
		}

		// Filewriting
		img = writeFile(getFileNameInOut(in, out), img);
		return new ImageIcon(img);
	}

	@Override
	public String toString() {
		return name;
	}

}