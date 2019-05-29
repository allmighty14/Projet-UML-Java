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
					      break;
				      }
				    
				    
				    if(Model.scene[i][j].getClass().toString().equals(new Diamond().getClass().toString()) && Model.scene[(i+1)][j].getClass().toString().equals(new Darkground().getClass().toString())) {
			    		int c = Model.scene[i][j].getX();
			    		int b= Model.scene[i][j].getY();
			    		Model.scene[i][j]= new Darkground();
			    		Model.scene[i][j].setX(c);
			    		Model.scene[i][j].setY(b);
			    		int a = Model.scene[(i+1)][j].getX();
				    	int d= Model.scene[(i+1)][j].getY();
				    	Model.scene[(i+1)][j]=new Diamond();
				    	Model.scene[(i+1)][j].setX(a);
				    	Model.scene[(i+1)][j].setY(d);
				  //  	System.out.println("Je suis exécuté");
				      break;
			      }
				    
	/**
	 * Rock on something different from the Darkground and the Ground
	 */
				    
				    if(Model.scene[i][j].getClass().toString().equals(new Rock().getClass().toString()) && 
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
				    	Model.scene[(i+1)][j-1]=new Rock();
				    	Model.scene[(i+1)][j-1].setX(a);
				    	Model.scene[(i+1)][j-1].setY(d);
				    	//System.out.println("Je suis exécuté");
				      break;
			      }
				    
				    
				    if(Model.scene[i][j].getClass().toString().equals(new Rock().getClass().toString()) && 
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
										    }
			}
		}
	}
		
		
		
		
		
		
	
	public static void boardg() {
	
		for(int i=0;i<24;i++) {
			for(int j=0; j<35; j++) {
				    if(Hero.getX() == (Model.scene[i][j].getX()+31) && Hero.getY()==Model.scene[i][j].getY()  && (Model.scene[i][j].getClass().toString().equals(new Rock().getClass().toString()) || Model.scene[i][j].getClass().toString().equals(new Wall().getClass().toString()))) {
				    	//    int c = ((Model.scene[i][j+1].getX()));
				    	//	Hero.setX(c);
				    		System.out.print(Hero.getX() +" :: ");
				    		System.out.println((Model.scene[i][j].getX()));
				    		System.out.println("Je suis exécuté à gauche");
				    		Model.setA(false);
					      break;
				      }
				    else if (Hero.getX() == (Model.scene[i][j].getX()+31) && Hero.getY()==Model.scene[i][j].getY()  && !(Model.scene[i][j].getClass().toString().equals(new Rock().getClass().toString()) || Model.scene[i][j].getClass().toString().equals(new Wall().getClass().toString()))) {
				    	
				    	Model.setA(true);
				    }
			}
		}
	}
				    
	
	 public static void boardd() {
		 for(int i=0;i<24;i++) {
				for(int j=1; j<35; j++) {
				    if(Hero.getX() == (Model.scene[i][j].getX()-31) && Hero.getY()==Model.scene[i][j].getY()  && (Model.scene[i][j].getClass().toString().equals(new Rock().getClass().toString()) || Model.scene[i][j].getClass().toString().equals(new Wall().getClass().toString()))) {
			    		int c = ((Model.scene[i][j-1].getX()));
			    		Hero.setX(c);
			    		System.out.print(Hero.getX() +" :: ");
			    		System.out.println((Model.scene[i][j].getX()));
			    		System.out.println("Je suis exécuté à droite");
			    		Hero.setY(Hero.getY()); 
			    		Model.setB(false);
				      break;
			      }
				    
				    else if (Hero.getX() == (Model.scene[i][j].getX()-31) && Hero.getY()==Model.scene[i][j].getY()  && !(Model.scene[i][j].getClass().toString().equals(new Rock().getClass().toString()) || Model.scene[i][j].getClass().toString().equals(new Wall().getClass().toString()))) {
			    	
				    	Model.setB(true);
				    }
				}
		 }
	 }
				    
	  public static void boardh() {
		 for(int i=0;i<23;i++) {
				for(int j=0; j<35; j++) {
				    if(Hero.getY() == (Model.scene[i][j].getY()+31) && Hero.getX()==Model.scene[i][j].getX()  && (Model.scene[i][j].getClass().toString().equals(new Rock().getClass().toString()) || Model.scene[i][j].getClass().toString().equals(new Wall().getClass().toString()))) {
			    		
			    	    int c = ((Model.scene[i+1][j].getY()));
			    		Hero.setY(c);
			    		System.out.print(Hero.getY() +" :: ");
			    		System.out.println((Model.scene[i][j].getY()));
			    		System.out.println("Je suis exécuté en haut");
			    		Model.setC(false);
				      break;
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
			    		
			    	    int c = ((Model.scene[i-1][j].getY()));
			    		Hero.setY(c);
			    		System.out.print(Hero.getY() +" :: ");
			    		System.out.println((Model.scene[i][j].getY()));
			    		System.out.println("Je suis exécuté en bas");
			    		Model.setD(false);
				      break;
			      }
			    else if (Hero.getY() == (Model.scene[i][j].getY()-31) && Hero.getX()==Model.scene[i][j].getX()  && !(Model.scene[i][j].getClass().toString().equals(new Rock().getClass().toString()) || Model.scene[i][j].getClass().toString().equals(new Wall().getClass().toString()))) {
			    	
			    	Model.setD(true);
			    }
			}
		}
		
	}
}
