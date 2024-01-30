package student;
interface shape
{
	double calArea();
	double calPeri();
	void setColor(String color); 
}
class Circle implements shape
{
	int r;
	String color;
	Circle(int r,String color)
	{
		this.r=r;
		this.color=color;
	}
	 public double calArea()
	{
		double a;
		a=3.14*r*r;
		return a;
	}
	public double calPeri()
	{
		double p;
		p=3.14*r*2;
		return p;
	}
	
	public String toString()
	{
		return ("\narea is \n"+calArea()+"\n peri is\n "+calPeri()+" \ncolor \n"+color);
		
	}
}

public class Interfacee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle k=new Circle(6,"orange");
		System.out.println(k);
		

	}

}
