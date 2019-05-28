package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import model.Personnage;
import model.*;
import contract.IView;


public class KeyBoard  implements KeyListener{
	
	//Personnage p;
	
	ViewPanel p; 
	
	public KeyBoard(ViewPanel p) {
		// TODO Auto-generated constructor stub
	    this.p = p;
	}

	public void keyPressed(KeyEvent k) {
		// TODO Auto-generated method stub
		if (k.getKeyCode()== KeyEvent.VK_UP) {
			p.moveUp();
			
			
		}
		if (k.getKeyCode()== KeyEvent.VK_DOWN) {
			
			p.moveDown();
		}
		if (k.getKeyCode()== KeyEvent.VK_LEFT) {
			p.moveLeft();

		}
		if (k.getKeyCode()== KeyEvent.VK_RIGHT) {
		    p.moveRight();
		}
	}

	public void keyReleased(KeyEvent k) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent k) {
		// TODO Auto-generated method stub
		
	}

}
