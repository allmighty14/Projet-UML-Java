/**
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
package com.Ucac_Icam.BoulderDash1;

import controller.Controller;
import model.Model;
import view.View;


/*import contract.ControllerOrder;
import controller.Controller;
import model.Model;
import view.View;
*/
/**
 * The Class Main.
 *
 * @author Group 7
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
    	 final Controller controller = new Controller (new View(), new Model());
    	
    	 controller.start();
    	/*  final Model model = new Model();
        final View view = new View(model);
        final Controller controller = new Controller(view, model);
        view.setController(controller);

        controller.control();
        controller.orderPerform(ControllerOrder.English);*/
    }
}
