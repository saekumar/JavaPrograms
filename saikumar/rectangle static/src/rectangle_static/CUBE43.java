package rectangle_static;
import java.util.Scanner;

public class CUBE43 {
	static double len,bre,hei,v;
	public static double volume(double l,double b,double h)
	{
		len=l;
		bre=b;
		hei=h;
		v=len*bre*hei;
		return v;
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double l,b,h,v;
		l=s.nextDouble();
		b=s.nextDouble();
		h=s.nextDouble();
		v=CUBE43.volume(l,b,h);
		System.out.println("ans is "+v);
		// TODO Auto-generated method stub
		s.close();
		

	}

}
