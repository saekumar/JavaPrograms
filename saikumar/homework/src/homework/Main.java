package homework;

class Rectangle
{
	public void show()

	{
		System.out.println("superclass");
	}
}
class Saiku extends Rectangle
{
	public void show()
	{
		System.out.println("subclass");
	}
}
public class Main 
{
	public static void main(String[] args) 
	{
		Rectangle a1=new Rectangle();
		a1.show();
		Saiku a2=new Saiku();
		a2.show();
		Rectangle a3=new Saiku();
		a3.show();
	 
		
	}
}