package anotherStdDetils;
import java.util.Scanner;
class hemanth
{
	int regdno;
	String name;
	String branch;
	String clg;
	
	public String toString( )
	{
		return ("id is"+regdno+"name is"+name+"branch is"+branch+"clg is "+clg);
	}
}

public class scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hemanth h=new hemanth();
		Scanner s=new Scanner(System.in);
		int regdno;
		String name,branch,clg;
		regdno=s.nextInt();
		name=s.nextLine();
		branch=s.nextLine();
		clg=s.nextLine();
		System.out.println(h);
		
		

	}

}
