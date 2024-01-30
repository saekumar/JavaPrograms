package BankMenu;
import java.util.Scanner;
 class Bank
{
	 private int id;
	 private double bln;
	 private String name;
	 public boolean setid(int i)
	 {
		 if(i>0)
		 {
			 id=i;
			 return true;
		 }
		 else 
			 return false;
		 
		 
	 }
	 public boolean setbln(double b1)
	 {
		 if(b1>0)
		 {
			 bln=b1;
			 return true;
			 
		 }
		 else 
			 return false;
		 
	 }
	 public boolean setname(String n)
	 {
		 if(n.length()>=8)
		 {
			 name=n;
			 return true;
			 
		 }
		 else
			 return false;
		 
	 }
	 public int getid()
	 {
		 return id;
		 
	 }
	 public double getbln()
	 {
		 return bln;
		 
	 }
	 public String getnae()
	 {
		 return name;
		 
	 }
	 public boolean withdraw(double w)
	 {
		 if(w<bln)
		 {
			 bln-=w;
			 return true;
		 }
		 else
			 return false;
		 
	 }
	 public void deposit(double d)
	 {
		 bln+=d;
		 
	 }
	 public String check()
	 {
		 String op;
		 op=String.format("id is %d \nname is  %s\n bln is %f ",getid(),getnae(),getbln());
		 return op;
	 }
}

public class MyBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		boolean repeat=true;
		Bank b=new Bank();
		System.out.println("enter id ,name,bln \n");
		int i=s.nextInt();
		s.nextLine();
		String n=s.nextLine();
		double b1=s.nextDouble();
		
		if(b.setid(i) && b.setbln(b1) && b.setname(n))
		{
			while(repeat)
			{
				System.out.println("1.withdraw\n2.deposit\n3.check\n4.exit");
				System.out.println("entre yr ch ");
				int ch=s.nextInt();
				if(ch==1)
				{
					System.out.println("enter amount \n");
					double w=s.nextDouble();
					if(b.withdraw(w))
					{
						System.out.println("successful\n");
					}
					System.out.println("not successful\n");
				}
				else if(ch==2)
				{
					System.out.println("enter amount ");
					double d=s.nextDouble();
					b.deposit(d);
				}
				else if(ch==3)
				{
					System.out.println(b.check());
				}
				else if(ch==4)
				{
					repeat =false;
				}
			}
			
			
				
			
			
		}
		else
			System.out.println("enter correct ceredentials \n");

	}

}
