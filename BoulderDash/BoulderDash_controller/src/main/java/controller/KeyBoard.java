package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Element.Hero;
import Element.Wall;
import contract.IView;
import model.Model;

/**
 * The Class KeyBoard.
 *
 * @author Group7
 */
public class KeyBoard implements KeyListener{

	/** The hero*/
	public static Hero hero;
	
	/** 
	 * Instantiates a new KeyBoard
	 */
	public KeyBoard() {
	hero = new Hero();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		hero.dig();

		if(arg0.getKeyCode()==KeyEvent.VK_LEFT) {
			
			//if(hero.isMoveleft()==true) {
				hero.move('L');
				hero.dig();
				
				if(hero.isFreeze()==true) {
					for(int i=0;i<25;i++) {
						for(int j=0;j<37;j++) {
						  Model.scene[i][j].setX(Model.scene[i][j].getX()+32);
						}
					}
			}
			System.out.println(hero.getX()/32+" "+hero.getY()/32);
				System.out.println(hero.getX() < 16*32-4*32 && hero.getX() > 3*32);	
			        System.out.println((hero.getX() >= 16*32-4*32 || hero.getX() <= 3*32) && Model.scene[0][0].getX() == 0 && hero.getX() < 8*32);
			        System.out.println((hero.getX() < 16*32-4*32 && hero.getX() > 3*32) && Model.scene[0][36].getX() == 15*32 && hero.getX() > 8*32);
					}
		
		else if(arg0.getKeyCode()==KeyEvent.VK_RIGHT) {
			System.out.println(hero.isMoveright());
			//if(hero.isMoveleft()==true) {
			hero.move('R');
			hero.dig();
			
			if(hero.isFreeze()==true) {
			for(int i=0;i<25;i++) {
				for(int j=0;j<37;j++) {
				  Model.scene[i][j].setX(Model.scene[i][j].getX()-32);
				}
			}
		}
		//	System.out.println(hero.getX()/32+" "+hero.getY()/32);
			//System.out.println(hero.getX() < 16*32-4*32 && hero.getX() > 3*32);	
//System.out.println(hero.getX() < 16*32-4*32 && hero.getX() > 3*32 || ((hero.getX() >= 16*32-4*32 || hero.getX() <= 3*32) && Model.scene[0][36].getX() == 15*32));
				
			

	}
		
		else if(arg0.getKeyCode()==KeyEvent.VK_UP) {
			
		//	if(hero.isMoveleft()==true) {
			hero.move('U');
			hero.dig();

			if(hero.isFreeze()==true) {
				//	System.out.println("oui");	
			for(int i=0;i<25;i++) {
				for(int j=0;j<37;j++) {
				  Model.scene[i][j].setY(Model.scene[i][j].getY()+32);
				}
			}
		}
	}

		else if(arg0.getKeyCode()==KeyEvent.VK_DOWN) {
			
			//if(hero.isMoveleft()==true) {
			hero.move('D');
			hero.dig();
			
			if(hero.isFreeze()==true) {
			for(int i=0;i<25;i++) {
				for(int j=0;j<37;j++) {
					
					Model.scene[i][j].setY(Model.scene[i][j].getY()-32);
				}
			}
		}
   }
		       
			 //  	System.out.println(Model.scene[0][0].getX()+" "+Model.scene[0][0].getY());
				//System.out.println(Model.scene[5][12].getClass());
				
		hero.setMoveup(true);
		hero.setMovedown(true);
		hero.setMoveleft(true);
		hero.setMoveright(true);
}		
		

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

