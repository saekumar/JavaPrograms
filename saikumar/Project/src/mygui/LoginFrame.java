package mygui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;  

 class Loginframe extends JFrame implements ActionListener {

    Container container=getContentPane();
    JLabel userLabel=new JLabel("USERNAME");
    JLabel passwordLabel=new JLabel("PASSWORD");
    JTextField userTextField=new JTextField();
    JPasswordField passwordField=new JPasswordField();
    JButton loginButton=new JButton("LOGIN");
    JButton resetButton=new JButton("RESET");
    JCheckBox showPassword=new JCheckBox("Show Password");


    Loginframe()
    {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();

    }
   public void setLayoutManager()
   {
       container.setLayout(null);
   }
   public void setLocationAndSize()
   {
       userLabel.setBounds(50,150,100,30);
       passwordLabel.setBounds(50,220,100,30);
       userTextField.setBounds(150,150,150,30);
       passwordField.setBounds(150,220,150,30);
       showPassword.setBounds(150,250,150,30);
       loginButton.setBounds(50,300,100,30);
       resetButton.setBounds(200,300,100,30);


   }
   public void addComponentsToContainer()
   {
       container.add(userLabel);
       container.add(passwordLabel);
       container.add(userTextField);
       container.add(passwordField);
       container.add(showPassword);
       container.add(loginButton);
       container.add(resetButton);
   }
   public void addActionEvent()
   {
      //adding Action listener to components
       loginButton.addActionListener(this);
       resetButton.addActionListener(this);
       showPassword.addActionListener(this);
   }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
 class NotValid
 {
	 if(e.getSorce()==b)
	 {
		 String u=t1.getText();
		 String p=t2.getText();
		 if()
	 }
		 
 }
public class LoginFrame{
    public static void main(String[] a){
        Loginframe frame=new Loginframe();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(10,10,370,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

    }

}
