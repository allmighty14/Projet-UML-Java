package view;

import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Element.*;
import contract.IView;
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
		readFile();
	}
	
	/**
	 *  Reads the file containing the level.
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
				    	}
			    	
			    	else if(ligne.charAt(j) == 'M') {
			    		Model.scene[i][j]=new Monster();   
				    	}
			    	
			    	else if(ligne.charAt(j) == '*') {
			    		Model.scene[i][j]=new Diamond();   
				    	}
			    	else if(ligne.charAt(j) == ' ') {
			    		Model.scene[i][j]=new Darkground();   
				    	}
			    	
			    	else {
			    		Model.scene[i][j] = new Ground();
			    	}
			    	
			    	
			    	//System.out.println(ligne.charAt(j));
			    	//System.out.println(Model.scene[i][j]);
			    	
		    		Model.scene[i][j].setX(32*(j));
		    		Model.scene[i][j].setY(32*(i));
			    }
			    
			   // System.out.println("\n");
			    i++;
			}
			buff.close(); 
			}		
			catch (Exception e){
			System.out.println(e.toString());
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
	
		
		
		for(int i=0;i<25;i++) {
			for(int j=0;j<37;j++) {
				if(Model.scene[i][j] != null) {
				g.drawImage(Model.scene[i][j].getImage(),Model.scene[i][j].getX(),Model.scene[i][j].getY(),this);
				}
			}
		}
		
		//g.drawImage(new Ground().getImage(),0,0,this);
		
		//g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.drawImage(KeyBoard.hero.getImage(),KeyBoard.hero.getX(),KeyBoard.hero.getY(),this);
		repaint();
	}
}
