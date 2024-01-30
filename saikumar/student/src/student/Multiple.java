package student;

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=10/5;
			System.out.println(a);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("sai can ");
		}

	}

}
