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

public class Hero {
//public static ImageIcon hero = new ImageIcon("sprites/HERO.png");

/*
 * Implementation of the different setter and getter corresponding to my hero
 */
 private static int x=186;
 private static int y=124;

	private Image img;

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

	private Image img1;

	public Image getImg1() {
		return img1;
	}

	public void setImg1(Image img) {
		this.img1 = img;
	}
	
	private Image img2;

	public Image getImg2() {
		return img2;
	}

	public void setImg2(Image img) {
		this.img2 = img;
	}

	private Image img3;

	public Image getImg3() {
		return img3;
	}

	public void setImg3(Image img) {
		this.img3 = img;
	}

	private Image img4;

	public Image getImg4() {
		return img4;
	}

	public void setImg4(Image img) {
		this.img4 = img;
	}

	
	public static  int getY() {
	return y;
	}
	
	public static void setY(int a) {
	   y = a;
	}

	/*public static ImageIcon getHero() {
	return hero;
	}

	public static void setHero(ImageIcon hero) {
	Hero.hero = hero;
	}

	*/public static int getX() {
	return x;
	}
	
	public static void setX(int a) {
	x = a;
	}
	
	public Hero() {
//		this.setImage ( new ImageIcon("D:\\Prosits\\Prosits\\2nd Semestre\\UE 2.2 Java\\Projet Java 2\\pers.png").getImage());
		try {
			this.img =  ImageIO.read(new File("D:\\\\Prosits\\\\Prosits\\\\2nd Semestre\\\\UE 2.2 Java\\\\Projet Java 2\\\\pers.png"));
			this.img1 = ImageIO.read(new File("D:\\\\Prosits\\\\Prosits\\\\2nd Semestre\\\\UE 2.2 Java\\\\Projet Java 2\\\\Images\\\\persg.png"));
			this.img2 = ImageIO.read(new File("D:\\\\Prosits\\\\Prosits\\\\2nd Semestre\\\\UE 2.2 Java\\\\Projet Java 2\\\\Images\\\\persd.png"));
			this.img3 = ImageIO.read(new File("D:\\\\Prosits\\\\Prosits\\\\2nd Semestre\\\\UE 2.2 Java\\\\Projet Java 2\\\\Images\\\\persh.png"));
			this.img4 = ImageIO.read(new File("D:\\\\Prosits\\\\Prosits\\\\2nd Semestre\\\\UE 2.2 Java\\\\Projet Java 2\\\\Images\\\\persb.png"));
			
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated constructor stub
	}
	
	/*public void dig (){
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
}*/
}