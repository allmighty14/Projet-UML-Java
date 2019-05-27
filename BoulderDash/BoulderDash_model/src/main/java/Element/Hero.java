package Element;

import javax.swing.ImageIcon;
import model.Model;
import contract.IView;
 
/**
 * The Class Hero.
 *
 * @author Group7
 */
public class Hero extends mobileElement{
	
	/** The freeze boolean*/
	private boolean freeze;
	
	
	/**	
	 * Instantiates a new Hero
	 * 
	 */
	public Hero() {
		this.x=6*32;
		this.y=6*32;
		this.setMoveup(true);
		this.setMoveright(true);
		this.setMovedown(true);
		this.setMoveleft(true);
	    this.freeze=false;
		this.setImage(new ImageIcon("sprites/hero.png").getImage());
	}

	/**
	 *  Digs the ground
	 */
	public void dig (){
		for(int i=0;i<25;i++) {
			for(int j=0; j<37; j++) {
				    if(Model.scene[i][j].getClass().toString().equals(new Ground().getClass().toString())) {
					//System.out.println(Model.scene[i][j].toString());
					    if(this.getX()==Model.scene[i][j].getX() && this.getY()==Model.scene[i][j].getY()) {
					    	int a = Model.scene[i][j].getX();
					    	int b= Model.scene[i][j].getY();
					    	Model.scene[i][j]= new Darkground();
					    	Model.scene[i][j].setX(a);
					    	Model.scene[i][j].setY(b);
					    	
					      break;
				      }
			}
		}		
}
}
	
	/**
	 * 
	 * @param x
	 *       The new x.
	 */
     public void setX(int x) {
		
			if(this.isMoveleft()==true) {
			
				if(
					(x < 16*32-4*32 && x > 3*32) || 
					((x >= 16*32-4*32 || x <= 3*32) && (Model.scene[0][0].getX() == 0) && (this.x < 8*32)) ||
					((x >= 16*32-4*32 || x <= 3*32) && (Model.scene[0][36].getX() == 15*32) && (this.x > 8*32))
			            
				) {
					
				freeze=false;
				this.x = x;		
				//System.out.println("oui");
				}
		
		else {
				freeze=true;
			}
		}
    	 
			else if(this.isMoveright()==true) {
				if(
						(x < 16*32-4*32 && x > 3*32) || 
						((x >= 16*32-4*32 || x <= 3*32) && (Model.scene[0][0].getX() == 0) && (this.x < 8*32)) ||
						((x >= 16*32-4*32 || x <= 3*32) && (Model.scene[0][36].getX() == 15*32) && (this.x > 8*32))
			     ) {
				freeze=false;
				this.x = x;		
				//System.out.println("oui");
				}
		
		else {
				freeze=true;
			}
		}
		
		
		
	}
    
     /**
  	 * Gets the freeze value
  	 * 
  	 * @return the freeze boolean
  	 */
 	public boolean isFreeze() {
		return freeze;
	}

 	
	/**
	 * 
	 * @param freeze
	 *          the new freeze value
	 */
	public void setFreeze(boolean freeze) {
		this.freeze = freeze;
	}

	/**
 	 * 
 	 * @param y
 	 *       The new y.
 	 */
 	public void setY(int y) {
 		
 		if(this.isMoveup()==true) {
			
			if(
				(y < 16*32-4*32 && y > 3*32) || 
				((y >= 16*32-4*32 || y <= 3*32) && (Model.scene[0][0].getY() == 0) && (this.y < 8*32)) ||
				((y >= 16*32-4*32 || y <= 3*32) && (Model.scene[24][0].getY() == 15*32) && (this.y > 8*32))
		            
			) {
				
			freeze=false;
			this.y = y;		
			//System.out.println("oui");
			}
	
	else {
			freeze=true;
		}
	}
	 
		else if(this.isMovedown()==true) {
			if(
					(y < 16*32-4*32 && y > 3*32) || 
					((y >= 16*32-4*32 || y <= 3*32) && (Model.scene[0][0].getY() == 0) && (this.y < 8*32)) ||
					((y >= 16*32-4*32 || y <= 3*32) && (Model.scene[24][0].getY() == 15*32) && (this.y > 8*32))
		     ) {
			freeze=false;
			this.y = y;		
			//System.out.println("oui");
			}
	
	else {
			freeze=true;
		}
	}

 	}
 	
 	
 	public void collision(Element obstacle) {
		 if(((this.Zone()[0] == obstacle.Zone()[0] && obstacle.Zone()[1] == this.Zone()[1]) && (this.Zone()[2] == obstacle.Zone()[3]))) {
			 this.setMoveup(false);
		 }
			 
		 
		 if((this.Zone()[0] == obstacle.Zone()[0] && obstacle.Zone()[1] == this.Zone()[1]) && (this.Zone()[3] == obstacle.Zone()[2])){
			this.setMovedown(false);
		}
			
		 if((obstacle.Zone()[2] == this.Zone()[2] && this.Zone()[3] == obstacle.Zone()[3]) && (obstacle.Zone()[1] == this.Zone()[0])){
			this.setMoveleft(false);			
		 }
		 
		 if((obstacle.Zone()[2] == this.Zone()[2] && this.Zone()[3] == obstacle.Zone()[3]) && (obstacle.Zone()[0] == this.Zone()[1])){
			this.setMoveright(false);
		}
		 

       }


	
}