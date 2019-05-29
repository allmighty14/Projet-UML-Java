package Element;

import javax.swing.ImageIcon;

/**
 * The Class Diamond.
 *
 * @author Group7
 */
public class Diamond extends mobileElement{

	/** The state*/
	private diamondState state;
	
	public Diamond() {
		this.setState(diamondState.diam1);
		//this.setImage(new ImageIcon("sprites/diam1.png").getImage());
	}
	
	public Diamond(int x,int y) {
		this.x=x;
		this.y=y;
		
	}
	
	public diamondState getState() {
		return state;
	}

	public void setState(diamondState state) {
		this.state = state;
		this.image = state.getImage();
	}
}
