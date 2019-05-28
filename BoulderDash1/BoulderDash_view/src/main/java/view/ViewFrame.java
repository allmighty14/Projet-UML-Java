package view;


import javax.swing.JFrame;

import contract.IView;



/**
 * The Class ViewFrame.
 *
 * @author Jean-Aymeric Diet
 */
public class ViewFrame extends JFrame {

/** The panel. */
	private ViewPanel pan;
	
/** The constant HEIGHT. */	
private final static int HEIGHT=780;//531;

/** The constant WIDTH. */
private final static int WIDTH=1088;//533;
	
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
	    pan = new ViewPanel();
	    this.addKeyListener(new KeyBoard(pan));
	  //  pan.setFocusable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("BoulderDash");
		this.setResizable(false);
		//this.addKeyListener();
		this.setContentPane(pan);
		this.setSize(WIDTH,HEIGHT);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}



}