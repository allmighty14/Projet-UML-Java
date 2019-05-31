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
			
			
			MobileElement.boardh();
			//MobileElement.boardhr();
			p.moveUp();
			MobileElement.moves();
		//	p.reput();
	//		MobileElement.collision();
		//	hero.dig();
			
			
			
			
		}
		if (k.getKeyCode()== KeyEvent.VK_DOWN) {
			
			MobileElement.boardb();
		//	MobileElement.boardbr();
			p.moveDown();
			MobileElement.moves();
		//	p.reput();
		//	hero.dig();
			
		}
		if (k.getKeyCode()== KeyEvent.VK_LEFT) {
			MobileElement.boardg();
			MobileElement.boardgr();
			p.moveLeft();
			MobileElement.moves();
		//	p.reput();
		//	hero.dig();
			
			
		}
		if (k.getKeyCode()== KeyEvent.VK_RIGHT) {
	
			MobileElement.boardd();
			MobileElement.boarddr();
			//p.reput();
			p.moveRight();
			MobileElement.moves();
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
