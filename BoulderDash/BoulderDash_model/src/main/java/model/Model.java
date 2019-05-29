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
	  public static ArrayList<Rock> allRocks;
	    public static ArrayList<Monster> allMonsters;
	    public static ArrayList<Diamond> allDiamonds;
	    
	
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
     	  }
		}
		
		else if(direction == "right") {
			if(hero.isFreeze()==true) {
				for(int i=0;i<25;i++) {
					for(int j=0;j<37;j++) {
					  Model.scene[i][j].setX(Model.scene[i][j].getX()-32);
					}
				}
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
		} 
	   }
		
	   else if(direction == "down") {
		   if(hero.isFreeze()==true) {
				for(int i=0;i<25;i++) {
					for(int j=0;j<37;j++) {
						
						Model.scene[i][j].setY(Model.scene[i][j].getY()-32);
					}
				}
			}
	   }

}

	
}
