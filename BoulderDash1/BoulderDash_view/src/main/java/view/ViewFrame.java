package view;


import javax.swing.JFrame;


/**
 * The Class ViewFrame.
 *
 * @author Jean-Aymeric Diet
 */
public class ViewFrame extends JFrame {

/** The panel. */
	private ViewPanel pan;
	
/** The constant HEIGHT. */	
private final static int HEIGHT=960;//512;

/** The constant WIDTH. */
private final static int WIDTH=960;//512;
	
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
	    //pan.addKeyListener(new KeyBoard(pan));
	    //pan.setFocusable(true);
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