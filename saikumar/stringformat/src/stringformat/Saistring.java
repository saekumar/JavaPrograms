package stringformat;
import java.util.Scanner;
class Rectangle
{
	double len,bre;
	public void store(double l,double b)
	{
		len=l;
		bre=b;
	}
	public void cal_area(double l,double b)
	{
		double ar;
		String op;
		len=l;
		bre=b;
		ar=len*bre;
		
		op=String.format("area is %f",ar);
	
		
	}

}


public class Saistring {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double l,b;
		l=s.nextDouble();
		b=s.nextDouble();
		Rectangle r=new Rectangle();
		r.store(l, b);
		r.cal_area(l,b);
		
		s.close();
		
		
		// TODO Auto-generated method stub

	}

}
