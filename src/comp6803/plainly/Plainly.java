package comp6803.plainly;

import java.awt.Dimension;
import java.io.IOException;

import javax.swing.JFrame;

// From: https://github.com/fozziethebeat/S-Space/wiki/LatentSemanticAnalysis
import edu.ucla.sspace.lsa.LatentSemanticAnalysis;

// https://code.google.com/p/semanticvectors/wiki/LatentSemanticAnalysis
// http://semanticvectors.googlecode.com/svn/javadoc/latest-stable/index.html
// import pitt.search.semanticvectors.LSA;

@SuppressWarnings("serial")
public class Plainly extends JFrame {
	private int width, height;
	private PlainlyMenuBar menuBar;
	private LatentSemanticAnalysis lsa;
	
	private static final int MIN_WIDTH = 1000;
	private static final int MIN_HEIGHT = 600;

	public static void main(String[] args) {
		new Plainly(args);
	}
	
	public Plainly(String[] args) {
		debugMessage("Plainly Starting");
		this.width = 1200;
		this.height = 700;
		
		// Initiate Window
		this.menuBar = new PlainlyMenuBar();
		this.setJMenuBar(this.menuBar);
		this.setSize(new Dimension(this.width, this.height));
		this.setVisible(true);
		this.setMinimumSize(new Dimension(MIN_WIDTH, MIN_HEIGHT));
		this.setTitle("Plainly");
		
		// Initiate LSA
		try {
			this.lsa = new LatentSemanticAnalysis();
			debugMessage("Latent Semantic Analysis Started");
		} catch (IOException e) {
			debugMessage(e.getMessage());
		}
		
		// On Shutdown Event
		this.addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {
				debugMessage("Closing Application");
				System.exit(0);
			}
		});
	}
	
	private void debugMessage(String message) {
		System.out.println("[" + this.getClass().getName() + "] " + message);
	}

}