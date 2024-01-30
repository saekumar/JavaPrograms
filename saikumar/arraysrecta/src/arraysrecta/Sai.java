package arraysrecta;
import java.util.Scanner;
class Rectangle
{
	double len,bre;
	public void store(double l,double b)
	{
		len=l;
		bre=b;
		
	}
	public double cal_area()
	{
		double ar;
		ar=len*bre;
		return ar;
		
	}
	public String dis()
	{
		String op;
		op=String.format("area is %f", cal_area());
	     return op;
	     
	}
}

public class Sai {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		double l,b;
		System.out.println("enter the no. ");
		n=s.nextInt();
		Rectangle r[]=new Rectangle[n];
		for(int i=0;i<n;i++)
		{
			r[i]=new Rectangle();
			l=s.nextDouble();
			b=s.nextDouble();
			r[i].store(l,b);
			
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(r[i].dis());
			
		}
		s.close();
		
				
			
			
		// TODO Auto-generated method stub

	}

}
