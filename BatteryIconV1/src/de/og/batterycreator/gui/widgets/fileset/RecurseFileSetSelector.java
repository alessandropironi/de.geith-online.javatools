package de.og.batterycreator.gui.widgets.fileset;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileFilter;
import java.util.Vector;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.border.EmptyBorder;

import de.og.batterycreator.gui.iconstore.IconStore;
import de.og.batterycreator.gui.widgets.OverviewPanel;

public class RecurseFileSetSelector extends JComboBox<RecurseFileSet> {
	private static final long serialVersionUID = -2767025548199058416L;

	private final OverviewPanel overPane = new OverviewPanel();
	private final Vector<RecurseFileSet> sets = new Vector<RecurseFileSet>();
	private RecurseFileSet selectedSet;
	private final String rootDir = "./custom/XTRAS";
	private static final String NADA = "No XTRAS";
	private final JLabel attention = new JLabel();

	public RecurseFileSetSelector() {
		super();
		initUI();
	}

	/**
	 * @return the overviewPanel
	 */
	public JPanel getOverviewPanel() {
		return overPane;
	}

	private File[] findCustomDirs(final File dir) {
		if (dir.isDirectory()) {
			final File[] subdirs = dir.listFiles(new FileFilter() {
				@Override
				public boolean accept(final File file) {
					return file.isDirectory();
				}
			});
			return subdirs;
		}
		return null;
	}

	private void initUI() {
		attention.setText(createLableHtml());
		attention.setBorder(new EmptyBorder(5, 5, 5, 5));
		final JPanel p = new JPanel(new BorderLayout());
		p.add(attention, BorderLayout.CENTER);
		getOverviewPanel().add(p, BorderLayout.EAST);

		addItem(new RecurseFileSet(NADA));
		addSetsFromFilesystem();

		setRenderer(new MyCellRenderer());

		setToolTipText("Choose your Fileset");
		System.out.println("Loading Custom File Sets!");
		overPane.add(this, BorderLayout.NORTH);
		addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(final ActionEvent e) {
				final RecurseFileSet selected = (RecurseFileSet) getSelectedItem();
				final int index = getSelectedIndex();
				if (index > 0) {
					selectedSet = selected;

					overPane.setText(selected.getContentHTML());
				} else {
					overPane.setText("   Choose File-Set from Dropdownbox");
					selectedSet = null;
				}
			}
		});
		if (getItemCount() > 0)
			setSelectedIndex(0);
	}

	/**
	 * 
	 */
	private void addSetsFromFilesystem() {
		final File dir = new File(rootDir);
		if (!dir.exists())
			dir.mkdirs();
		// find subdirs with icon sets
		final File[] setDirs = findCustomDirs(dir);
		if (setDirs != null) {
			for (final File setDir : setDirs) {
				final RecurseFileSet set = new RecurseFileSet(setDir.getPath());
				sets.add(set);
				addItem(set);
				// addItem(set.getRepresentivIcon());
			}
		}
	}

	/**
	 * Renderer for WifiCreator-Combo
	 */
	private class MyCellRenderer implements ListCellRenderer<RecurseFileSet> {
		private final DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();

		@Override
		public Component getListCellRendererComponent(final JList<? extends RecurseFileSet> list, final RecurseFileSet value, final int index,
				final boolean isSelected, final boolean cellHasFocus) {

			final JLabel renderer = (JLabel) defaultRenderer.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
			if (value instanceof RecurseFileSet) {
				if (isSelected)
					renderer.setBackground(Color.darkGray.darker());
				else
					renderer.setBackground(Color.black);
				renderer.setForeground(Color.white);
				if (value.toString().equals(NADA)) {
					renderer.setIcon(IconStore.nothingIcon);
				}
			}
			return renderer;
		}

	}

	private String createLableHtml() {
		String html = "<html>";

		html += "<font size=5 color=red>";
		html += "<b>" + "Attention !!" + "</b><br><hr>";
		html += "</font>";

		html += "<font size=2 color=black>";
		html += "These filesets are added to the flashable zip as they are!<br>";
		html += "Add your filesets to ./custom/XTRAS/'your_fileset_name'/...<br>";
		html += "The folderstructure in this fileset-folders needs to match your rom<br><br>";
		html += "---- For example: you want to flash an apk to system/app, <br>---- you need to create the following structure:<br>";
		html += "---- <b>./custom/XTRAS/'your_fileset_name'/system/app/mycoolapp.apk</b><br><br>";
		html += "After that you can select the new fileset 'your_fileset_name' here in the dropdownbox<br>";
		html += "...and ad it to the flashable zip!<br>";
		html += "See my example in .custom/XTRAS<br>";
		html += "<br>Make sure you know what you are doing here! Don't brick your device!!!<br>";
		html += "I'm not responsable if you damage your device!!!<br>";
		html += "<hr>";
		html += "</font>";

		html += "</html>";
		return html;
	}

	/**
	 * For testing purposes !!!
	 * 
	 * @param args
	 */
	public static void main(final String[] args) {

		final JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Hallo Emmy!!!!!!!");
		f.setBounds(200, 200, 640, 600);
		f.setLayout(new BorderLayout());
		// final IconSetSelector combo = new IconSetSelector("Weather",
		// "./custom/weather/");
		final RecurseFileSetSelector combo = new RecurseFileSetSelector();
		if (combo.getItemCount() > 0)
			combo.setSelectedIndex(0);
		f.add(combo, BorderLayout.NORTH);
		f.add(combo.getOverviewPanel(), BorderLayout.CENTER);

		f.setVisible(true);
	}

	/**
	 * @return the selectedSet
	 */
	public RecurseFileSet getSelectedSet() {
		return selectedSet;
	}

}
