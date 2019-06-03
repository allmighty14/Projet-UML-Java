package Element;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;

public class Diamond extends Element {

	
	/** The states of the diamonds*/
	private DiamondState state;
	
	public Diamond() {
		this.setState(DiamondState.diam1);
    }

   


	
	public Diamond(int x,int y) {
		this.x=x;
		this.y=y;
		
	}
	
	public DiamondState getState() {
		return state;
	}

	public void setState(DiamondState state) {
		this.state = state;
		this.setImage (state.getImage());
	}


}			