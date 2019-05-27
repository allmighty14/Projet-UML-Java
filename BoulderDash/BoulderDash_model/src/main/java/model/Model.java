package model;

import java.sql.SQLException;
import java.util.Observable;

import Element.Element;
import contract.IModel;


/**
 * The Class Model.
 *
 * @author Group7
 */
public final class Model extends Observable implements IModel {

	/** The scene. */
	public static Element [][] scene;
	
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
}
