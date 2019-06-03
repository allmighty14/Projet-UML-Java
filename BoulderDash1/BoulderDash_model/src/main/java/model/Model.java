package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Observable;

import Element.*;
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
	private static boolean a1 = true;
	private static boolean b1 = true;
	private static int sc = 0;
	private static int ti = 120;
	private static int dia = 15;
	public static int getSc() {
		return sc;
	}

	public static void setSc(int sc) {
		Model.sc = sc;
	}

	public static boolean isA1() {
		return a1;
	}

	public static void setA1(boolean a1) {
		Model.a1 = a1;
	}

	public static boolean isB1() {
		return b1;
	}

	public static void setB1(boolean b1) {
		Model.b1 = b1;
	}

	public static boolean isC1() {
		return c1;
	}

	public static void setC1(boolean c1) {
		Model.c1 = c1;
	}

	public static boolean isD1() {
		return d1;
	}

	public static void setD1(boolean d1) {
		Model.d1 = d1;
	}

	private static boolean c1 = true;
	private static boolean d1 = true;
	public static ArrayList<Diamond> allDiamonds;
	
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

	public static int getTi() {
		return ti;
	}

	public static void setTi(int ti) {
		Model.ti = ti;
	}

	public static int getDia() {
		return dia;
	}

	public static void setDia(int dia) {
		Model.dia = dia;
	}
}
