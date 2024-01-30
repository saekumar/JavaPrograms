package sai;

public class MyFactorial
{

	public static void main(String[] args)
	{
		
	
		int n;
		n=7;
		factorial(n);
		n=9;
		factorial(n);
		n=4;
		factorial(n);
	}
	

	


	public static void factorial(int n)
	{
		int fact=1,i;
		for(i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.println("factorial of "+n+" is "  +fact);
	}	
}
	
