package model;

import java.sql.SQLException;
import java.util.Observable;
import contract.IModel;


/**
 * The Class Model.
 *
 * @author Group 7
 */
public final class Model extends Observable implements IModel {

	public char caract[][] = new char[24][34];
	
	/**
     * Gets the observable.
     *
     * @return the observable
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getObservable()
	 */
	public Observable getObservable() {
		return this;
	}
	
	public void scene() {
		
	}
}