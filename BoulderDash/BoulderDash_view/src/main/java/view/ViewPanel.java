package view;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import javafx.scene.paint.Color;

/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
public class ViewPanel extends JPanel {
	
	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel() {
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(final Graphics g) {
		
		//g.setColor(Color.RED);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
	}
}
