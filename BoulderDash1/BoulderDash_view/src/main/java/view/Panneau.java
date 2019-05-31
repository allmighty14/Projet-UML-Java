package view;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panneau extends JPanel{

	public Panneau() {
		// TODO Auto-generated constructor stub
	}
	
	public void paintComponent (Graphics g) {
	
		try {
			Image img = ImageIO.read(new File("D:\\Prosits\\Prosits\\2nd Semestre\\UE 2.2 Java\\Projet Java 2\\Images\\fond.jpg"));
			g.drawImage(img ,0, 0, this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
