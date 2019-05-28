package Element;

import java.awt.Container;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import model.Model;
/*
 * The class Hero
 * 
 * @author Roch MBANYA
 */

public class Hero  {
//public static ImageIcon hero = new ImageIcon("sprites/HERO.png");

/*
 * Implementation of the different setter and getter corresponding to my hero
 */
int x=186;
static int y=124;

	private Image img;

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

	public static int getY() {
	return y;
	}
	
	public void setY(int y) {
	this.y = y;
	}

	/*public static ImageIcon getHero() {
	return hero;
	}

	public static void setHero(ImageIcon hero) {
	Hero.hero = hero;
	}

	*/public int getX() {
	return x;
	}
	
	public void setX(int x) {
	this.x = x;
	}
	
	public Hero() {
//		this.setImage ( new ImageIcon("D:\\Prosits\\Prosits\\2nd Semestre\\UE 2.2 Java\\Projet Java 2\\pers.png").getImage());
		try {
			this.img =  ImageIO.read(new File("D:\\\\Prosits\\\\Prosits\\\\2nd Semestre\\\\UE 2.2 Java\\\\Projet Java 2\\\\pers.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated constructor stub
	}
	
	public void dig (){
		for(int i=0;i<24;i++) {
			for(int j=0; j<35; j++) {
				    if(Model.scene[i][j].getClass().toString().equals(new Ground().getClass().toString())) {
					System.out.println(Model.scene[i][j].toString());
					    if(this.getX()==Model.scene[i][j].getX() && this.getY()==Model.scene[i][j].getY()) {
					    	int a = Model.scene[i][j].getX();
					    	int b= Model.scene[i][j].getY();
					    	Model.scene[i][j]= new Darkground();
					    	Model.scene[i][j].setX(a);
					    	Model.scene[i][j].setY(b);
					    	
					      break;
				      }
			}
		}		
}
}
}
