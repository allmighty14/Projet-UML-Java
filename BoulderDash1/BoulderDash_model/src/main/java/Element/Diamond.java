package Element;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;

public class Diamond extends Element {

	
	/** The states of the diamonds*/
	private DiamondState state;
	
	public Diamond() {
		/*   Timer time=new Timer();

           TimerTask task=new TimerTask() {



                        @Override

                        public void run() {
		*/this.setState(DiamondState.diam1);
	/*	try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}

		Diamond.setState(DiamondState.diam2);

        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}

        Diamond.setState(DiamondState.diam3);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}

        Diamond.setState(DiamondState.diam4);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}
	}

	
           		
						
           };
           time.schedule(task,0,250);
*/
    }

   


	
	public Diamond(int x,int y) {
		this.x=x;
		this.y=y;
		
	}
	
	public DiamondState getState() {
		return state;
	}

	public void setState(DiamondState state) {
		this.state = state;
		this.setImage (state.getImage());
	}


}			