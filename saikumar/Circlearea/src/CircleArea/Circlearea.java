package CircleArea;
class Circle
{
	double r,a;
	void calarea()
	{
		a=3.14*r*r;
		
	}
	void print()
	{
		System.out.println("area is "+a);
	}
}

public class Circlearea {

	public static void main(String[] args) {
		Circle c1=new Circle();
		c1.r=54;
		c1.calarea();
		c1.print();
		
		// TODO Auto-generated method stub

	}

}
