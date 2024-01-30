package Inherutance;
class Superclass
{
	int x,y;
	public void state(int x,int y)
	{
		this.x=x;
		this.y=y;
		
	}
	public void printxy()
	{
		System.out.println("x is "+x+" y is"+y);
		
	}
}
class Subclass extends Superclass
{
	int z;
	public void statez(int z)
	{
		this.z=z;
		
	}
	public void printz()
	{
		System.out.println("z is "+z);
		
	}
	
}

public class Demo56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subclass s=new Subclass();
		s.state(45,32);
		s.statez(65);
		s.printxy();
		s.printz();

	}

}
