package model;

public class Monsters extends Move{

	private int posX[] = new int [34] ;
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

	
	public Monsters() {
		// TODO Auto-generated constructor stub
	}
	
	

	public void moveDown() {
		
	}
	
	public void moveUp() {
		
	}

	public void moveLeft() {
	
	}

	public void moveRight() {
	
	}

}
