package Element;

/**
 * The Class mobileElement.
 *
 * @author Group7
 */
public abstract class mobileElement extends Element{

	/**
	 *  moves the element.
	 *   
	 * @param direction
	 *          the direction
	 */
	public void move(char direction) {
	    	
	    	if(direction=='U')
	    		this.setY(this.getY()-32);	
	    	
	    	else if(direction=='D')
	    		this.setY(this.getY()+32);
	    	
	    	else if(direction=='L')
	    		this.setX(this.getX()-32);
	    	
	    	else if(direction=='R')
	    		this.setX(this.getX()+32);
	    }
}
