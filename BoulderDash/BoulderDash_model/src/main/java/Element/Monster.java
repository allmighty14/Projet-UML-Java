package Element;

import javax.swing.ImageIcon;

/**
 * The Class Monster.
 *
 * @author Group7
 */
public class Monster extends mobileElement{
	
	/**
	 * Instantiates a new Monster
	 */
	public Monster() {
		this.setImage(new ImageIcon("sprites/monster.png").getImage());
	}
	
	public Monster(int x,int y) {
		this.x=x;
		this.y=y;
	}

	@Override
	public void fixBooleans(int pos, Hero hero) {
		// TODO Auto-generated method stub
		
	}
}
