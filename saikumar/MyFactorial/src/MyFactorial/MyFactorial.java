package MyFactorial;
class Demo
{
	public static void factorial(int n)
	{
		int fact=1,i;
		for(i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.println(fact);
	}
	
}

public class MyFactorial {

	public static void main(String[] args) {
		int n;
		n=7;
		Demo.factorial(n);
		n=5;
		Demo.factorial(n);
		n=27;
		Demo.factorial(n);
		
		// TODO Auto-generated method stub

	}

}
