package model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Diamants extends Move {

	private int posX[] = new int [35] ;
	private int posY[] = new int [24];

	public int getPosX(int j) {
		return posX[j];
	}

	public void setPosX(int posX, int i) {
		this.posX[i] = posX;
	}

	public int getPosY(int j) {
		return posY[j];
	}

	public void setPosY(int posY, int i) {
		this.posY[i] = posY;
	}

	
	
	private Image img[] = new Image[4];
	
	public Image getImg(int i) {
		return this.img[i];
	}



	public Diamants() {
		// TODO Auto-generated constructor stub
		try {
			this.img[0] = ImageIO.read(new File("D:\\Prosits\\Prosits\\2nd Semestre\\UE 2.2 Java\\Projet Java 2\\Images\\diam1.png"));
			this.img[1] = ImageIO.read(new File("D:\\Prosits\\Prosits\\2nd Semestre\\UE 2.2 Java\\Projet Java 2\\Images\\diam2.png"));
			this.img[2] = ImageIO.read(new File("D:\\Prosits\\Prosits\\2nd Semestre\\UE 2.2 Java\\Projet Java 2\\Images\\diam3.png"));
			this.img[3] = ImageIO.read(new File("D:\\Prosits\\Prosits\\2nd Semestre\\UE 2.2 Java\\Projet Java 2\\Images\\diam4.png"));
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void move() {
		
	}

}
