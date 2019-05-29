package Element;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import model.Model;

/**
 * The Class Rock.
 *
 * @author Group7
 */
public class Rock extends mobileElement{
	
	/** The blocking left boolean*/
	public boolean blocking_L=true;
	
	/** The blocking right boolean*/
	public boolean blocking_R=true;
	
	/** The blocking down boolean*/
	public boolean blocking_D=true;
	
	
	/**
	 * Instantiates a new Rock
	 */
	public Rock() {
		this.setImage(new ImageIcon("sprites/rock.png").getImage());
	}
	
	public Rock(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	/**
	 * fix the booleans' values
	 */
	public void fixBooleans(int pos){
		int l=0, r=0, d=0;
		
		for(int i=0;i<25;i++) {
			for(int j=0;j<37;j++) {
				if(
						Model.scene[i][j].getClass().toString().equals(new Wall().getClass().toString()) ||
						Model.scene[i][j].getClass().toString().equals(new Diamond().getClass().toString()) ||
						Model.scene[i][j].getClass().toString().equals(new Ground().getClass().toString())				
				  ) {
					
					if(l==0) {
				if(Model.scene[i][j].getX()==this.getX()-32 && Model.scene[i][j].getY()==this.getY()) {
				   this.blocking_L=true;
				   l++;
				}	 else {
					   this.blocking_L=false;
				   }
				}
				 
					if(r==0) {
				 if(Model.scene[i][j].getX()==this.getX()+32 && Model.scene[i][j].getY()==this.getY()) {
					   this.blocking_R=true;
					   r++;
				 } else {
					 this.blocking_R=false;
					}
				}
				 
					if(d==0) {
				 if(Model.scene[i][j].getX()==this.getX() && Model.scene[i][j].getY()==this.getY()+32) {
					   this.blocking_D=true;
					   d++;
					}else {
					 this.blocking_D=false;
				    }
			     }
					
			  }
		 }	
		}
		//if(blocking_D==false)
			//  fall(this,pos);
	}
	
	public static void fall(Rock rock,int i) {
		//System.out.println(Model.allRocks.get(0).getX()/32+" "+Model.allRocks.get(0).getY()/32);
		  // System.out.println("oui");
		int a = rock.getY()/32;
		int b = rock.getX()/32;
	
		Model.scene[a][b]= new Darkground();
		Model.scene[a+1][b] = new Rock();
		Model.allRocks.set(i, (Rock) Model.scene[a+1][b]);
		
		Model.scene[a][b].setX(32*b); Model.scene[a][b].setY(32*a);
	    Model.scene[a+1][b].setX(32*b);  Model.scene[a+1][b].setY(32*(a+1));
		
		//System.out.println(Model.scene[a][b].getX()/32+" "+Model.scene[a][b].getY()/32);
		//System.out.println(Model.allRocks.get(0).getX()/32+" "+Model.allRocks.get(0).getY()/32);
	}

}
