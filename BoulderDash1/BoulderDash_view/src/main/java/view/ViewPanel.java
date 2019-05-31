package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Element.Darkground;
import Element.Diamond;
import Element.DiamondState;
import Element.Element;
import Element.Ground;
import Element.Hero;
import Element.MobileElement;
import Element.Monster;
import Element.Rock;
import Element.Stars;
import Element.Wall;
//import controller.Keyboard;
import model.Model;

/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
public class ViewPanel extends JPanel {
	Hero h = new Hero();
	Stars s = new Stars();
    
	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel() {
		
		
		Model.scene = new Element[24][35];
		Model.allDiamonds=new ArrayList<Diamond>();
		readFile();

	}
	
	/**
	 * 
	 * Reading of the second level
	 */
	 public void readFile() {
		 try{
		  InputStream flux=new FileInputStream("D:\\Prosits\\Prosits\\2nd Semestre\\UE 2.2 Java\\Projet Java 2\\1stLevel.txt"); 
		  InputStreamReader lecture=new InputStreamReader(flux);
		  BufferedReader buff=new BufferedReader(lecture);
		  String ligne;
		  int i=0;
		  
		  while ((ligne=buff.readLine())!=null){
		      for(int j=0;j<35;j++) {
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
		       
		       else if(ligne.charAt(j) == 'H') {
			        Model.scene[i][j]=new Darkground();   
			    }
		       
		       else if(ligne.charAt(j) == '*') {
		        Model.scene[i][j]=new Diamond();   
		    	Model.allDiamonds.add((Diamond) Model.scene[i][j]);
		        }
		       else if(ligne.charAt(j) == ' ') {
		        Model.scene[i][j]=new Darkground();   
		        }
		      /* else if(ligne.charAt(j) == 'H') {
			         h = new Hero();   
			    }*/
		       
		       else {
		        Model.scene[i][j] = new Ground();
		       }
		       
		       
		       System.out.print(ligne.charAt(j));
		       //System.out.println(Model.scene[i][j]);
		       
		       Model.scene[i][j].setX(31*(j));
		       Model.scene[i][j].setY(31*(i));
		      }
		      
		      System.out.println("");
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
		

		/**
		 * Draw of the image in the table scene
		 */
		for(int i = 0; i<24; i++) {
			for(int j = 0; j<35; j++) {
				if(Model.scene[i][j] != null) {
					g.drawImage(Model.scene[i][j].getImage(),Model.scene[i][j].getX(),Model.scene[i][j].getY(),this);
					}		
				}
		}
		Font font = new Font("Comic Sans MS", Font.BOLD,30);
		g.setFont(font);
		g.setColor(Color.white);
		g.drawString("Score : "+Model.getSc(), 460, 25);
		g.drawString("Time : "+120, 460, 55);
		g.drawImage(h.getImg(),h.getX(), h.getY(),this);
		if(Stars.getX(0) != 0 ) {
			for(int i = 0; i<9; i++) {
				g.drawImage(s.getImg(),s.getX(i),s.getY(i),this);
				int u = h.getY();
				g.drawImage(h.getImg5(),h.getX(), h.getY(),this);u=-31;
				h.setY(u);
			}
			g.setColor(Color.green);
			g.drawString("Game Over", 460, 390);
		}
		
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		repaint();

		
	}
	
	/**
	 *  Methods which control the hero 
	 */
	
	public void moveUp() {
		if (Model.isC1()== true) {
		h.setImg(h.getImg3());
		if (Model.isC() ==true) {
		
		int a = h.getY();
		a-=31;
		h.setY(a);
		
		for(int i=0;i<24;i++) {
			for(int j=0; j<35; j++) {
				    if(Model.scene[i][j].getClass().toString().equals(new Ground().getClass().toString())) {
					System.out.println(Model.scene[i][j].toString());
					    if(h.getX()==Model.scene[i][j].getX() && h.getY()==Model.scene[i][j].getY()) {
					    	int c = Model.scene[i][j].getX();
					    	int b= Model.scene[i][j].getY();
					    	Model.scene[i][j]= new Darkground();
					    	Model.scene[i][j].setX(c);
					    	Model.scene[i][j].setY(b);
					    	
					      break;
				      }
				    }
			}
			}
		}
		}
	}
	
	public void moveDown() {
		if (Model.isD1()== true) {
		h.setImg(h.getImg4());
		if (Model.isD() ==true) {
		
		int a = h.getY();
		a+=31;
		h.setY(a);
		
		for(int i=0;i<24;i++) {
			for(int j=0; j<35; j++) {
				    if(Model.scene[i][j].getClass().toString().equals(new Ground().getClass().toString())) {
					System.out.println(Model.scene[i][j].toString());
					    if(h.getX()==Model.scene[i][j].getX() && h.getY()==Model.scene[i][j].getY()) {
					    	int c = Model.scene[i][j].getX();
					    	int b= Model.scene[i][j].getY();
					    	Model.scene[i][j]= new Darkground();
					    	Model.scene[i][j].setX(c);
					    	Model.scene[i][j].setY(b);
					    	
					      break;
				      }
				    }
				}
			}
		}
		}
	}

	public void moveLeft() {
		if (Model.isA1()== true) {
		h.setImg(h.getImg1());
		if (Model.isA()== true) {
		int a = h.getX();
		a-=31;
		h.setX(a);
	//	repaint();
			
		for(int i=0;i<24;i++) {
			for(int j=0; j<35; j++) {
				    if(Model.scene[i][j].getClass().toString().equals(new Ground().getClass().toString())) {
					System.out.println(Model.scene[i][j].toString());
					    if(h.getX()==Model.scene[i][j].getX() && h.getY()==Model.scene[i][j].getY()) {
					    	int c = Model.scene[i][j].getX();
					    	int b= Model.scene[i][j].getY();
					    	Model.scene[i][j]= new Darkground();
					    	Model.scene[i][j].setX(c);
					    	Model.scene[i][j].setY(b);
					    	
					      break;
				      }
				    }
				}
			}
		}
		}
	//	repaint();
	}

	public void moveRight() {
		if (Model.isB1()== true) {
		h.setImg(h.getImg2());
		if (Model.isB()== true) {
		
		int a = h.getX();
		a+=31;
		h.setX(a);
		for(int i=0;i<24;i++) {
			for(int j=0; j<35; j++) {
				    if(Model.scene[i][j].getClass().toString().equals(new Ground().getClass().toString())) {
				//	System.out.println(Model.scene[i][j].toString());
					    if(h.getX()==Model.scene[i][j].getX() && h.getY()==Model.scene[i][j].getY()) {
					    	int c = Model.scene[i][j].getX();
					    	int b= Model.scene[i][j].getY();
					    	Model.scene[i][j]= new Darkground();
					    	Model.scene[i][j].setX(c);
					    	Model.scene[i][j].setY(b);
					    	
					      break;
				      }
					    
				    }
				}
			}
		}
		}
	}
	
	
	public void reput() {
		for(int i=0;i<24;i++) {
			for(int j=0; j<35; j++) {
				    if(Model.scene[i][j].getClass().toString().equals(new Ground().getClass().toString())) {
					System.out.println(Model.scene[i][j].toString());
					    if(h.getX()==Model.scene[i][j].getX() && h.getY()==Model.scene[i][j].getY()) {
					    	int c = Model.scene[i][j].getX();
					    	int b= Model.scene[i][j].getY();
					    	Model.scene[i][j]= new Darkground();
					    	Model.scene[i][j].setX(c);
					    	Model.scene[i][j].setY(b);
					    	
					      break;
				      }
				    }
				}
			}
		h.setImg(h.getImg());
		System.out.println("Voici moi");
	}




}

