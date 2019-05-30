package Element;

import model.Model;

/**
 * The Class mobileElement.
 *
 * @author Group7
 */
public abstract class mobileElement extends Element{

	/** The moveup boolean*/
	private boolean moveup;
	
	/** The movedown boolean*/
	private boolean movedown;
	
	/** The moveleft boolean*/
	private boolean moveleft;
	
	/** The moveright boolean*/
	private boolean moveright;
	
	/**
	 *  moves the element.
	 *   
	 * @param direction
	 *          the direction
	 */
	public void move(char direction) {
	    	
		 if(direction=='U') {
					this.setMoveup(true);
			    	   this.setMovedown(false);
		    		this.setY(this.getY()-32);
	    	}
	    	
	    	else if(direction=='D') {
						this.setMoveup(false);
				    	   this.setMovedown(true);
			    		this.setY(this.getY()+32);
	    	}
	    	
	    	else if(direction=='L') {
	 
						this.setMoveleft(true);
			    	   this.setMoveright(false);
		    		this.setX(this.getX()-32);
	    	}
	    	
	    	else if(direction=='R') {
					this.setMoveright(true);
			    	   this.setMoveleft(false);
		    		this.setX(this.getX()+32);
		 	}

	    }
	
 	/**
 	 * Gets the moveup value
 	 * 
 	 * @return the moveup boolean
 	 */
	public boolean isMoveup() {
		return moveup;
	}

	/**
	 * 
	 * @param moveup
	 *          the new moveup value
	 */
	public void setMoveup(boolean moveup) {
		this.moveup = moveup;
	}

	/**
 	 * Gets the movedown value
 	 * 
 	 * @return the movedown boolean
 	 */
	public boolean isMovedown() {
		return movedown;
	}

	/**
	 * 
	 * @param movedown
	 *          the new movedown value
	 */
	public void setMovedown(boolean movedown) {
		this.movedown = movedown;
	}

	
	/**
 	 * Gets the moveleft value
 	 * 
 	 * @return the moveleft boolean
 	 */
	public boolean isMoveleft() {
		return moveleft;
	}

	
	/**
	 * 
	 * @param moveleft
	 *          the new moveleft value
	 */
	public void setMoveleft(boolean moveleft) {
		this.moveleft = moveleft;
	}

	/**
 	 * Gets the moveright value
 	 * 
 	 * @return the moveright boolean
 	 */
	public boolean isMoveright() {
		return moveright;
	}

	
	/**
	 * 
	 * @param moveright
	 *          the new moveright value
	 */
	public void setMoveright(boolean moveright) {
		this.moveright = moveright;
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
 	
 	public int getIndex_i(){
 		return (this.getY()+Model.getLag_T())/32; 
 	}
 	
	public int getIndex_j(){
 		return (this.getX()+Model.getLag_L())/32; 
 	}
}
