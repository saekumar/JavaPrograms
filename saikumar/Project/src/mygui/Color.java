package mygui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		JFrame f=new JFrame("panelDemo");
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.add(p4);
		p1.setBackground(java.awt.Color.blue);
		p2.setBackground(java.awt.Color.green);
		p3.setBackground(java.awt.Color.red);
		p4.setBackground(java.awt.Color.black);
		f.setVisible(true);
		f.setSize(400,400);
		f.setLayout(new GridLayout(4,2));

	}

}
