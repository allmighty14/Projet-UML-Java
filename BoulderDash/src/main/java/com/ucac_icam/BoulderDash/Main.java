/**
 * @author Group7
 * @version 1.0
 */
package com.ucac_icam.BoulderDash;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import controller.Controller;
import model.Model;
import view.View;

/**
 * The Class Main.
 *
 * @author Group7
 */
public abstract class Main {
public static  int a=0;
    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
	 public static void main(final String[] args) {
      
		final Controller controller = new Controller(new View(), new Model());
              
		controller.start();
		 
		/*final Timer t = new Timer();
		t.schedule(new TimerTask() {
			public void run() {
				System.out.println(a);
				a++;
				if(a>=5)
					t.cancel();
				}
		}, 2000,500);*/
    }
}
