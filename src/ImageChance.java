import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImageChance extends JPanel{
	private static int changeimage;
	public ImageChance() {
		repaint();
	}
	public void change(int changeimage) {	
		this.changeimage=changeimage;
	}
	public void paint(Graphics g)
    {
		g.drawImage(new ImageIcon(changeimage+".jpg").getImage(),0, 0,340,310,null);
    }
}