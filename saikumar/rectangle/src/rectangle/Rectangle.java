package rectangle;
import java.util.Scanner;
class My
{
	double l,b,a;
	void calarea(double x,double y)
	{
		x=l;
		y=b;
		a=l*b;
		
	}
	void print()
	{
		System.out.println("area is "+a);
		
	}
}

public class Rectangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double x=s.nextDouble();
		double y=s.nextDouble();
		My r1=new My();
		r1.print();
		s.close();
				
		// TODO Auto-generated method stub

	}

}
