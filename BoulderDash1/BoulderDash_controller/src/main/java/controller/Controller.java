package controller;

import java.util.Timer;
import java.util.TimerTask;

import model.*;
import Element.*;
import contract.IController;
import contract.IModel;
import contract.IView;
	/**
	 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
	 *
	 * @author Jean-Aymeric DIET jadiet@cesi.fr
	 * @version 1.0
	 */
	
public class Controller implements IController {

		/** The view. */
	    private final IView  view;

	    /** The model. */
	    private final IModel model;
	    
	    private int pos_diamond;

	    
	    /**
	     * Instantiates a new controller facade.
	     *
	     * @param view
	     *            the view
	     * @param model
	     *            the model
	     */
	    
	    public Controller(final IView view, final IModel model) {
	        this.view = view;
	        this.model = model;
	    }

	    /**
	     * Start.
	     *
	     * @throws SQLException
	     *             the SQL exception
	     */
	    public void start() {
	    	 Timer timer = new Timer();
	           
	        	timer.schedule(new TimerTask() {
	     		public void run() {
	     			//System.out.println(Model.allDiamonds.size());
	     			for(int i=0;i<Model.allDiamonds.size();i++) {
	     				if(Model.allDiamonds.get(i) != null) {
	     			setPos_diamond(Model.allDiamonds.get(i).getState().ordinal()+1);
	     		//	System.out.println(pos_lorann);
	     			Model.allDiamonds.get(i).setState(DiamondState.values()[pos_diamond]);
	     				}
	     			}
	     		}
	     		
	     	},0,150 );
	        	 Timer timer2 = new Timer();
		           
		        	timer2.schedule(new TimerTask() {
		     		public void run() {
		     			//System.out.println(Model.allDiamonds.size());
		     			int a= Model.getTi();
		     			a-=1;
		     			Model.setTi(a);
		     		}
		     		
		     	},0,1000);
		        	
		        	
	    }
	    
	    public void setPos_diamond(int pos_diamond) {
	        if(pos_diamond > 3) {
	        	this.pos_diamond=0;
	        }
	        else 
	        	this.pos_diamond=pos_diamond;
	        }
	    

	    /**
	     * Gets the view.
	     *
	     * @return the view
	     */
	    public IView getView() {
	        return this.view;
	    }

	    /**
	     * Gets the model.
	     *
	     * @return the model
	     */
	    public IModel getModel() {
	        return this.model;
	    }



}