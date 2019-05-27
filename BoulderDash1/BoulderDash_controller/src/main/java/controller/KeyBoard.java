package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import model.Personnage;
import view.ViewPanel;

public class KeyBoard  implements KeyListener{
	
	Personnage p1;
	ViewPanel p;

	public KeyBoard(ViewPanel p) {
		// TODO Auto-generated constructor stub
		this.p=p;
	}

	public void keyPressed(KeyEvent k) {
		// TODO Auto-generated method stub
		if (k.getKeyCode()== KeyEvent.VK_UP) {
			p1.moveUp();
			
		}
		if (k.getKeyCode()== KeyEvent.VK_DOWN) {
			p1.moveDown();
		}
		if (k.getKeyCode()== KeyEvent.VK_LEFT) {
			p1.moveLeft();
		}
		if (k.getKeyCode()== KeyEvent.VK_RIGHT) {
			p1.moveRight();
		}
	}

	public void keyReleased(KeyEvent k) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent k) {
		// TODO Auto-generated method stub
		
	}

}
