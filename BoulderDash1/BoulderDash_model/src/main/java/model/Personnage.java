package model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;




public class Personnage extends Move {
 

	
	private int posX;
	private int posY;

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY= posY;
	}

	private Image img;
	
	public Image getImg() {
		return this.img;
	}

	public void setImg(Image img) {
		this.img = img;
	}
	
	public Personnage() {
		// TODO Auto-generated constructor stub
		try {
			this.img = ImageIO.read(new File("D:\\Prosits\\Prosits\\2nd Semestre\\UE 2.2 Java\\Projet Java 2\\pers.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void moveDown() {
		int a = getPosY();
		a++;
		setPosY(a);
		
	}
	
	public void moveUp() {
		int a = getPosY();
		a--;
		setPosY(a);
	}

	public void moveLeft() {
		int a = getPosX();
		a--;
		setPosX(a);
	}

	public void moveRight() {
		int a = getPosX();
		a++;
		setPosX(a);

	}
}
