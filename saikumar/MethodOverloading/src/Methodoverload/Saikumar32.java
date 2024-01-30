package Methodoverload;
import java.util.Scanner;
class Area_calc
{
	public void area(double a)
	{
		double x;
		x=Math.PI*a*a;
		System.out.println("area of circle is "+x);
	}
	public void area(double b,double c)
	{
		double y=b*c;
		System.out.println("area of reactangle is "+y);
	}
	public void area(double d,double e,double f)
	{
		double v=2*((d*e)+(e*f)+(f*d));
		System.out.println("area of cublid is "+v);
	}
}

public class Saikumar32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		boolean repeat=true;
		Area_calc ac=new Area_calc();
		while(repeat)
		{
			System.out.println("1.circle\n2.rectangle\n3.cuboid\n");
			System.out.println("enter ur choice \n");
			int ch=s.nextInt();
			if(ch==1)
			{
				double a=s.nextDouble();
				ac.area(a);
			}
			else if(ch==2)
			{
				double b,c;
				b=s.nextDouble();
				c=s.nextDouble();
				ac.area(b,c);
			}
			else if(ch==3)
			{
				double d,e,f;
				d=s.nextDouble();
				e=s.nextDouble();
				f=s.nextDouble();
				ac.area(d,e,f);
				
			}
			else
			{
				
				repeat=false;
			}
		}
		s.close();

	}

}
