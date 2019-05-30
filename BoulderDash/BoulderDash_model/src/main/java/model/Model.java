package model;

import java.util.ArrayList;

import Element.Diamond;
import Element.Element;
import Element.Hero;
import Element.Monster;
import Element.Rock;
import contract.IModel;

/**
 * The Class Model.
 *
 * @author Group7
 */
public final class Model extends IModel {

	/** The scene. */
	public static Element [][] scene;
	
	/** The list of all rocks on the scene  */
	public static ArrayList<Rock> allRocks;
    
	/** The list of all monsters on the scene  */
    public static ArrayList<Monster> allMonsters;
    
    /** The list of all Diamonds on the scene  */
    public static ArrayList<Diamond> allDiamonds;
    
    /** The lag from left */
    private static int lag_L=0;
    
    /** The lag from the top */
    private static int lag_T=0;
	    
	
    /**
     * moves the scene
     * 
     * @param hero
     * @param direction
     *              the direction
     */
	public static void move(Hero hero,String direction) {
	
		if(direction == "left") {
		if(hero.isFreeze()==true) {
			for(int i=0;i<25;i++) {
				for(int j=0;j<37;j++) {
				  Model.scene[i][j].setX(Model.scene[i][j].getX()+32);
				}
			}
			lag_L-=32;
     	  }
		}
		
		else if(direction == "right") {
			if(hero.isFreeze()==true) {
				for(int i=0;i<25;i++) {
					for(int j=0;j<37;j++) {
					  Model.scene[i][j].setX(Model.scene[i][j].getX()-32);
					}
				}
		      lag_L+=32;
			}
		}
	
	   else if(direction == "up") {
			if(hero.isFreeze()==true) {
				//	System.out.println("oui");	
			for(int i=0;i<25;i++) {
				for(int j=0;j<37;j++) {
				  Model.scene[i][j].setY(Model.scene[i][j].getY()+32);
				}
			}
			lag_T-=32;
		} 
	   }
		
	   else if(direction == "down") {
		   if(hero.isFreeze()==true) {
				for(int i=0;i<25;i++) {
					for(int j=0;j<37;j++) {
						
						Model.scene[i][j].setY(Model.scene[i][j].getY()-32);
					}
				}
				lag_T+=32;
			}
	   }

}


	public static int getLag_L() {
		return lag_L;
	}


	public static void setLag_L(int lag_L) {
		Model.lag_L = lag_L;
	}


	public static int getLag_T() {
		return lag_T;
	}


	public static void setLag_T(int lag_T) {
		Model.lag_T = lag_T;
	}
	
	

	
}
