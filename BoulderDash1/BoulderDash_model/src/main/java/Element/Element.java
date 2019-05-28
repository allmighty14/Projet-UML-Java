
package Element;

import java.awt.Image;

/**
 * The Class Element.
 *
 * @author Group7
 */
public abstract class Element {

	/**The x coordinate*/
	protected int x;
	
	/**The y coordinate*/
    protected int y;
    
    /**The image*/
    protected Image image;


   
    
    /**
     * Gets the x coordinate.
     * 
     * @return the integer x
     */
	public int getX() {
		return x;
	}

	/**
	 * 
	 * @param x
	 *       The new x.
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
     * Gets the y coordinate.
     * 
     * @return the integer y
     */
	public int getY() {
		return y;
	}

	/**
	 * 
	 * @param y
	 *       The new y.
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
     * Gets the image.
     * 
     * @return the image
     */
	public Image getImage() {
		return image;
	}

	/**
	 * 
	 * @param image
	 *       The new image.
	 */
	public void setImage(Image image) {
		this.image = image;
	}
    
	/**
	 * Gives the Element's zone
	 * 
	 * @return a tab containing the zone
	 */
	public int [] Zone() {
		 
		 int [] tab = new int[4];

				tab[0]=this.getX();
				tab[1]=this.getX()+this.getImage().getWidth(null);
				tab[2]=this.getY();
				tab[3]=this.getY()+this.getImage().getHeight(null);
			//	System.out.println(tab[0]+" "+tab[1]+" "+tab[2]+" "+tab[3]);
		return tab;

	  }
}
