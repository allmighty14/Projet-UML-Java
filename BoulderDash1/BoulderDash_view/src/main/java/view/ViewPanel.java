package view;

import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javafx.scene.paint.Color;
import model.*;


/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
public class ViewPanel extends JPanel {
	
	BGround g2 = new BGround();
	Ground g1=new Ground();
	Wall w = new Wall();
	Rocks r = new Rocks();
    Personnage p = new Personnage();
    Diamond d = new Diamond();
    Monsters mm = new Monsters();
    int i =0;
    int a =0;
    
	String line;
	
	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel() {
		Model m = new Model();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(final Graphics g) {
	     for(int i=0; i<=768; i++) {
	    	 for(int j=0; j<=1088; j++) {
		     g2.setPosX(j);
		     g2.setPosY(i);
		     g.drawImage(g2.getImg(), g2.getPosX() , g2.getPosY(), this);
		
		     j+=31;
		     
	    	 }
	    	 i+=31;
	     }

			File file = new File("D:\\Prosits\\Prosits\\2nd Semestre\\UE 2.2 Java\\Projet Java 2\\1stLevel.txt");
	        		BufferedReader reader;
					try {
						reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
						 line = reader.readLine();
		        	    	for(int i=0; i<24; i++) {
		        	        	for(int j=0; j<35; j++) {
		        	        		if(line.charAt(j) == 'G') {
		        	        		    	g1.setPosY((i*31), i);
			        	        		    g1.setPosX((j*31), j);
			        	        			g.drawImage(g1.getImg(), g1.getPosX(j), g1.getPosY(i),this );

		        	        		}
		        	        		
		        	        		else if(line.charAt(j) == 'W') {
			        	        		    	w.setPosY((i*31), i);
				        	        		    w.setPosX((j*31), j);
				        	        		    g.drawImage(w.getImg(), w.getPosX(j), w.getPosY(i),this );
			        	        	}
		        	        		
		        	        		else if(line.charAt(j) == 'O') {
			        	        		    	r.setPosY((i*31), i);
				        	        		    r.setPosX((j*31), j);
				        	        		    g.drawImage(r.getImg(), r.getPosX(j), r.getPosY(i),this );
		        	        		}
		        	        		else if(line.charAt(j) == '*') {
			        	        		    	d.setPosY((i*31), i);
				        	        		    d.setPosX((j*31), j);
				        	        		    g.drawImage(d.getImg(0), d.getPosX(j), d.getPosY(i),this );
		        	        		}
		        	        		
		        	        		else if(line.charAt(j) == 'M') {
			        	        		    	mm.setPosY((i*31), i);
				        	        		   mm.setPosX((j*31), j);
				        	        }
		        	        	   
		        	            System.out.print(line.charAt(j));
		        	            }
		        	        	System.out.println(""); 
		        	        	line = reader.readLine();
		        	    }
		        	    reader.close();
		        	    
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	        
	      	g.drawImage(p.getImg(), p.getPosX(), p.getPosY(),this );

	      	for(int i=0; i<24; i++) {
	        	for(int j=0; j<35; j++) {
	        		if (p.getPosX()== g1.getPosX(j) && p.getPosY() == g1.getPosX(i)) {
	        		//	g1.setPosY((0), i);
        		   //     g1.setPosX((0), j);
        		        g.drawImage(g2.getImg(), g1.getPosX(j) , g1.getPosY(i), this);
        		    	g.drawImage(p.getImg(), p.getPosX(), p.getPosY(),this );

	        			System.out.println("Je suis là");
	        			System.out.println(g2.getPosX());
	        			System.out.println(p.getPosX());
	        			
	        		}
	        	}
	      	}
	       
		}

	  
	public  void moveUp() {
		int a = p.getPosY();
		a-=31;
		p.setPosY(a);
		this.repaint();
	}
	
	public  void moveDown() {
		int a = p.getPosY();
		a+=31;
		p.setPosY(a);
		this.repaint();
	}
	
	public  void moveLeft() {
		int a = p.getPosX();
		a-=31;
		p.setPosX(a);
		this.repaint();
	}
	
	public  void moveRight() {
		int a = p.getPosX();
		a+=31;
		p.setPosX(a);
		this.repaint();
	}

}

	
	
