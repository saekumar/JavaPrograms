package student;
import java.util.*;

import java.io.*;
 class Writedata
{
	 FileWriter fw;
	 Writedata() throws Exception
	 {
		 fw=new FileWriter("C:\\Users\\ASUS\\OneDrive\\Desktop\\java programmings\\saikumar\\student\\src\\student\\stddetails2",true);
	 }
	 public void storedata(int sno,String sname,int age) throws Exception
	 {
		 fw.write(" "+sno+" "+sname+" "+age);
		 fw.close();
		 
	 }
	 
	
	
}
 class Readdata
 {
	 File f;
	 Scanner s;
	 public Readdata() throws Exception
	 {
		// TODO Auto-generated constructor stub
		 f=new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\java programmings\\saikumar\\student\\src\\student\\stddetails2");
		 s=new Scanner(f);
	}
	 public void print()
	 {
		 int sno,age;
		 String sname;
		 while(s.hasNext())
		 {
			 sno=s.nextInt();
			 sname=s.next();
			 age=s.nextInt();
			 System.out.println("sno "+sno+" sname "+sname+" age "+age);
		 }
	 }
 }

public class Menu {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		{
			Scanner s=new Scanner(System.in);
			boolean repeat=true;
			int sno,age;
			String sname;
			while(repeat) {
				System.out.println("1.write2.read.3.exit\n");
				System.out.println("enter ur choice");
				int ch=s.nextInt();
				if(ch==1)
				{
					Writedata w=new Writedata();
					sno=s.nextInt();
					sname=s.next();
					age=s.nextInt();
					w.storedata(sno, sname, age);
					
				}
				else if(ch==2)
				{
					Readdata r=new Readdata();
					r.print();
				}
				else if(ch==3)
				{
					repeat =false;
				}
			}
		}

	}

}
