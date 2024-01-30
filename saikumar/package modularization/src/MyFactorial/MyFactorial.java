package MyFactorial;

public class MyFactorial {
	
	public static void  factorial(int n)
	{
		int fact=1,i;
		for(i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.println(fact);
		
	}
	

}
