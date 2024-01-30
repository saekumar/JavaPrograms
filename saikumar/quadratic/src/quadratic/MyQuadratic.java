package quadratic;
import java.util.Scanner;
class Quadratic
{
	private int aa,bb,cc;
	public boolean setData(int a,int b,int c)
	{
		if((a>=0&&a<=10)&&(b>=0&&b<=10)&&(c>=0&&c<=10))
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
	public void discrim()
	{`0
		double d;
		double r1,r2;
		d=Math.sqrt((bb*bb)-(4*aa*cc));
		
		
		r1=(-bb+d)/2*aa;
		r2=(-bb-d)/2*aa;
		System.out.println((String.format("roots are %f and %f ",r1,r2)));
		
	}
	
}

public class MyQuadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Quadratic q[]=new Quadratic[n];
		for(int i=0;i<n;i++)
		{
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
        q[i]=new Quadratic();
        if(q[i].setData(a,b,c))
        {
        	q[i].discrim();
        }
        else 
        {
        	System.out.println("incorect ");
        }
        	
        }
	
	}

}
