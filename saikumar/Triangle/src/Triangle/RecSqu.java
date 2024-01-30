package Triangle;

public class RecSqu {
	public void area(int x)
	{
		int a;
		a=x*x;
	System.out.println("sq is "+a);
	}
	public void area(int x,int y)
	{
		int a;
		a=x*y;
	System.out.println("sq is "+a);
	}
	public void area(double x)
	{
		double a;
		a=3.14*x*x;
	System.out.println("sq is "+a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecSqu b=new RecSqu();
		
		b.area(12);
		b.area(23,15);
		b.area(3.7);

	}

}
