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

	/**	
	 * Instantiates a new Hero
	 * 
	 */
	public Hero() {
		this.x=5*32;
		this.y=5*32;
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
		if(x >= 16*32-4*32 || x <= 3*32);
	    else 
			this.x = x;
		//System.out.println(x/32);
	}
     
 	/**
 	 * 
 	 * @param y
 	 *       The new y.
 	 */
 	public void setY(int y) {
 		if(y >= 16*32-4*32 || y <= 3*32);
	    else 
			this.y = y;
 	}
	
}