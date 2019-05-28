package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Element.Hero;

public class Keyboard extends Hero implements KeyListener {
	Hero hero = new Hero();

	public Keyboard() {
		// TODO Auto-generated constructor stub

	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_DOWN) { 
		
			Hero.lab.setBounds(hero.getX()+50, hero.getY()+50, 256, 256 );

			System.out.print("dudu");


		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
