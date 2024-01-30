package student;
abstract class Cooking
{
	public void CookingProced()
	
	{
		turnOnStove();
		boilrice();
		cutVeg();
		cookRice();
		turnoffStove();
		
	}
	public void turnOnStove()
	{
		System.out.println("Turn on Stove\n");
	}
	public void boilrice()
	{
		System.out.println("Boil rice\n");
	}
	abstract void cutVeg();
	
	public void cookRice()
	{
		System.out.println("Cook the Rice\n");
	}
	public void turnoffStove()
	{
		System.out.println("Turn off Stove\n");
	}
}
class CarrotRice extends Cooking
{
	public void cutVeg()
	{
		System.out.println("cut carrot for cooking\n");
	}
}
class TomatoRice extends Cooking
{
	public void cutVeg()
	{
		System.out.println("cut tomatoes for cooking\n");
	}
}

public class Template {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cooking ob;
		ob=new CarrotRice();
		ob.CookingProced();
		
		ob=new TomatoRice();
		ob.CookingProced();
		
		
			
		
	}

}
