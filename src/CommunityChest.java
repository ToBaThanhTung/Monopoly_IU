import java.util.Random;

import javax.swing.JFrame;

public class CommunityChest extends JFrame{
	ImageCommunityChest imagecommunitychest;
	public CommunityChest() {
		
		repaint();
	}
	public void change(int b) {
		if(b!=0)
		{int a = rand(57,71);
		imagecommunitychest.change(a);}
		else
		{imagecommunitychest.change(33);
		repaint();}
	}
	public static int rand(int min, int max) {
        try {
            Random rn = new Random();
            int range = max - min + 1;
            int randomNum = min + rn.nextInt(range);
            return randomNum;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
	public void Show() throws InterruptedException {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Chỉ đóng frame đó, các frame khác liên quan sẽ không bị đóng.
		setBounds(22, 518, 340, 345);
		setResizable(false);
		setTitle("COMMUNITYCHEST");
		imagecommunitychest = new ImageCommunityChest();
		add(imagecommunitychest);
		setVisible(true);
	}
}