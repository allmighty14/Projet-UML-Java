package Element;

import model.Model;

public class MobileElement {
     /**
      * 
      * A Method which coordinate the movements of the scene objects
      */
	public static void moves() {
		for(int i=0;i<23;i++) {
			for(int j=0; j<35; j++) {
				    if(Model.scene[i][j].getClass().toString().equals(new Rock().getClass().toString()) && Model.scene[(i+1)][j].getClass().toString().equals(new Darkground().getClass().toString())) {
				    	if (Hero.getX()==Model.scene[i][j].getX() && Hero.getY()==Model.scene[i+1][j].getY()){
				
				    	}
				    	
/**
 * The hero die when a Rock falls on his head				    	
 */
				    	
				    	else if ((Hero.getX()==Model.scene[i+2][j].getX() && Hero.getY()==Model.scene[i+2][j].getY())) {
				    		int b= Model.scene[i][j].getY();
				    		int c = Model.scene[i][j].getX();
				    		Model.scene[i][j]= new Darkground();
				    		Model.scene[i][j].setX(c);
				    		Model.scene[i][j].setY(b);
				    		int y= Model.scene[i][j-1].getY();
				    		int z = Model.scene[i][j-1].getX();
				    		Model.scene[i][j-1]= new Darkground();
				    		Model.scene[i][j-1].setX(z);
				    		Model.scene[i][j-1].setY(y);
				    		
				    		int b2= Model.scene[i][j+1].getY();
				    		int c2 = Model.scene[i][j+1].getX();
				    		Model.scene[i][j+1]= new Darkground();
				    		Model.scene[i][j+1].setX(c2);
				    		Model.scene[i][j+1].setY(b2);
				    		
				    		int c3 = Model.scene[i+1][j+1].getX();
				    		int b3= Model.scene[i+1][j+1].getY();
				    		Model.scene[i+1][j+1]= new Darkground();
				    		Model.scene[i+1][j+1].setX(c3);
				    		Model.scene[i+1][j+1].setY(b3);
				    		int c4 = Model.scene[i+1][j-1].getX();
				    		int b4= Model.scene[i+1][j-1].getY();
				    		Model.scene[i+1][j-1]= new Darkground();
				    		Model.scene[i+1][j-1].setX(c4);
				    		Model.scene[i+1][j-1].setY(b4);
				    		
				    		int c5 = Model.scene[i+2][j+1].getX();
				    		int b5= Model.scene[i+2][j+1].getY();
				    		Model.scene[i+2][j+1]= new Darkground();
				    		Model.scene[i+2][j+1].setX(c5);
				    		Model.scene[i+2][j+1].setY(b5);
				    		int c6 = Model.scene[i+2][j-1].getX();
				    		int b6= Model.scene[i+2][j-1].getY();
				    		Model.scene[i+2][j-1]= new Darkground();
				    		Model.scene[i+2][j-1].setX(c6);
				    		Model.scene[i+2][j-1].setY(b6);
				    		
				    		int a = Model.scene[(i+2)][j].getX();
					    	int d= Model.scene[(i+2)][j].getY();
					    	Model.scene[(i+2)][j]=new Rock();
					    	Model.scene[(i+2)][j].setX(a);
					    	Model.scene[(i+2)][j].setY(d);
					    	Model.scene[(i+2)][j]=new Darkground();
					    	Model.scene[(i+2)][j].setX(a);
					    	Model.scene[(i+2)][j].setY(d);
					    	int r= Model.scene[i-1][j].getY();
				    		int g = Model.scene[i-1][j].getX();
				    		Model.scene[i-1][j]= new Darkground();
				    		Model.scene[i-1][j].setX(g);
				    		Model.scene[i-1][j].setY(r);
					    	Hero.setX(g);
					    	Hero.setY(r);
					    	Stars.setY( Model.scene[i][j-1].getY(), 0);
					    	Stars.setY( Model.scene[i][j].getY(), 1);
					    	Stars.setY( Model.scene[i][j+1].getY(), 2);
					    	Stars.setY( Model.scene[i+1][j-1].getY(), 3);
					    	Stars.setY( Model.scene[i+1][j].getY(), 4);
					    	Stars.setY( Model.scene[i+1][j+1].getY(), 5);
					    	Stars.setY( Model.scene[i+2][j-1].getY(), 6);
					    	Stars.setY( Model.scene[i+2][j].getY(), 7);
					    	Stars.setY( Model.scene[i+2][j+1].getY(), 8);
					    	
					    	Stars.setX( Model.scene[i][j-1].getX(), 0);
					    	Stars.setX( Model.scene[i][j].getX(), 1);
					    	Stars.setX( Model.scene[i][j+1].getX(), 2);
					    	Stars.setX( Model.scene[i+1][j-1].getX(), 3);
					    	Stars.setX( Model.scene[i+1][j].getX(), 4);
					    	Stars.setX( Model.scene[i+1][j+1].getX(), 5);
					    	Stars.setX( Model.scene[i+2][j-1].getX(), 6);
					    	Stars.setX( Model.scene[i+2][j].getX(), 7);
					    	Stars.setX( Model.scene[i+2][j+1].getX(), 8);
					    	Model.setA1(false);
					    	Model.setB1(false);
					    	Model.setC1(false);
					    	Model.setD1(false);
				    	}
				    	
				    	else {
				    	
				    	int c = Model.scene[i][j].getX();
				    		int b= Model.scene[i][j].getY();
				    		Model.scene[i][j]= new Darkground();
				    		Model.scene[i][j].setX(c);
				    		Model.scene[i][j].setY(b);
				    		
				    		int a = Model.scene[(i+1)][j].getX();
					    	int d= Model.scene[(i+1)][j].getY();
					    	Model.scene[(i+1)][j]=new Rock();
					    	Model.scene[(i+1)][j].setX(a);
					    	Model.scene[(i+1)][j].setY(d);
					 //   	System.out.println("Je suis exécuté");
				    	}
					    	break;
				      }
				    
				    
				    if(Model.scene[i][j].getClass().toString().equals(new Diamond().getClass().toString()) && Model.scene[(i+1)][j].getClass().toString().equals(new Darkground().getClass().toString())) {
				    	if (Hero.getX()==Model.scene[i][j].getX() && Hero.getY()==Model.scene[i+1][j].getY()){
				    		int a = Model.scene[(i)][j].getX();
					    	int d= Model.scene[(i)][j].getY();
					    	Model.scene[(i)][j]=new Diamond();
					    	Model.allDiamonds.add((Diamond) Model.scene[i][j]);
					    	Model.scene[(i)][j].setX(a);
					    	Model.scene[(i)][j].setY(d);

				    	}
	
	/**
	 * The hero die when a Diamond falls on his head				    	
	 */
				    	
				    	
				    	else if ((Hero.getX()==Model.scene[i+2][j].getX() && Hero.getY()==Model.scene[i+2][j].getY())) {
				    		int b= Model.scene[i+1][j].getY();
				    		int c = Model.scene[i+1][j].getX();
				    		Model.scene[i+1][j]= new Darkground();
				    		Model.scene[i+1][j].setX(c);
				    		Model.scene[i+1][j].setY(b);
				    		int y= Model.scene[i+1][j-1].getY();
				    		int z = Model.scene[i+1][j-1].getX();
				    		Model.scene[i+1][j-1]= new Darkground();
				    		Model.scene[i+1][j-1].setX(z);
				    		Model.scene[i+1][j-1].setY(y);
				    	
				    	int b2= Model.scene[i+1][j+1].getY();
			    		int c2 = Model.scene[i+1][j+1].getX();
			    		Model.scene[i+1][j+1]= new Darkground();
			    		Model.scene[i+1][j+1].setX(c2);
			    		Model.scene[i+1][j+1].setY(b2);
			    		
			    		int c3 = Model.scene[i+2][j+1].getX();
			    		int b3= Model.scene[i+2][j+1].getY();
			    		Model.scene[i+2][j+1]= new Darkground();
			    		Model.scene[i+2][j+1].setX(c3);
			    		Model.scene[i+2][j+1].setY(b3);
			    		int c4 = Model.scene[i+2][j-1].getX();
			    		int b4= Model.scene[i+2][j-1].getY();
			    		Model.scene[i+2][j-1]= new Darkground();
			    		Model.scene[i+2][j-1].setX(c4);
			    		Model.scene[i+2][j-1].setY(b4);
			    		
			    		int c5 = Model.scene[i+3][j+1].getX();
			    		int b5= Model.scene[i+3][j+1].getY();
			    		Model.scene[i+3][j+1]= new Darkground();
			    		Model.scene[i+3][j+1].setX(c5);
			    		Model.scene[i+3][j+1].setY(b5);
			    		int c6 = Model.scene[i+3][j-1].getX();
			    		int b6= Model.scene[i+3][j-1].getY();
			    		Model.scene[i+3][j-1]= new Darkground();
			    		Model.scene[i+3][j-1].setX(c6);
			    		Model.scene[i+3][j-1].setY(b6);
			    		
			    		int a = Model.scene[(i+3)][j].getX();
				    	int d= Model.scene[(i+3)][j].getY();
				    	Model.scene[(i+3)][j]=new Diamond();
				    	Model.scene[(i+3)][j].setX(a);
				    	Model.scene[(i+3)][j].setY(d);
				    	Model.scene[(i+3)][j]=new Darkground();
				    	Model.scene[(i+3)][j].setX(a);
				    	Model.scene[(i+3)][j].setY(d);
				    	int r= Model.scene[i][j].getY();
			    		int g = Model.scene[i][j].getX();
			    		Model.scene[i][j]= new Darkground();
			    		Model.scene[i][j].setX(g);
			    		Model.scene[i][j].setY(r);
				    	Hero.setX(g);
				    	Hero.setY(r);
				    	Stars.setY( Model.scene[i][j-1].getY(), 0);
				    	Stars.setY( Model.scene[i][j].getY(), 1);
				    	Stars.setY( Model.scene[i][j+1].getY(), 2);
				    	Stars.setY( Model.scene[i+1][j-1].getY(), 3);
				    	Stars.setY( Model.scene[i+1][j].getY(), 4);
				    	Stars.setY( Model.scene[i+1][j+1].getY(), 5);
				    	Stars.setY( Model.scene[i+2][j-1].getY(), 6);
				    	Stars.setY( Model.scene[i+2][j].getY(), 7);
				    	Stars.setY( Model.scene[i+2][j+1].getY(), 8);
				    	
				    	Stars.setX( Model.scene[i][j-1].getX(), 0);
				    	Stars.setX( Model.scene[i][j].getX(), 1);
				    	Stars.setX( Model.scene[i][j+1].getX(), 2);
				    	Stars.setX( Model.scene[i+1][j-1].getX(), 3);
				    	Stars.setX( Model.scene[i+1][j].getX(), 4);
				    	Stars.setX( Model.scene[i+1][j+1].getX(), 5);
				    	Stars.setX( Model.scene[i+2][j-1].getX(), 6);
				    	Stars.setX( Model.scene[i+2][j].getX(), 7);
				    	Stars.setX( Model.scene[i+2][j+1].getX(), 8);
				    	Model.setA1(false);
				    	Model.setB1(false);
				    	Model.setC1(false);
				    	Model.setD1(false);
				    }
				    	
				    	else {
				    	int c = Model.scene[i][j].getX();
			    		int b= Model.scene[i][j].getY();
			    		Model.scene[i][j]= new Darkground();
			    		Model.scene[i][j].setX(c);
			    		Model.scene[i][j].setY(b);
			    		int a = Model.scene[(i+1)][j].getX();
				    	int d= Model.scene[(i+1)][j].getY();
				    	Model.scene[(i+1)][j]=new Diamond();
				    	Model.allDiamonds.add((Diamond) Model.scene[(i+1)][j]);
				    	Model.scene[(i+1)][j].setX(a);
				    	Model.scene[(i+1)][j].setY(d);
				  //  	System.out.println("Je suis exécuté");
				    	}
				    	
				    	break;
			      }
				    
	/**
	 * Rock on something different from the Darkground and the Ground
	 */
				    
				    if(Model.scene[i][j].getClass().toString().equals(new Rock().getClass().toString()) && 
				    Model.scene[(i+1)][j].getClass().toString().equals(new Rock().getClass().toString()) &&
				    Model.scene[i][(j-1)].getClass().toString().equals(new Darkground().getClass().toString()) &&
				    Model.scene[(i+1)][(j-1)].getClass().toString().equals(new Darkground().getClass().toString()) &&
				   (Hero.getX()!=  Model.scene[i+1][(j-1)].getX() || Hero.getY()!=  Model.scene[i+1][(j-1)].getY())) {
			    		int c = Model.scene[i][j].getX();
			    		int b= Model.scene[i][j].getY();
			    		Model.scene[i][j]= new Darkground();
			    		Model.scene[i][j].setX(c);
			    		Model.scene[i][j].setY(b);
			    		int a = Model.scene[(i+1)][j-1].getX();
				    	int d= Model.scene[(i+1)][j-1].getY();
				    	Model.scene[(i+1)][j-1]=new Rock();
				    	Model.scene[(i+1)][j-1].setX(a);
				    	Model.scene[(i+1)][j-1].setY(d);
				    	//System.out.println("Je suis exécuté");
				      break;
			      }
				    
				    
				    if(Model.scene[i][j].getClass().toString().equals(new Rock().getClass().toString()) && 
						    Model.scene[(i+1)][j].getClass().toString().equals(new Rock().getClass().toString()) &&
						    Model.scene[i][(j+1)].getClass().toString().equals(new Darkground().getClass().toString()) &&
						    Model.scene[(i+1)][(j+1)].getClass().toString().equals(new Darkground().getClass().toString()) &&
						    (Hero.getX()!=  Model.scene[i+1][(j+1)].getX() || Hero.getY()!=  Model.scene[i+1][(j+1)].getY())) {
					    		int c = Model.scene[i][j].getX();
					    		int b= Model.scene[i][j].getY();
					    		Model.scene[i][j]= new Darkground();
					    		Model.scene[i][j].setX(c);
					    		Model.scene[i][j].setY(b);
					    		int a = Model.scene[(i+1)][j+1].getX();
						    	int d= Model.scene[(i+1)][j+1].getY();
						    	Model.scene[(i+1)][j+1]=new Rock();
						    	Model.scene[(i+1)][j+1].setX(a);
						    	Model.scene[(i+1)][j+1].setY(d);
						    //	System.out.println("Je suis exécuté");
						      break;
					      }
					    
				    	if(Model.scene[i][j].getClass().toString().equals(new Rock().getClass().toString()) && 
						    Model.scene[(i+1)][j].getClass().toString().equals(new Diamond().getClass().toString()) &&
						    Model.scene[i][(j-1)].getClass().toString().equals(new Darkground().getClass().toString()) &&
						    Model.scene[(i+1)][(j-1)].getClass().toString().equals(new Darkground().getClass().toString())) {
					    		int c = Model.scene[i][j].getX();
					    		int b= Model.scene[i][j].getY();
					    		Model.scene[i][j]= new Darkground();
					    		Model.scene[i][j].setX(c);
					    		Model.scene[i][j].setY(b);
					    		int a = Model.scene[(i+1)][j-1].getX();
						    	int d= Model.scene[(i+1)][j-1].getY();
						    	Model.scene[(i+1)][j-1]=new Rock();
						    	Model.scene[(i+1)][j-1].setX(a);
						    	Model.scene[(i+1)][j-1].setY(d);
						    	//System.out.println("Je suis exécuté");
						      break;
					      }
						    
						    
						    if(Model.scene[i][j].getClass().toString().equals(new Rock().getClass().toString()) && 
								    Model.scene[(i+1)][j].getClass().toString().equals(new Diamond().getClass().toString()) &&
								    Model.scene[i][(j+1)].getClass().toString().equals(new Darkground().getClass().toString()) &&
								    Model.scene[(i+1)][(j+1)].getClass().toString().equals(new Darkground().getClass().toString())) {
							    		int c = Model.scene[i][j].getX();
							    		int b= Model.scene[i][j].getY();
							    		Model.scene[i][j]= new Darkground();
							    		Model.scene[i][j].setX(c);
							    		Model.scene[i][j].setY(b);
							    		int a = Model.scene[(i+1)][j+1].getX();
								    	int d= Model.scene[(i+1)][j+1].getY();
								    	Model.scene[(i+1)][j+1]=new Rock();
								    	Model.scene[(i+1)][j+1].setX(a);
								    	Model.scene[(i+1)][j+1].setY(d);
								    //	System.out.println("Je suis exécuté");
								      break;
							      }
						    
/**
* Diamond on something different from the Darkground and the Ground
*/
						    
						    if(Model.scene[i][j].getClass().toString().equals(new Diamond().getClass().toString()) && 
								    Model.scene[(i+1)][j].getClass().toString().equals(new Diamond().getClass().toString()) &&
								    Model.scene[i][(j-1)].getClass().toString().equals(new Darkground().getClass().toString()) &&
								    Model.scene[(i+1)][(j-1)].getClass().toString().equals(new Darkground().getClass().toString())) {
							    		int c = Model.scene[i][j].getX();
							    		int b= Model.scene[i][j].getY();
							    		Model.scene[i][j]= new Darkground();
							    		Model.scene[i][j].setX(c);
							    		Model.scene[i][j].setY(b);
							    		int a = Model.scene[(i+1)][j-1].getX();
								    	int d= Model.scene[(i+1)][j-1].getY();
								    	Model.scene[(i+1)][j-1]=new Diamond();
								    	Model.allDiamonds.add((Diamond) Model.scene[(i+1)][j-1]);
								    	Model.scene[(i+1)][j-1].setX(a);
								    	Model.scene[(i+1)][j-1].setY(d);
								    //	System.out.println("Je suis exécuté");
								      break;
							      }
								    
								    
								    if(Model.scene[i][j].getClass().toString().equals(new Diamond().getClass().toString()) && 
										    Model.scene[(i+1)][j].getClass().toString().equals(new Diamond().getClass().toString()) &&
										    Model.scene[i][(j+1)].getClass().toString().equals(new Darkground().getClass().toString()) &&
										    Model.scene[(i+1)][(j+1)].getClass().toString().equals(new Darkground().getClass().toString())) {
									    		int c = Model.scene[i][j].getX();
									    		int b= Model.scene[i][j].getY();
									    		Model.scene[i][j]= new Darkground();
									    		Model.scene[i][j].setX(c);
									    		Model.scene[i][j].setY(b);
									    		int a = Model.scene[(i+1)][j+1].getX();
										    	int d= Model.scene[(i+1)][j+1].getY();
										    	Model.scene[(i+1)][j+1]=new Diamond();
										    	Model.allDiamonds.add((Diamond) Model.scene[i+1][j+1]);
										    	Model.scene[(i+1)][j+1].setX(a);
										    	Model.scene[(i+1)][j+1].setY(d);
										    //	System.out.println("Je suis exécuté");
										      break;
									      }
									    
								    if(Model.scene[i][j].getClass().toString().equals(new Diamond().getClass().toString()) && 
										    Model.scene[(i+1)][j].getClass().toString().equals(new Rock().getClass().toString()) &&
										    Model.scene[i][(j-1)].getClass().toString().equals(new Darkground().getClass().toString()) &&
										    Model.scene[(i+1)][(j-1)].getClass().toString().equals(new Darkground().getClass().toString())) {
									    		int c = Model.scene[i][j].getX();
									    		int b= Model.scene[i][j].getY();
									    		Model.scene[i][j]= new Darkground();
									    		Model.scene[i][j].setX(c);
									    		Model.scene[i][j].setY(b);
									    		int a = Model.scene[(i+1)][j-1].getX();
										    	int d= Model.scene[(i+1)][j-1].getY();
										    	Model.scene[(i+1)][j-1]=new Diamond();
										    	Model.allDiamonds.add((Diamond) Model.scene[i+1][j-1]);
										    	Model.scene[(i+1)][j-1].setX(a);
										    	Model.scene[(i+1)][j-1].setY(d);
										    	//System.out.println("Je suis exécuté");
										      break;
									      }
										    
										    
										    if(Model.scene[i][j].getClass().toString().equals(new Diamond().getClass().toString()) && 
												    Model.scene[(i+1)][j].getClass().toString().equals(new Rock().getClass().toString()) &&
												    Model.scene[i][(j+1)].getClass().toString().equals(new Darkground().getClass().toString()) &&
												    Model.scene[(i+1)][(j+1)].getClass().toString().equals(new Darkground().getClass().toString())) {
											    		int c = Model.scene[i][j].getX();
											    		int b= Model.scene[i][j].getY();
											    		Model.scene[i][j]= new Darkground();
											    		Model.scene[i][j].setX(c);
											    		Model.scene[i][j].setY(b);
											    		int a = Model.scene[(i+1)][j+1].getX();
												    	int d= Model.scene[(i+1)][j+1].getY();
												    	Model.scene[(i+1)][j+1]=new Diamond();
												    	Model.allDiamonds.add((Diamond) Model.scene[i+1][j+1]);
												    	Model.scene[(i+1)][j+1].setX(a);
												    	Model.scene[(i+1)][j+1].setY(d);
												    	//System.out.println("Je suis exécuté");
												      break;
											      }
					
   /**
    * The Hero picks up the Diamond 
    */
										    if(Hero.getX() == (Model.scene[i][j].getX()) && Hero.getY()==Model.scene[i][j].getY()  && Model.scene[i][j].getClass().toString().equals(new Diamond().getClass().toString())) {
										    	int c = Model.scene[i][j].getX();
									    		int b= Model.scene[i][j].getY();
									    		Model.scene[i][j]= new Darkground();
									    		Model.scene[i][j].setX(c);
									    		Model.scene[i][j].setY(b);
									    		int a = Model.getSc();
									    		a+=10;
									    		Model.setSc(a);
										    }
			}
		}
	}
	
	
	/**
	 * The hero can't pass through the walls and rock 
	 * Methods which enable Hero moves the Rock
	 */

		
		
		
		
	
	public static void boardg() {
	
		for(int i=0;i<24;i++) {
			for(int j=1; j<35; j++) {
				    if(Hero.getX() == (Model.scene[i][j].getX()+31) && Hero.getY()==Model.scene[i][j].getY()  && ( Model.scene[i][j].getClass().toString().equals(new Wall().getClass().toString()))) {		
				    		Model.setA(false);
					      break;
				    }
				    else if (Hero.getX() == (Model.scene[i][j].getX()+31) && Hero.getY()==Model.scene[i][j].getY()  && !( Model.scene[i][j].getClass().toString().equals(new Wall().getClass().toString()))) {
				    	Model.setA(true);
				    }	   
			}
		}
	}
	
	public static void boardgr() {
		
		for(int i=0;i<24;i++) {
			for(int j=1; j<35; j++) {
	 if(Hero.getX() == (Model.scene[i][j].getX()+31) && Hero.getY()==Model.scene[i][j].getY()  && (Model.scene[i][j].getClass().toString().equals(new Rock().getClass().toString()))) {
	      if(Hero.getX() == (Model.scene[i][j].getX()+31) && Hero.getY()==Model.scene[i][j].getY()  && Model.scene[i][j].getClass().toString().equals(new Rock().getClass().toString()) && Model.scene[i][j-1].getClass().toString().equals(new Darkground().getClass().toString())) {
	    	  	Model.setA(false);
	    	  	int c = Model.scene[i][j-1].getX();
	    		int b= Model.scene[i][j-1].getY();
	    		Model.scene[i][j-1]= new Rock();
	    		Model.scene[i][j-1].setX(c);
	    		Model.scene[i][j-1].setY(b);
	    		int a = Model.scene[i][j].getX();
	    		int d= Model.scene[i][j].getY();
	    		Model.scene[i][j]= new Darkground();
	    		Model.scene[i][j].setX(a);
	    		Model.scene[i][j].setY(d);
	    		int r= Hero.getX();
	    		r-=31;
	    		Hero.setX(a);
	    		
		}
	      else
	      {				
   		Model.setA(false);
	      }
     }
   
   else if (Hero.getX() == (Model.scene[i][j].getX()+31) && Hero.getY()==Model.scene[i][j].getY()  && !(Model.scene[i][j].getClass().toString().equals(new Rock().getClass().toString()) || Model.scene[i][j].getClass().toString().equals(new Wall().getClass().toString()))) {
   	
   	Model.setA(true);
   }
			}
		}
	}
	
public static void boarddr() {
		
		for(int i=0;i<24;i++) {
			for(int j=1; j<35; j++) {
				 if(Hero.getX() == (Model.scene[i][j].getX()-31) && Hero.getY()==Model.scene[i][j].getY()  && (Model.scene[i][j].getClass().toString().equals(new Rock().getClass().toString()) || Model.scene[i][j].getClass().toString().equals(new Wall().getClass().toString()))) {
				    	
				      if(Hero.getX() == (Model.scene[i][j].getX()-31) && Hero.getY()==Model.scene[i][j].getY()  && Model.scene[i][j].getClass().toString().equals(new Rock().getClass().toString()) && Model.scene[i][j+1].getClass().toString().equals(new Darkground().getClass().toString())) {
				    	   Model.setB(false); 
				    	  	int c = Model.scene[i][j+1].getX();
				    		int b= Model.scene[i][j+1].getY();
				    		Model.scene[i][j+1]= new Rock();
				    		Model.scene[i][j+1].setX(c);
				    		Model.scene[i][j+1].setY(b);
				    		int a = Model.scene[i][j].getX();
				    		int d= Model.scene[i][j].getY();
				    		Model.scene[i][j]= new Darkground();
				    		Model.scene[i][j].setX(a);
				    		Model.scene[i][j].setY(d);
				    		int r = Hero.getX();
				    		r+=31;
				    		Hero.setX(r);
				      }
				      else
				      {
				    		Model.setB(false); 
				     }
			    }
				 
			    else if (Hero.getX() == (Model.scene[i][j].getX()-31) && Hero.getY()==Model.scene[i][j].getY()  && !(Model.scene[i][j].getClass().toString().equals(new Rock().getClass().toString()))) {
		    	
			    	Model.setB(true);
			    }
			}
		}
	}
				    
	
	 public static void boardd() {
		 for(int i=0;i<24;i++) {
				for(int j=0; j<34; j++) {
				    if(Hero.getX() == (Model.scene[i][j].getX()-31) && Hero.getY()==Model.scene[i][j].getY()  && ( Model.scene[i][j].getClass().toString().equals(new Wall().getClass().toString()))) {
					    		Model.setB(false);
				    }
				    
				    else if (Hero.getX() == (Model.scene[i][j].getX()-31) && Hero.getY()==Model.scene[i][j].getY()  && !( Model.scene[i][j].getClass().toString().equals(new Wall().getClass().toString()))) {
			    	
				    	Model.setB(true);
				    }
				}
		 }
	 }
				    
	  public static void boardh() {
		 for(int i=0;i<23;i++) {
				for(int j=0; j<35; j++) {
				    if(Hero.getY() == (Model.scene[i][j].getY()+31) && Hero.getX()==Model.scene[i][j].getX()  && (Model.scene[i][j].getClass().toString().equals(new Rock().getClass().toString()) || Model.scene[i][j].getClass().toString().equals(new Wall().getClass().toString()))) {
			    		Model.setC(false);
			      }
			    else if (Hero.getY() == (Model.scene[i][j].getY()+31) && Hero.getX()==Model.scene[i][j].getX()  && !(Model.scene[i][j].getClass().toString().equals(new Rock().getClass().toString()) || Model.scene[i][j].getClass().toString().equals(new Wall().getClass().toString()))) {
			    	
			    	Model.setC(true);
			    }
				}
		 }
	  }
				    
	  public static void boardb() {
		 for(int i=1;i<24;i++) {
			for(int j=1; j<35; j++) {
			    
 if(Hero.getY() == (Model.scene[i][j].getY()-31) && Hero.getX()==Model.scene[i][j].getX()  && (Model.scene[i][j].getClass().toString().equals(new Rock().getClass().toString()) || Model.scene[i][j].getClass().toString().equals(new Wall().getClass().toString()))) {
			    		Model.setD(false);
			      }
			    else if (Hero.getY() == (Model.scene[i][j].getY()-31) && Hero.getX()==Model.scene[i][j].getX()  && !(Model.scene[i][j].getClass().toString().equals(new Rock().getClass().toString()) || Model.scene[i][j].getClass().toString().equals(new Wall().getClass().toString()))) {
			    	
			    	Model.setD(true);
			    }
			}
		}
		
	}
}
