package de.og.batterycreator.gui.widgets;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class RawIconSetSelector extends IconSetSelector {
	private static final long serialVersionUID = 8786275103326131451L;
	private final JLabel attention = new JLabel();

	public RawIconSetSelector(final String setTypeName, final String rootDir) {
		super(setTypeName, rootDir);
		initGUI();
	}

	private void initGUI() {
		attention.setText(createLableHtml());
		attention.setBorder(new EmptyBorder(5, 5, 5, 5));
		final JPanel p = new JPanel(new BorderLayout());
		p.add(attention, BorderLayout.CENTER);
		getOverviewPanel().add(p, BorderLayout.EAST);

	}

	private String createLableHtml() {
		String html = "<html>";

		html += "<font size=5 color=red>";
		html += "<b>" + "Attention !!" + "</b><br><hr>";
		html += "</font>";

		html += "<font size=2 color=black>";
		html += "These iconsets are added to the flashable zip as they are!<br>";
		html += "There will be: <br>";
		html += "- no resizing<br>";
		html += "- no file (re-)nameing<br>";
		html += "- no checks whatsoever!<br><br>";
		html += "<b>You (!) need to make sure everything fits your ROM!!!</b><br>";
		html += "<hr>";
		html += "</font>";

		html += "</html>";
		return html;
	}

}
