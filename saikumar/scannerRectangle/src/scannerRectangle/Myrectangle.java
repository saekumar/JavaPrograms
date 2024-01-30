package scannerRectangle;
import java.util.Scanner;
class Rectangle
{
	double len,bre,ar;
	public void store(double l,double b)
	{
		len=l;
		bre=b;
		ar=len*bre;
		System.out.println("area is "+ar);
		
	}
}

public class Myrectangle {

	public static void main(String[] args) {
	Rectangle r=new Rectangle();
	Scanner s=new Scanner (System.in);
	double l,b;
	l=s.nextDouble();
	b=s.nextDouble();
	r.store(l, b);
	s.close();
	
		// TODO Auto-generated method stub

	}

}
