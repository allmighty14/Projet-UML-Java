package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Element.Hero;
import Element.MobileElement;
import model.*;
import contract.IView;


public class KeyBoard  implements KeyListener{
	
	//Personnage p;
	
	ViewPanel p; 
	public static Hero hero;
	
	public KeyBoard(ViewPanel p) {
		// TODO Auto-generated constructor stub
	    this.p = p;
	    this.hero = new Hero();
	}

	public void keyPressed(KeyEvent k) {
		// TODO Auto-generated method stub
		if (k.getKeyCode()== KeyEvent.VK_UP) {
			p.moveUp();
			MobileElement.moves();
			MobileElement.boardh();
		//	hero.dig();
			
			
			
			
		}
		if (k.getKeyCode()== KeyEvent.VK_DOWN) {
			p.moveDown();
			MobileElement.moves();
			MobileElement.boardb();
		//	hero.dig();
			
		}
		if (k.getKeyCode()== KeyEvent.VK_LEFT) {
			p.moveLeft();
			MobileElement.moves();
			MobileElement.boardg();
		//	hero.dig();
			
			
		}
		if (k.getKeyCode()== KeyEvent.VK_RIGHT) {
			p.moveRight();
			MobileElement.moves();
			MobileElement.boardd();
		//	hero.dig();
			
		  
		}
	}

	public void keyReleased(KeyEvent k) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent k) {
		// TODO Auto-generated method stub
		
	}

}
