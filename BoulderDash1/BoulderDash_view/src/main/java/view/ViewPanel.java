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

			File file = new File("D:\\Prosits\\Prosits\\2nd Semestre\\UE 2.2 Java\\Projet Java 2\\1erNiveau.txt");
	        if(!file.exists()) {
	        	try {
					file.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	        
	        else {
	        		BufferedReader reader;
					try {
						reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
						 line = reader.readLine();
		        	    
		        	   while(line!=null) {
		        //   	System.out.println(line);
		        	   // 	for(int i=0; i<24; i++) {
		        	        	for(int j=0; j<35; j++) {
		        	        	   /* switch(line.charAt(j)) {
		        	        	    case 'G':
		        	        	    	g1.setPosY((i*31), a);
		        	        		    g1.setPosX((j*31), j);
		        	        	    	break;
		        	        	    case  'W':
		        	        	    	
		        	        	    	break;
		        	        		*/if(line.charAt(j) == 'G') {
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
		        	        		
		        	        		/*else if(line.charAt(j) == 'H') {
		        	        			KeyBoard.p1.setPosY((i*31));
			        	        		    	KeyBoard.p1.setPosX((j*31));
			        	        		    	g.drawImage(KeyBoard.p1.getImg(), KeyBoard.p1.getPosX(), KeyBoard.p1.getPosY(),this );
			        	        		    	System.out.println(KeyBoard.p1.getPosY());
			        	            }
	        	        			*/
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
		        	    	
		        	        	//a++;
		        	        	i++;
		        	        	System.out.println(""); 
		        	        	line = reader.readLine();
		        	    }
		        	   
		        	   
		        	    reader.close();
		        	    
		        	    
					
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	        }
	        
	      	g.drawImage(p.getImg(), p.getPosX(), p.getPosY(),this );
	      
	        
	       // repaint();
	        
	       
		}

	  
	public  void moveUp() {
		int a = p.getPosY();
		a--;
		p.setPosY(a);
		this.repaint();
	}
	
	public  void moveDown() {
		int a = p.getPosY();
		a++;
		p.setPosY(a);
		this.repaint();
	}
	
	public  void moveLeft() {
		int a = p.getPosX();
		a--;
		p.setPosX(a);
		this.repaint();
	}
	
	public  void moveRight() {
		int a = p.getPosX();
		a++;
		p.setPosX(a);
		this.repaint();
	}

}

	
	
