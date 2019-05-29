package model;

import java.sql.SQLException;
import java.util.Observable;

import Element.Element;
import contract.IModel;


/**
 * The Class Model.
 *
 * @author Roch MBANYA
 */
public final class Model extends Observable implements IModel {

	public static Element [][] scene;
	private static boolean a = true;
	private static boolean b = true;
	private static boolean c = true;
	private static boolean d = true;
	
	public static boolean isB() {
		return b;
	}

	public static void setB(boolean b) {
		Model.b = b;
	}

	public static boolean isC() {
		return c;
	}

	public static void setC(boolean c) {
		Model.c = c;
	}

	public static boolean isD() {
		return d;
	}

	public static void setD(boolean d) {
		Model.d = d;
	}

	public static boolean isA() {
		return a;
	}

	public static void setA(boolean o) {
		a = o;
	}

	public void Model() {
		
		

	}
	
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
