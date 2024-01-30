package mygui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Image {
	ImageIcon image1;
	JLabel label1;
	Image()
	{
		setLayout(new FlowLayout());
		image1=new ImageIcon(getClass().getResource());
		label1=new JLabel(image1);
		add(label1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Image gui=new Image();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.pack();
		
	
		

	}

}
