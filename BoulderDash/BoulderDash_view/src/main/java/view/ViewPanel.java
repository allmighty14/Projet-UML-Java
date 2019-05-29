package view;

import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JPanel;

import Element.Darkground;
import Element.Diamond;
import Element.Element;
import Element.Ground;
import Element.Monster;
import Element.Rock;
import Element.Wall;
import contract.IModel;
import controller.KeyBoard;
import controller.Controller;
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
		readFile();
	}
	
	/**
	 *  Reads the file containing the map level.
	 */
	public void readFile() {
		try{
			InputStream flux=new FileInputStream("levels/level4.txt"); 
			InputStreamReader lecture=new InputStreamReader(flux);
			BufferedReader buff=new BufferedReader(lecture);
			String ligne;
			int i=0;
			
			while ((ligne=buff.readLine())!=null){
			    for(int j=0;j<37;j++) {
			    	if(ligne.charAt(j) == 'G') {
			    	Model.scene[i][j]=new Ground(); 
			    	}
			    	
			    	else if(ligne.charAt(j) == 'W') {
			    		Model.scene[i][j]=new Wall();   
				    	}
			    	
			    	else if(ligne.charAt(j) == 'O') {
			    		Model.scene[i][j]=new Rock(); 
			    		Model.allRocks.add((Rock) Model.scene[i][j]);
				    	}
			    	
			    	else if(ligne.charAt(j) == 'M') {
			    		Model.scene[i][j]=new Monster(); 
			    	    Model.allMonsters.add((Monster) Model.scene[i][j]);
				    	}
			    	
			    	else if(ligne.charAt(j) == '*') {
			    		Model.scene[i][j]=new Diamond(); 
			    		Model.allDiamonds.add((Diamond) Model.scene[i][j]);
				    	}
			    	else if(ligne.charAt(j) == ' ') {
			    		Model.scene[i][j]=new Darkground();   
				    	}
			    	
			    	else {
			    		Model.scene[i][j] = new Ground();
			    	}
			    	
			    	
			    	System.out.print(ligne.charAt(j));
			    	//System.out.println(Model.scene[i][j]);
			    	
		    		Model.scene[i][j].setX(32*(j));
		    		Model.scene[i][j].setY(32*(i));
			    }
			    
			    System.out.println("");
			    i++;
			}
			System.out.println(Model.allRocks.size());
			buff.close();
			
			}		
			catch (Exception e){
			e.printStackTrace();
			}

	}
	
	

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(final Graphics g) {
		
		/*for(int i=0;i<25;i++) {
			for(int j=0;j<37;j++) {
				g.drawImage(new ImageIcon("sprites/darkground.png").getImage(),32*j,32*i,this);+
			}
		}*/
	
		for(int a=0;a<Model.allRocks.size();a++) {
            Model.allRocks.get(a).fixBooleans(a);
			}
		System.out.println(Model.allRocks.get(9).getX()/32+" "+Model.allRocks.get(9).getY()/32);
		System.out.println(Model.allRocks.get(9).blocking_L+" "+Model.allRocks.get(9).blocking_R+" "+Model.allRocks.get(9).blocking_D);
		
		//System.out.println(Model.allRocks.get(0).blocking_L+" "+Model.allRocks.get(0).blocking_R+" "+Model.allRocks.get(0).blocking_D);
		
		for(int i=0;i<25;i++) {
			for(int j=0;j<37;j++) {
				if(Model.scene[i][j] != null) {
				g.drawImage(Model.scene[i][j].getImage(),Model.scene[i][j].getX(),Model.scene[i][j].getY(),this);
				}
			}
		}

	/*	for(int j=0; j<25; j++) {
 		    for(int i=0; i<37; i++){
 		    	
 		    	if(
 		    			(Model.scene[j][i].getClass().toString().equals(new Wall().getClass().toString())) ||
 		    			(Model.scene[j][i].getClass().toString().equals(new Rock().getClass().toString())) ||
 		    			(Model.scene[j][i].getClass().toString().equals(new Diamond().getClass().toString()))
 		    			
 		    			) {
 		    		KeyBoard.hero.collision(Model.scene[j][i]);
 		    	}
 			 }
 		    }*/
		
		
	
		g.drawImage(KeyBoard.hero.getImage(),KeyBoard.hero.getX(),KeyBoard.hero.getY(),this);
		
		
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		repaint();
	}
}
