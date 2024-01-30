package Garage;

import java.awt.BorderLayout;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;



public class Sai extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     JLabel l2=new JLabel();
		     JLabel l3=new JLabel();
		     JLabel l4=new JLabel();
		     JLabel l5=new JLabel();
		     JLabel l6=new JLabel();
		     JLabel l7=new JLabel();
		     JLabel l8=new JLabel();
		     JLabel l9=new JLabel();
		     JLabel l10=new JLabel();
		     
	        JTextField tf1=new JTextField();
	        tf1.setPreferredSize(new Dimension(250, 40));
	        
	        
	        JTextField tf=new JTextField();
	        tf.setPreferredSize(new Dimension(250,40));
	        
	        
	        JTextField tf2=new JTextField();
	        tf2.setPreferredSize(new Dimension(250,40));
	        
	        
	        JTextField tf3=new JTextField();
	        tf3.setPreferredSize(new Dimension(250,40));
	        
	        
	        JTextField tf4=new JTextField();
	        tf4.setPreferredSize(new Dimension(250,40));
	        
	        JTextField tf5=new JTextField();
	        tf5.setPreferredSize(new Dimension(250,40));
	        
	        JTextField tf6=new JTextField();
	        tf6.setPreferredSize(new Dimension(250,40));
	        
	        JTextField tf7=new JTextField();
	        tf7.setPreferredSize(new Dimension(250,40));
	        
	        JTextField tf8=new JTextField();
	        tf8.setPreferredSize(new Dimension(250,40));
	        
	        JTextField tf9=new JTextField();
	        tf9.setPreferredSize(new Dimension(500,40));
	        
	        
	        JTextField tf10=new JTextField();
	        tf10.setPreferredSize(new Dimension(250,40));
	        
	        
			JFrame f=new JFrame();
			
			JPanel redPanel=new JPanel();
			redPanel.setBackground(Color.white);
			redPanel.setBounds(0,0,1500,250);
			JPanel bluePanel=new JPanel();
			bluePanel.setBackground(Color.white);
			bluePanel.setBounds(0,500,1500,250);
			
			JPanel green=new JPanel();
			green.setBackground(Color.white);
			green.setBounds(0, 250, 1500,250 );
			
			
			f.setTitle("SAIGADIGARAGE");
			f.setDefaultCloseOperation(3);
			f.setVisible(true);
			f.setSize(500, 500);
			f.setLayout(null);
			
			Border b=BorderFactory.createLineBorder(Color.WHITE);
			
	        ImageIcon i=new ImageIcon("/B9project/src/Garage/WIN_20220216_09_21_45_Pro.jpg");
	        f.setIconImage(i.getImage());
	        f.getContentPane().setBackground(Color.WHITE );
	        JLabel l=new JLabel();
	        JLabel l1=new JLabel();
	        
	        l.setText("VEHICLE REGISTER ID");
	        l.setHorizontalTextPosition(JLabel.CENTER);
	        l.setVerticalTextPosition(JLabel.TOP);
	        l.setFont(new Font("MV Boli",Font.PLAIN,20));
	        l.setBackground(Color.BLACK);
	        l.setBorder(b);
	        l.setVerticalAlignment(JLabel.TOP);
	        l.setVerticalAlignment(JLabel.TOP);
	        l.setBounds(0, 0, 250, 40);
	       
	        
	        
	        
	        l1.setText("Service cost ");
	        l1.setHorizontalTextPosition(JLabel.CENTER);
	        l1.setVerticalTextPosition(JLabel.TOP);
	        l1.setFont(new Font("MV Boli",Font.PLAIN,20));
	        l1.setBackground(Color.black);
	        l1.setBorder(b);
	        l1.setVerticalAlignment(JLabel.TOP);
	        l1.setVerticalAlignment(JLabel.TOP);
	        l1.setIcon(i);
	        l1.setBounds(0, 250, 250, 40);
	        
	        
	        l2.setText("ACTUAL SERVICE COST");
	        l2.setHorizontalTextPosition(JLabel.CENTER);
	        l2.setVerticalTextPosition(JLabel.TOP);
	        l2.setFont(new Font("MV Boli",Font.PLAIN,20));
	        l2.setBackground(Color.WHITE);
	        l2.setBorder(b);
	        l2.setVerticalAlignment(JLabel.TOP);
	        l2.setVerticalAlignment(JLabel.TOP);
	        l2.setIcon(i);
	        
	        l3.setText("CUSTOMER NAME");
	        l3.setHorizontalTextPosition(JLabel.CENTER);
	        l3.setVerticalTextPosition(JLabel.TOP);
	        l3.setFont(new Font("MV Boli",Font.PLAIN,20));
	        l3.setBackground(Color.WHITE);
	        l3.setBorder(b);
	        l3.setVerticalAlignment(JLabel.TOP);
	        l3.setVerticalAlignment(JLabel.TOP);
	        l3.setIcon(i);
	        
	        l4.setText("DATE OF SERICE INITIATED");
	        l4.setHorizontalTextPosition(JLabel.CENTER);
	        l4.setVerticalTextPosition(JLabel.TOP);
	        l4.setFont(new Font("MV Boli",Font.PLAIN,20));
	        l4.setBackground(Color.WHITE);
	        l4.setBorder(b);
	        l4.setVerticalAlignment(JLabel.TOP);
	        l4.setVerticalAlignment(JLabel.TOP);
	        l4.setIcon(i);
	        
	        l5.setText("VEHICLE TYPE");
	        l5.setHorizontalTextPosition(JLabel.CENTER);
	        l5.setVerticalTextPosition(JLabel.TOP);
	        l5.setFont(new Font("MV Boli",Font.PLAIN,20));
	        l5.setBackground(Color.WHITE);
	        l5.setBorder(b);
	        l5.setBounds(3,8,10,10);
	        l5.setVerticalAlignment(JLabel.TOP);
	        l5.setVerticalAlignment(JLabel.TOP);
	        l5.setIcon(i);
	        
	        
	        l6.setText("APPLICABLE OFFS");
	        l6.setHorizontalTextPosition(JLabel.CENTER);
	        l6.setVerticalTextPosition(JLabel.TOP);
	        l6.setFont(new Font("MV Boli",Font.PLAIN,20));
	        l6.setBackground(Color.WHITE);
	        l6.setBorder(b);
	        l6.setVerticalAlignment(JLabel.TOP);
	        l6.setVerticalAlignment(JLabel.TOP);
	        l6.setIcon(i);
	        
	        
	        l7.setText("PREMIUM DISCOUNT");
	        l7.setHorizontalTextPosition(JLabel.CENTER);
	        l7.setVerticalTextPosition(JLabel.TOP);
	        l7.setFont(new Font("MV Boli",Font.PLAIN,20));
	        l7.setBackground(Color.WHITE);
	        l7.setBorder(b);
	        l7.setVerticalAlignment(JLabel.TOP);
	        l7.setVerticalAlignment(JLabel.TOP);
	        l7.setIcon(i);
	        
	        
	        l8.setText("REFERRAL COUPONS");
	        l8.setHorizontalTextPosition(JLabel.CENTER);
	        l8.setVerticalTextPosition(JLabel.TOP);
	        l8.setFont(new Font("MV Boli",Font.PLAIN,20));
	        l8.setBackground(Color.WHITE);
	        l8.setBorder(b);
	        l8.setVerticalAlignment(JLabel.TOP);
	        l8.setVerticalAlignment(JLabel.TOP);
	        l8.setIcon(i);
	        
	        l9.setText("FEEDBACK");
	        l9.setHorizontalTextPosition(JLabel.CENTER);
	        l9.setVerticalTextPosition(JLabel.TOP);
	        l9.setFont(new Font("MV Boli",Font.PLAIN,20));
	        l9.setBackground(Color.WHITE);
	        l9.setBorder(b);
	        l9.setVerticalAlignment(JLabel.TOP);
	        l9.setVerticalAlignment(JLabel.TOP);
	        l9.setIcon(i);
	        
	        l10.setText("RATING");
	        l10.setHorizontalTextPosition(JLabel.CENTER);
	        l10.setVerticalTextPosition(JLabel.TOP);
	        l10.setFont(new Font("MV Boli",Font.PLAIN,20));
	        l10.setBackground(Color.WHITE);
	        l10.setBorder(b);
	        l10.setVerticalAlignment(JLabel.TOP);
	        l10.setVerticalAlignment(JLabel.TOP);
	        l10.setIcon(i);
	        
	        
	        
	        redPanel.add(l);
	        redPanel.add(tf2);
	        redPanel.add(l3);
	        redPanel.add(tf3);
	        redPanel.add(l4);
	        redPanel.add(tf4);
	        redPanel.add(l5);
	        redPanel.add(tf1);
	       
	       
	        
	        
	        
	        
	        
	        
	        green.add(l2);
	        green.add(tf5);
	        green.add(l6);
	        green.add(tf6);
	        green.add(l7);
	        green.add(tf7);
	        green.add(l8);
	        green.add(tf8);
	        
	        bluePanel.add(l9);
	        bluePanel.add(tf9);
	        bluePanel.add(l10);
	        bluePanel.add(tf10);
	        
	        
	        f.add(redPanel);
	        f.add(bluePanel);//
	        f.add(green);
	       
		}

	}


