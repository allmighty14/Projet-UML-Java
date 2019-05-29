package Element;


import java.awt.Image;

import javax.swing.ImageIcon;

public enum DiamondState {
	
	diam1 (new ImageIcon("D:\\Prosits\\Prosits\\2nd Semestre\\UE 2.2 Java\\Projet Java 2\\Images\\diam1.png").getImage()),
	diam2 (new ImageIcon("D:\\Prosits\\Prosits\\2nd Semestre\\UE 2.2 Java\\Projet Java 2\\Images\\diam2.png").getImage()),
	diam3 (new ImageIcon("D:\\Prosits\\Prosits\\2nd Semestre\\UE 2.2 Java\\Projet Java 2\\Images\\diam3.png").getImage()),
    diam4 (new ImageIcon("D:\\Prosits\\Prosits\\2nd Semestre\\UE 2.2 Java\\Projet Java 2\\Images\\diam4.png").getImage());
	
	private Image image=null;
	
   DiamondState(Image image){  
		this.image=image; 
		}
	
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}   
	
    


}
