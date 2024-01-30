package Triangle;
import java.util.Scanner;
class Triangle
{
	int aa,bb,cc;
	public boolean setData(int a,int b,int c)
	{
		if((a+b)>c && (b+c)>a && (a+c)>b )
		{
			aa=a;
			bb=b;
			cc=c;
			return true;
		}
		else 
			return false;
		
	}
	
	public int getaa()
	{
		return aa;
	}
	public int getbb()
	{
		return bb;
	}
	public int getcc()
	{
		return cc;
	}
	void cal_area()
	{
		double s1=(aa+bb+cc)/2;
		double m;
		m=Math.sqrt((s1*(s1-aa)*(s1-bb)*(s1-cc)));
		System.out.println("area is "+m);
	}
}

public class Mytriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		Triangle t=new Triangle();
		if(t.setData(a, b, c))
		{
			t.cal_area();
		}
		else 
		{
			System.out.println("enter correct nmbrs ");
		}
		}
		s.close();
	}

}
