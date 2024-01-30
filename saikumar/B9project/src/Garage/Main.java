package Garage;
import java.awt.event.*;
import java.awt.event.*;

import javax.swing.*;

class Mygarage extends JFrame implements ActionListener
{
	static JButton b;
	static JLabel l;
	
	
	static JTextField tf;
	
	Mygarage()
	{
		l=new JLabel();
		l.setText("choose ur vehicle");
		l.setBounds(150, 250, 150, 150);
	    l.setVisible(true);
		b=new JButton();
		b.setBounds(200, 100, 100, 50);
		b.addActionListener(this);
		b.setText("2 wheeler");
		
	this.setTitle("SaiGarage");
	this.setDefaultCloseOperation(3);
	this.setVisible(true);
	this.setSize(500, 500);
	this.setLayout(null);
	this.add(b);
	this.add(l);
	
	}
	public void actionperformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			System.out.println("sai");
			l.setVisible(true);
		}
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mygarage g=new Mygarage();
		

	}

}
