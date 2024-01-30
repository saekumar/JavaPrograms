package BlaWhi;
import java.util.Scanner;

class Sai
{
	public static void evod(int n)
	
	{
		if(n%2==0)
		{
			System.out.println("black");
		}
		else
		{
			System.out.println("white");
			
		}
	}
}

public class BlaWhi {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		Sai.evod(n);
		s.close();
		
	    
	   
		// TODO Auto-generated method stub

	}

}
