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
	
	/** The blocking left down boolean*/
	public boolean blocking_LD=true;
	
	/** The blocking right down boolean*/
	public boolean blocking_RD=true;
	
	
	/** The carried boolean*/
	public boolean carried=false;
	
	
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
	public void fixBooleans(int pos,Hero hero){
		
	//	System.out.println(this.getY()/32);
		
		/* Blocking_D && carried*/
		if(
				Model.scene[this.getIndex_i()+1][this.getIndex_j()].getClass().toString().equals(new Wall().getClass().toString()) ||
				Model.scene[this.getIndex_i()+1][this.getIndex_j()].getClass().toString().equals(new Diamond().getClass().toString()) ||
				Model.scene[this.getIndex_i()+1][this.getIndex_j()].getClass().toString().equals(new Ground().getClass().toString())				
		  ) {
			this.blocking_D=true;
			this.carried=false;
		}else {
			if(Model.scene[this.getIndex_i()+1][this.getIndex_j()].getClass().toString().equals(new Darkground().getClass().toString())) {
			this.blocking_D=false; this.carried=false;
			}else {
				this.blocking_D=false;	this.carried=true;
			}
		}
		
		/* carried */
		if(this.getX()==hero.getX() && this.getY()+32==hero.getY()) {
			this.carried=true;
		}
		
		/* Blocking_L */
		if(
				Model.scene[this.getIndex_i()][this.getIndex_j()-1].getClass().toString().equals(new Wall().getClass().toString()) ||
				Model.scene[this.getIndex_i()][this.getIndex_j()-1].getClass().toString().equals(new Diamond().getClass().toString()) ||
				Model.scene[this.getIndex_i()][this.getIndex_j()-1].getClass().toString().equals(new Ground().getClass().toString())				
		  ) {
			this.blocking_L=true;
		}else {
			this.blocking_L=false;
		}
		
		
		/* Blocking_R */
		if(
				Model.scene[this.getIndex_i()][this.getIndex_j()+1].getClass().toString().equals(new Wall().getClass().toString()) ||
				Model.scene[this.getIndex_i()][this.getIndex_j()+1].getClass().toString().equals(new Diamond().getClass().toString()) ||
				Model.scene[this.getIndex_i()][this.getIndex_j()+1].getClass().toString().equals(new Ground().getClass().toString())				
		  ) {
			this.blocking_R=true;
		}else {
			this.blocking_R=false;
		}
		
		/* Blocking_LD */
		if(
				Model.scene[this.getIndex_i()+1][this.getIndex_j()-1].getClass().toString().equals(new Wall().getClass().toString()) ||
				Model.scene[this.getIndex_i()+1][this.getIndex_j()-1].getClass().toString().equals(new Diamond().getClass().toString()) ||
				Model.scene[this.getIndex_i()+1][this.getIndex_j()-1].getClass().toString().equals(new Ground().getClass().toString())				
		  ) {
			this.blocking_LD=true;
		}else {
			this.blocking_LD=false;
		}
		
		/* Blocking_RD */
		if(
				Model.scene[this.getIndex_i()+1][this.getIndex_j()+1].getClass().toString().equals(new Wall().getClass().toString()) ||
				Model.scene[this.getIndex_i()+1][this.getIndex_j()+1].getClass().toString().equals(new Diamond().getClass().toString()) ||
				Model.scene[this.getIndex_i()+1][this.getIndex_j()+1].getClass().toString().equals(new Ground().getClass().toString())				
		  ) {
			this.blocking_RD=true;
		}else {
			this.blocking_RD=false;
		}
		
		

		 if(blocking_D==false && carried==false)
		 fall(this,pos);	
		// System.out.println(Model.allRocks.get(pos).getIndex_j()+" "+Model.allRocks.get(pos).getIndex_i());
	 
	}
	
	
	public static void fall(Rock rock,int pos) {
		
		//System.out.println(Model.allRocks.get(0).getX()/32+" "+Model.allRocks.get(0).getY()/32);
		  // System.out.println("oui");
		
		int y = rock.getY();
		int x = rock.getX();
		
		int i = rock.getIndex_i();
		int j = rock.getIndex_j();
	
		//System.out.println(x+" "+y+" "+i+" "+j);
		Model.scene[i][j]= new Darkground();
		Model.scene[i+1][j] = new Rock();
		
		Model.scene[i][j].setX(x); Model.scene[i][j].setY(y);
	    Model.scene[i+1][j].setX(x);  Model.scene[i+1][j].setY(y+32);
	    Model.allRocks.set(pos, (Rock) Model.scene[i+1][j]);
	    
	    
		//System.out.println(i+" "+j+": "+Model.scene[i][j].getX()/32+" "+Model.scene[i][j].getY()/32);
		//System.out.println((i+1)+" "+j+": "+Model.allRocks.get(pos).getX()/32+" "+Model.allRocks.get(pos).getY()/32);
	}

}
