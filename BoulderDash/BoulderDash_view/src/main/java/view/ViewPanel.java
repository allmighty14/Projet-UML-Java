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
	Rochers r = new Rochers();
    Personnage p = new Personnage();
    Diamants d = new Diamants();
    Monstres mm = new Monstres();
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
		
		
	    
		
		
		/*File file = new File("D:\\Prosits\\Prosits\\2nd Semestre\\UE 2.2 Java\\Projet Java 2\\1erNiveau.txt");
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
	        	    
	        	  //  while(line!=null) {
	        	  //  	System.out.println(line);
	        	    	for(int i=0; i<2; i++) {
	        	        	for(int j=0; j<2; j++) {
	        	        	   /* switch(line.charAt(j)) {
	        	        	    case 'G':
	        	        	    	g1.setPosY((i*31), a);
	        	        		    g1.setPosX((j*31), j);
	        	        	    	break;
	        	        	    case  'W':
	        	        	    	
	        	        	    	break;
	        	        		*//*if(line.charAt(j) == 'G') {
	        	        		    	g1.setPosY((i*31), a);
		        	        		    g1.setPosX((j*31), j);
	        	        		}
	        	        		
	        	        		/*else if(line.charAt(j) == 'W') {
		        	        		    	w.setPosY((i*31), a);
			        	        		    w.setPosX((j*31), j);
		        	        	}
	        	        		
	        	        		else if(line.charAt(j) == 'O') {
		        	        		    	r.setPosY((i*31), a);
			        	        		    r.setPosX((j*31), j);
	        	        		}
	        	        		
	        	        		else if(line.charAt(j) == 'H') {
		        	        		    	p.setPosY((i*31), a);
		        	        		    	p.setPosX((j*31), j);
		        	            }
        	        			
	        	        		else if(line.charAt(j) == '*') {
		        	        		    	d.setPosY((i*31), a);
			        	        		    d.setPosX((j*31), j);
	        	        		}
	        	        		
	        	        		else if(line.charAt(j) == 'M') {
		        	        		    	mm.setPosY((i*31), a);
			        	        		   mm.setPosX((j*31), j);
			        	        }/*
	        	        	    }
	        	          //  System.out.print(line.charAt(j));
	        	            }
	        	        	a++;
	        	        	System.out.println(""); 
	        	        //	line = reader.readLine();
	        	    	//}
	        	        	
	        //	   }
	        	        	
	        	    //}
	        	    reader.close();
	        	    
	        	    
				
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        }*/
        
       
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
		//     g.drawImage(p.getImg(), p.getPosX(j), p.getPosY(i),this );
		   
		     j+=31;
		     
		//g.fillRect(0, 0, this.getWidth(), this.getHeight());
	    	 }
	    	 i+=31;
	     }
	    
	    /* for(int i=0; i<1; i++) {
	    	 for(int j=0; j<1; j++) {
	    		 if ( g1.getPosX(j)!=0 && g1.getPosY(i)!= 0) {
	    			 g.drawImage(g1.getImg(), g1.getPosX(j), g1.getPosY(i),this );
	    			 System.out.println(g1.getPosX(j));
	    			 System.out.println(r.getPosX(j));
	    		// }  
	    		// g.drawImage(w.getImg(), w.getPosX(j), w.getPosY(i),this );
	    		 // g.drawImage(r.getImg(), r.getPosX(j), r.getPosY(i),this );
	    		// }
	      	// }
	     //}
	    	 }
	    	 }
	     }*/

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
		        	   	System.out.println(line);
		        	    	//for(int i=0; i<24; i++) {
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
		        	        		
		        	        		else if(line.charAt(j) == 'H') {
			        	        		    	p.setPosY((i*31), i);
			        	        		    	p.setPosX((j*31), j);
			        	        		    	g.drawImage(p.getImg(), p.getPosX(j), p.getPosY(i),this );
			        	            }
	        	        			
		        	        		else if(line.charAt(j) == '*') {
			        	        		    	d.setPosY((i*31), i);
				        	        		    d.setPosX((j*31), j);
		        	        		}
		        	        		
		        	        		else if(line.charAt(j) == 'M') {
			        	        		    	mm.setPosY((i*31), i);
				        	        		   mm.setPosX((j*31), j);
				        	        }
		        	        	   
		        	            System.out.print(line.charAt(j));
		        	            }
		        	        	a++;
		        	        	i++;
		        	        	System.out.println(""); 
		        	        	line = reader.readLine();
		        	    	//}
		        	        	
		        //	   }
		        	        	
		        	    }
		        	    reader.close();
		        	    
		        	    
					
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	        }
	        
	       
		}
}
	    	 

	
	
