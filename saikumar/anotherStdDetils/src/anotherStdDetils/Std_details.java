package anotherStdDetils;
import java.util.Scanner;
class Student
{
	private long num;
	private char gen;
	private String br;
	private String name;
	public boolean setnum(long n )
	{
		if(n/Math.pow(10, 9)>=7)
		{
			num=n;
			return true;
		}
		else
			return false;
		
	}
	public boolean setgen(char g)
	{
		if(g=='M' || g=='F')
		{
			gen=g;
			return true;
			
		}
		else
			return false;
	}
	public boolean setbr(String b)
	{
		if(b=="CSE" || b=="CSIT" || b=="AIDS")
			
		{
			br=b;
			return true;
		}
		else
			return false;
	}
	public boolean setname(String a)
	{
		if(a.length>8 && )
	}
	
}

public class Std_details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
