package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Element.Hero;
import Element.*;
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
		int a=0;
		
		if(arg0.getKeyCode()==KeyEvent.VK_LEFT) {
			
			for(int i=0;i<25;i++) {
				for(int j=0;j<37;j++) {
					if(
							Model.scene[i][j].getX()==hero.getX()-32 && Model.scene[i][j].getY()==hero.getY() && 
							(Model.scene[i][j].getClass().toString().equals(new Wall().getClass().toString()) || Model.scene[i][j].getClass().toString().equals(new Rock().getClass().toString()))
							) {
					a++;
					}
				}
			}
			
			if(a==0) {
				hero.move('L');
				hero.dig();
				Model.move(hero, "left");
			}
			}
		
		else if(arg0.getKeyCode()==KeyEvent.VK_RIGHT) {

			for(int i=0;i<25;i++) {
				for(int j=0;j<37;j++) {
					if(
							Model.scene[i][j].getX()==hero.getX()+32 && Model.scene[i][j].getY()==hero.getY() && 
							(Model.scene[i][j].getClass().toString().equals(new Wall().getClass().toString()) || Model.scene[i][j].getClass().toString().equals(new Rock().getClass().toString()))
							) {
					a++;
					}
				}
			}
			if(a==0) {
			hero.move('R');
			hero.dig();
			Model.move(hero, "right");
			}
	}
		
		else if(arg0.getKeyCode()==KeyEvent.VK_UP) {
			
			for(int i=0;i<25;i++) {
				for(int j=0;j<37;j++) {
					if(
							Model.scene[i][j].getX()==hero.getX() && Model.scene[i][j].getY()==hero.getY()-32 && (
									Model.scene[i][j].getClass().toString().equals(new Wall().getClass().toString()) || Model.scene[i][j].getClass().toString().equals(new Rock().getClass().toString()))
									) {
					a++;
					}
				}
			}
			
			if(a==0) {
			hero.move('U');
			hero.dig();
			Model.move(hero, "up");
			}
		
	}

		else if(arg0.getKeyCode()==KeyEvent.VK_DOWN) {
			
			for(int i=0;i<25;i++) {
				for(int j=0;j<37;j++) {
					if(
							Model.scene[i][j].getX()==hero.getX() && Model.scene[i][j].getY()==hero.getY()+32 && 
							(Model.scene[i][j].getClass().toString().equals(new Wall().getClass().toString()) || Model.scene[i][j].getClass().toString().equals(new Rock().getClass().toString()))
							) {
					a++;
					}
				}
			}
			
			if(a==0) {
			hero.move('D');
			hero.dig();
			Model.move(hero, "down");
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

