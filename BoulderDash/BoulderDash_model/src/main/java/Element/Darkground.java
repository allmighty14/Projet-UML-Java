package Element;

import javax.swing.ImageIcon;

public class Darkground extends motionlessElement{

	public Darkground() {
		this.setImage(new ImageIcon("sprites/darkground.png").getImage());
	}
	
	
	public Darkground(int x,int y) {
		this.x=x;
		this.y=y;
	}
}
