package Frame;
import java.awt.*;

import javax.swing.*;




public class FrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame t=new JFrame("text field example");
		JTextField t1=new JTextField("im");
		t1.setBounds(150,100,100,30);
		JTextField t2=new JTextField("sai");
		t2.setBounds(150,200,100,30);
		t.add(t1);
		t.add(t2);
		t.setSize(400,400);
		 	
		t.setLayout(null);
		

	}

}
