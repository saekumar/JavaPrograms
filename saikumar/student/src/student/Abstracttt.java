package student;
abstract class xyz
{
	xyz()
	{
	
		
			System.out.println("show method");
		
	}
	
}
class abc extends xyz
{
	public void dis()
	{
		System.out.println("display ");
	}
}

public class Abstracttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc b=new abc();
		b.dis();

	}

}
