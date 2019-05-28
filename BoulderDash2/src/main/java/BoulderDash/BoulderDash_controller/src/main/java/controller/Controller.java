package controller;

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
