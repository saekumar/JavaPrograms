package student;

public class Except {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("hi ....!");
		try
		{
		a=10/0;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("value of a is ");
		
		System.out.println("tell me the answer ");

	}

}
