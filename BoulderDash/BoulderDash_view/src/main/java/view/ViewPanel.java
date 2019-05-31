package view;

import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Element.Darkground;
import Element.Diamond;
import Element.Element;
import Element.Ground;
import Element.Monster;
import Element.Rock;
import Element.Wall;
import contract.IView;
import controller.Controller;
import controller.KeyBoard;
import model.Model;

/**
 * The Class ViewPanel.
 *
 * @author Group7
 */
public class ViewPanel extends JPanel {
	
	
	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel() {
		Model.scene = new Element[25][37];
		Model.allRocks=new ArrayList<Rock>();
		Model.allMonsters=new ArrayList<Monster>();
        Model.allDiamonds=new ArrayList<Diamond>();
		fillScene();
	}
	
	/**
	 *  fill the table scene
	 */
	public void fillScene() {
          int i=0, j=0;  
          
		for(i=0;i<25;i++) {
			    for(j=0;j<37;j++) {
			    	//System.out.print(Controller.sceneCharacters[i][j]);
			    	if(Controller.sceneCharacters[i][j] == 'G') {
			    	Model.scene[i][j]=new Ground(); 
			    	}
			    	
			    	else if(Controller.sceneCharacters[i][j] == 'W') {
			    		Model.scene[i][j]=new Wall();   
				    	}
			    	
			    	else if(Controller.sceneCharacters[i][j] == 'O') {
			    		Model.scene[i][j]=new Rock(); 
			    		Model.allRocks.add((Rock) Model.scene[i][j]);
			    		//System.out.println(i+" "+j);
				    	}
			    	
			    	else if(Controller.sceneCharacters[i][j] == 'M') {
			    		Model.scene[i][j]=new Monster(); 
			    	    Model.allMonsters.add((Monster) Model.scene[i][j]);
				    	}
			    	
			    	else if(Controller.sceneCharacters[i][j] == '*') {
			    		Model.scene[i][j]=new Diamond(); 
			    		Model.allDiamonds.add((Diamond) Model.scene[i][j]);
				    	}
			    	else if(Controller.sceneCharacters[i][j] == ' ') {
			    		Model.scene[i][j]=new Darkground();   
				    	}
			    	
			    	else {
			    		Model.scene[i][j] = new Ground();
			    	}
			    	
			    	Model.scene[i][j].setX(32*j);
			    	Model.scene[i][j].setY(32*i);
			}
			IView.diamondCounter++;
        }
	}
	
	

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(final Graphics g) {
		
		   
		//System.out.println(Model.allRocks.get(12).getX()/32+" "+Model.allRocks.get(12).getY()/32);
		//System.out.println(Model.allRocks.get(12).getIndex_j()+" "+Model.allRocks.get(12).getIndex_i());
		//System.out.println(KeyBoard.hero.getX()+" "+KeyBoard.hero.getY());
//System.out.println(Model.allRocks.get(0).blocking_L+" "+Model.allRocks.get(0).blocking_R+" "+Model.allRocks.get(0).blocking_D+" "+" "+Model.allRocks.get(0).blocking_LD+" "+Model.allRocks.get(0).blocking_RD);
		
		if(KeyBoard.hero != null)
		System.out.println(KeyBoard.hero.isDead());
			
		for(int i=0;i<25;i++) {
			for(int j=0;j<37;j++) {
				//System.out.print(Model.scene[i][j]);
				g.drawImage(Model.scene[i][j].getImage(),Model.scene[i][j].getX(),Model.scene[i][j].getY(),this);
			}
		}
		
		if(KeyBoard.hero != null)
		g.drawImage(KeyBoard.hero.getImage(),KeyBoard.hero.getX(),KeyBoard.hero.getY(),this);
		//  System.out.println("----------------------------------------------");
		  for(int a=6;a<7;a++) {
			    if(KeyBoard.hero != null)
	            Model.allRocks.get(a).fixBooleans(a,KeyBoard.hero);
			  //  System.out.println(Model.allRocks.get(a).dangerous+" "+Model.allRocks.get(a).getIndex_i()+" "+Model.allRocks.get(a).getIndex_j());
			   }
		  System.out.println("----------------------------------------------");
		  
		  for(int b=0;b<Model.allDiamonds.size();b++) {
			  if(KeyBoard.hero != null)
	            Model.allDiamonds.get(b).fixBooleans(b,KeyBoard.hero);
			   }
		  
	//	System.out.println(Model.allDiamonds.size());
		try {
			Thread.sleep(80);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		repaint();
	}
}
