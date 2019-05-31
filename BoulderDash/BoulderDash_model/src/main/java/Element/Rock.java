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
	
	/** The dangerous boolean*/
	public boolean dangerous=false;
	
	/** The speed */
	public int speed=0;
	
	
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
				Model.scene[this.getIndex_i()+1][this.getIndex_j()].getClass().toString().equals(new Ground().getClass().toString())  ||
				Model.scene[this.getIndex_i()+1][this.getIndex_j()].getClass().toString().equals(new Monster().getClass().toString())
		  ) {
			this.blocking_D=true;
			this.carried=false;
			this.speed=0;
		}else {
			if(Model.scene[this.getIndex_i()+1][this.getIndex_j()].getClass().toString().equals(new Darkground().getClass().toString())) {
			this.blocking_D=false; this.carried=false;
			this.speed++;
			}else {
				this.blocking_D=false;	this.carried=true; this.speed=0;
			}
		}
		
		/* carried */
		if(this.getX()==hero.getX() && this.getY()+32==hero.getY()) {
			this.carried=false; this.blocking_D=true; this.speed=0;
		}
		
		/* Blocking_L */
		if(
				this.getX()-32==hero.getX() && this.getY()==hero.getY() || 
				!Model.scene[this.getIndex_i()][this.getIndex_j()-1].getClass().toString().equals(new Darkground().getClass().toString())				
		  ) {
			this.blocking_L=true;
		}else {
			this.blocking_L=false;
		}
		
		
		/* Blocking_R */
		if(
				this.getX()+32==hero.getX() && this.getY()==hero.getY() || 
				!Model.scene[this.getIndex_i()][this.getIndex_j()+1].getClass().toString().equals(new Darkground().getClass().toString())				
		  ) {
			this.blocking_R=true;
		}else {
			this.blocking_R=false;
		}
		
		/* Blocking_LD */
		if(
				this.getX()-32==hero.getX() && this.getY()+32==hero.getY() || 
				!Model.scene[this.getIndex_i()+1][this.getIndex_j()-1].getClass().toString().equals(new Darkground().getClass().toString())				
		  ) {
			this.blocking_LD=true;
		}else {
			this.blocking_LD=false;
		}
		
		/* Blocking_RD */
		if(
				this.getX()+32==hero.getX() && this.getY()+32==hero.getY() ||
				!Model.scene[this.getIndex_i()+1][this.getIndex_j()+1].getClass().toString().equals(new Darkground().getClass().toString())				
		  ) {
			this.blocking_RD=true;
		}else {
			this.blocking_RD=false;
		}
		
		/* dangerous */
		
		if(
				Model.scene[this.getIndex_i()+1][this.getIndex_j()].getClass().toString().equals(new Darkground().getClass().toString()) &&
				hero.getIndex_i()>=this.getIndex_i()+2 && hero.getIndex_j()==this.getIndex_j()
		  ) {
			this.dangerous=true;
		}
		
        if(carried==true && blocking_LD==false && blocking_L==false) {
        	this.move("left",pos);
        }else if(carried==true && blocking_RD==false && blocking_R==false) {
        	this.move("right",pos);
        }
		
		 if(blocking_D==false && carried==false)
		 this.fall(pos);
		 
		 System.out.println(speed);
		// System.out.println(Model.allRocks.get(6).dangerous+" "+hero.getIndex_i()+" "+hero.getIndex_j()+" "+this.getIndex_i()+" "+this.getIndex_j());
		 
		 if(this.speed!=0 && this.getIndex_i()+1==hero.getIndex_i() && this.getIndex_j()==hero.getIndex_j()) {
			 System.out.println("a");
			// System.out.println(this.getIndex_i()+" "+this.getIndex_j());
			 // System.out.println(this.getIndex_i()+" "+hero.getIndex_j());
			 hero.setDead(true);
		 }
		// System.out.println(Model.allRocks.get(pos).getIndex_j()+" "+Model.allRocks.get(pos).getIndex_i());
	 
	}
	
	
	public void fall(int pos) {
		
		//System.out.println(Model.allRocks.get(0).getX()/32+" "+Model.allRocks.get(0).getY()/32);
		  // System.out.println("oui");
		
		int y = this.getY();
		int x = this.getX();
		
		int i = this.getIndex_i();
		int j = this.getIndex_j();
	
		//System.out.println(x+" "+y+" "+i+" "+j);
		Model.scene[i][j]= new Darkground();
		Model.scene[i+1][j] = new Rock();
		
		Model.scene[i][j].setX(x); Model.scene[i][j].setY(y);
	    Model.scene[i+1][j].setX(x);  Model.scene[i+1][j].setY(y+32);
	    Model.allRocks.set(pos, (Rock) Model.scene[i+1][j]);
	    
	    
		//System.out.println(i+" "+j+": "+Model.scene[i][j].getX()/32+" "+Model.scene[i][j].getY()/32);
		//System.out.println((i+1)+" "+j+": "+Model.allRocks.get(pos).getX()/32+" "+Model.allRocks.get(pos).getY()/32);
	}

	public void move(String direction, int pos) {
		
		if(direction == "left") {
			int y = this.getY();
			int x = this.getX();
			
			int i = this.getIndex_i();
			int j = this.getIndex_j();
		
			System.out.println(x/32+" "+y/32+" "+i+" "+j);
			Model.scene[i][j]= new Darkground();
			Model.scene[i][j-1] = new Rock();
	
			Model.scene[i][j].setX(x); Model.scene[i][j].setY(y);
		    Model.scene[i][j-1].setX(x-32);  Model.scene[i][j-1].setY(y);
		    Model.allRocks.set(pos, (Rock) Model.scene[i][j-1]);
		}
		
		else if(direction == "right") {
			int y = this.getY();
			int x = this.getX();
			
			int i = this.getIndex_i();
			int j = this.getIndex_j();
		
			//System.out.println(x+" "+y+" "+i+" "+j);
			Model.scene[i][j]= new Darkground();
			Model.scene[i][j+1] = new Rock();
			
			Model.scene[i][j].setX(x); Model.scene[i][j].setY(y);
		    Model.scene[i][j+1].setX(x+32);  Model.scene[i][j+1].setY(y);
		    Model.allRocks.set(pos, (Rock) Model.scene[i][j+1]);
		}
		
	}



	
}
