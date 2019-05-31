package Element;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Stars {
	/**
	 * Implementation of the different setter and getter corresponding to my hero
	 */
	 private static int[] x= new int[9];
	 private static int[] y= new int[9];

		private  Image img;

		public  Image getImg() {
			return img;
		}

		public void setImg(Image img) {
			this.img = img;
		}


		
		public static  int getY(int i) {
		return y[i];
		}
		
		public static void setY(int a, int i) {
		   y[i] = a;
		}

		public static int getX(int i) {
		return x[i];
		}
		
		public static void setX(int a, int i) {
		x[i] = a;
		}
		
		
	public Stars() {
		// TODO Auto-generated constructor stub
		try {
			this.img =  ImageIO.read(new File("D:\\Prosits\\Prosits\\2nd Semestre\\UE 2.2 Java\\Projet Java 2\\Images\\star.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
