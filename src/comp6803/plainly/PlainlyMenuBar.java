package comp6803.plainly;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

@SuppressWarnings("serial")
public class PlainlyMenuBar extends JMenuBar {
	
	private JMenu menuFile;
	private JMenu menuEdit;
	private JMenu menuHelp;

	public PlainlyMenuBar() {
		this.createMenus();
	}
	
	private void createMenus() {
		menuFile = new JMenu("File");
		this.add(menuFile);
		
		menuFile.add(new JMenuItem("Clear Text"));
		JMenuItem menuFileExit = new JMenuItem("Exit");
		//menuFileExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK));
		menuFile.add(menuFileExit);
		
		menuEdit = new JMenu("Edit");
		menuEdit.add(new JMenuItem("Settings"));
		this.add(menuEdit);
		
		menuHelp = new JMenu("Help");
		this.add(menuHelp);
		
		menuHelp.add(new JMenuItem("About"));
	}

}
