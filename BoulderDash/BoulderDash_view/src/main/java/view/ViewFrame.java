package view;


import javax.swing.JFrame;

import contract.IView;
import controller.KeyBoard;


/**
 * The Class ViewFrame.
 *
 * @author Group7
 */
public class ViewFrame extends JFrame {

/** The panel. */
	private ViewPanel viewPanel;
	
	
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
	    this.addKeyListener(new KeyBoard());
		this.setContentPane(viewPanel);
		this.setSize(IView.WIDTH,IView.HEIGHT);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}



}
