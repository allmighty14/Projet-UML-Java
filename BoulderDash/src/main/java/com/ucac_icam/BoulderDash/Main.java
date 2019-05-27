/**
 * @author Group7
 * @version 1.0
 */
package com.ucac_icam.BoulderDash;

import controller.Controller;
import model.Model;
import view.View;

/**
 * The Class Main.
 *
 * @author Group7
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
	 public static void main(final String[] args) {
      
		 final Controller controller = new Controller(new View(), new Model());
              
		controller.start();
		//System.out.println("all");
    }
}
