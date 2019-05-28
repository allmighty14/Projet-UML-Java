package view;


import javax.swing.JFrame;

import controller.Keyboard;


/**
 * The Class ViewFrame.
 *
 * @author Jean-Aymeric Diet
 */
public class ViewFrame extends JFrame {

/** The panel. */
	private ViewPanel viewPanel;
	
/** The constant HEIGHT. */	
private final static int HEIGHT=512;

/** The constant WIDTH. */
private final static int WIDTH=512;
	
/**
	 * Instantiates a new view frame.
	 */
	public ViewFrame() {
		this.buildViewFrame();
	}


	/**
	 * Builds the view frame.
	 *
	 * @param model
	 *          the model
	 */
	private void buildViewFrame() {
		viewPanel = new ViewPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("BoulderDash");
		this.setResizable(false);
		this.setContentPane(viewPanel);
		this.setSize(WIDTH,HEIGHT);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		addKeyListener(new Keyboard());

	}



}
