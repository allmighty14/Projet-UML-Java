package Element;

import java.awt.Container;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
/*
 * The class Hero
 * 
 * @author Ndoky Dumont
 */

public class Hero extends Element {
public static ImageIcon hero = new ImageIcon("sprites/HERO.png");
public static JLabel lab = new JLabel(hero);
/*
 * Implementation of the different setter and getter corresponding to my hero
 */
int x=55;
int y=49;
	public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
	public static ImageIcon getHero() {
	return hero;
}
public static void setHero(ImageIcon hero) {
	Hero.hero = hero;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
	public Hero() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	
}
