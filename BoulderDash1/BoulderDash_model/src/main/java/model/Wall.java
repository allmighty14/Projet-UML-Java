package model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Wall {
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


	private Image img;
	
	public Image getImg() {
		return this.img;
	}

	public void setImg(Image img) {
		this.img = img;
	}
	
	public Wall() {
		// TODO Auto-generated constructor stub
		try {
			this.img = ImageIO.read(new File("D:\\Prosits\\Prosits\\2nd Semestre\\UE 2.2 Java\\Projet Java 2\\Images\\mur.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
