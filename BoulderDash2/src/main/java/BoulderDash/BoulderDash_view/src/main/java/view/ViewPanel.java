package view;

import java.awt.Graphics;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Element.Darkground;
import Element.Diamond;
import Element.Element;
import Element.Ground;
import Element.Hero;
import Element.Monster;
import Element.Rock;
import Element.Wall;
import controller.Keyboard;
import model.Model;

/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
public class ViewPanel extends JPanel {
	
	Hero hero = new Hero();
	Keyboard keyboard = new Keyboard();
	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel() {
		Model.scene = new Element[21][41];
		readFile();

	}
	
	/*
	 * Reading of the second level
	 */
	 public void readFile() {
		 try{
		  InputStream flux=new FileInputStream("levels/Level2.txt"); 
		  InputStreamReader lecture=new InputStreamReader(flux);
		  BufferedReader buff=new BufferedReader(lecture);
		  String ligne;
		  int i=0;
		  
		  while ((ligne=buff.readLine())!=null){
		      for(int j=0;j<41;j++) {
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
		       
		       
		      // System.out.print(ligne.charAt(j));
		       //System.out.println(Model.scene[i][j]);
		       
		       Model.scene[i][j].setX(32*(j));
		       Model.scene[i][j].setY(32*(i));
		      }
		      
		      //System.out.println("");
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
			

		/*
		 * Draw of the image in the table scene
		 */
		for(int i = 0; i<21; i++) {
			for(int j = 0; j<41; j++) {
			g.drawImage(Model.scene[i][j].getImage(),Model.scene[i][j].getX(),Model.scene[i][j].getY(),this);
		}
		}
		Hero.lab.setBounds(hero.getX(), hero.getY(), 256, 256);
		Hero.lab.setIcon(new ImageIcon("sprites/HERO.png"));
		this.add(Hero.lab);
		repaint();

		
		//g.drawImage(img, 0, 0, this);
		//g.drawImage(new ImageIcon("sprites/ground.png").getImage(),this.getHeight(),this.getWidth(), this);
		//g.setColor(Color.RED);
		//g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		
	}
}
