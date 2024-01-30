package Frame;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame();
		f.setTitle("SaiGarage");
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
		f.setSize(420, 420);
		
        ImageIcon i=new ImageIcon("code cchef.png");
        f.setIconImage(i.getImage());
	}

}
