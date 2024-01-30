package distance;
import java.util.Scanner;
class Point
{
	private double  x,y;
	public void setx(double a)
	{
		x=a;
	}
	public void sety(double b)
	{
		y=b;
	}
	public double getx()
	{
		return x;
	}
	public double gety()
	{
		return y;
	}
}

public class SaiDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        Point p1=new Point();
        Point p2=new Point();
        double a,b;
        a=s.nextDouble();
        b=s.nextDouble();
        p1.setx(a);
        p1.sety(b);
        a=s.nextDouble();
        b=s.nextDouble();
        p2.setx(a);
        p2.sety(b);
        double d1;
        d1=Math.sqrt(Math.pow(p2.getx()-p1.getx(),2)+(Math.pow(p2.gety()-p1.gety(), 2)));
        System.out.println("dist is "+d1);
        s.close();
	}

}
