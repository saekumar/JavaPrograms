package Frame;
import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Sai extends JFrame implements ActionListener
{
	JFrame f;
	JTextField t1;
	JTextField t2;
	JLabel l;
	JButton b;
	public Sai()
	{
		t1=new JTextField(20);
		t2=new JTextField(20);
		l=new JLabel("result");
		 b=new JButton("ok");
		 f.add(t1);
		 
		 f.add(t2);
		 f.add(l);
		 f.add(b);
		   b.addActionListener(this);
		 setLayout(new FlowLayout());
		 setVisible(true);
		 setSize(400,400);
		 setDefaultCloseOperation(3);
		 
	}
	public void actionPerformed(ActionEvent a)
	{
		int num1=Integer.parseInt(t1.getText());
		int num2=Integer.parseInt(t1.getText());
		int val=num1+num2;
		l.setText(val+"");
	}
	
}

public class add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sai s=new Sai();

	}

}
