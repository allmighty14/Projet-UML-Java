/**
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
package com.ucac_icam.BoulderDash;

import controller.Controller;
import view.View;
import model.Model;

/**
 * The Class Main.
 *
 * @author Jean-Aymeric Diet
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
		System.out.println("all");
    }
}
