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

import DAO.DAOLevel;
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
	DAOLevel d = new DAOLevel();
	Image img;
    
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
	 public void readFile() {/*
		 try{
		  InputStream flux=new FileInputStream("D:\\Prosits\\Prosits\\2nd Semestre\\UE 2.2 Java\\Projet Java 2\\1stLevel.txt"); 
		  InputStreamReader lecture=new InputStreamReader(flux);
		  BufferedReader buff=new BufferedReader(lecture);
		  String ligne;
		  int i=0;
		  
		  while ((ligne=buff.readLine())!=null){
		      */
		 for(int i=0;i<24;i++) {
		 	for(int j=0;j<35;j++) {
		       if(/*ligne.charAt(j)*/d.getScenetest()[i][j] == 'G') {
		       Model.scene[i][j]=new Ground(); 
		       }
		       
		       else if(/*ligne.charAt(j)*/d.getScenetest()[i][j] == 'W') {
		        Model.scene[i][j]=new Wall();   
		        }
		       
		       else if(/*ligne.charAt(j)*/d.getScenetest()[i][j] == 'O') {
		        Model.scene[i][j]=new Rock();   
		        }
		       
		       else if(/*ligne.charAt(j)*/d.getScenetest()[i][j] == 'M') {
		        Model.scene[i][j]=new Monster();   
		        }
		       
		       else if(/*ligne.charAt(j)*/d.getScenetest()[i][j] == 'H') {
			        Model.scene[i][j]=new Darkground();   
			    }
		       
		       else if(/*ligne.charAt(j)*/d.getScenetest()[i][j] == '*') {
		        Model.scene[i][j]=new Diamond();   
		    	Model.allDiamonds.add((Diamond) Model.scene[i][j]);
		        }
		       else if(/*ligne.charAt(j)*/d.getScenetest()[i][j] == ' ') {
		        Model.scene[i][j]=new Darkground();   
		        }
		      /* else if(ligne.charAt(j) == 'H') {
			         h = new Hero();   
			    }*/
		       
		       else {
		        Model.scene[i][j] = new Ground();
		       }
		       
		       Model.scene[i][j].setX(31*(j));
		       Model.scene[i][j].setY(31*(i));
		 	}
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
		g.setColor(Color.blue);
		g.fillRoundRect(512,15,74,28, 8, 8);
		g.setColor(Color.black);
		g.fillRoundRect(514,18,68,23,8,8);
		Font font2 = new Font("Comic Sans MS", Font.BOLD,17);
		g.setFont(font2);
		g.setColor(Color.white);
		g.drawString(" "+Model.getSc(), 514, 36);
		g.setColor(Color.blue);
		g.fillRoundRect(1007,2,74,28, 8, 8);
		g.setColor(Color.black);
		g.fillRoundRect(1009,5,68,23,8,8);
		Image img1;
		try {	
			img1 = ImageIO.read(new File("D:\\Prosits\\Prosits\\2nd Semestre\\UE 2.2 Java\\Projet Java 2\\Images\\dia.png"));
			g.drawImage(img1, 1014, 5, this);
			Font font = new Font("Comic Sans MS", Font.BOLD,17);
			g.setFont(font);
			g.setColor(Color.white);
			g.drawString("  :"+Model.getDia(), 1025, 21);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	if(Stars.getX(0) == 0 && Model.getSc()!= 120 ) {
		g.setColor(Color.blue);	
		g.fillRoundRect(1007,35,74,28, 8, 8);
		g.setColor(Color.black);
		g.fillRoundRect(1009,38,68,23,8,8);
		
		
		try {	
			img = ImageIO.read(new File("D:\\Prosits\\Prosits\\2nd Semestre\\UE 2.2 Java\\Projet Java 2\\Images\\time.png"));
			g.drawImage(img, 1014, 38, this);
			Font font = new Font("Comic Sans MS", Font.BOLD,17);
			g.setFont(font);
			g.setColor(Color.white);
			g.drawString("  :"+Model.getTi(), 1025, 54);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		if (Model.getSc()== 120) {
			Font font = new Font("Comic Sans MS", Font.BOLD,50);
			g.setFont(font);

			g.drawString("YOU WIN", 480, 390);
			Model.setA1(false);
			Model.setB1(false);
			Model.setC1(false);
			Model.setD1(false);
		}
		if (Model.getTi()== 0 && Model.getSc()!= 150) {
			Font font = new Font("Comic Sans MS", Font.BOLD,50);
			g.setFont(font);

			g.drawString("YOU LOSE", 480, 390);
			Model.setA1(false);
			Model.setB1(false);
			Model.setC1(false);
			Model.setD1(false);
			g.setColor(Color.blue);	
			g.fillRoundRect(1007,35,74,28, 8, 8);
			g.setColor(Color.black);
			g.fillRoundRect(1009,38,68,23,8,8);
			g.drawImage(img, 1014, 38, this);
				g.setFont(font);
				g.setColor(Color.white);
				g.drawString("  : "+0, 1025, 54);
			
		}
		g.drawImage(h.getImg(),h.getX(), h.getY(),this);
		if(Stars.getX(0) != 0 ) {
			for(int i = 0; i<9; i++) {
				g.drawImage(s.getImg(),s.getX(i),s.getY(i),this);
			}
			int u = h.getY();
			g.drawImage(h.getImg5(),h.getX(), h.getY(),this);
			u=-31;
			h.setY(u);
			g.setColor(Color.green);
			Font font = new Font("Comic Sans MS", Font.BOLD,50);
			g.setFont(font);
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

