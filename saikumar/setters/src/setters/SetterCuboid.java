package setters;
import java.util.Scanner;
 class Cube 
{
	 private double len,bre,hei;
	 public boolean setlen(double l)
	 {
		 if(l>=0 && l<=100)
		 {
			 return true;
		 }
		 return false;
		 
	 }
	 
	 public boolean setbre(double b)
	 {
		 if(b>=0 && b<=100)
		 {
			 return true;
		 }
		 return false;
		 
	 }
	
	 public boolean sethei(double h)
	 {
		 if(h>=0 && h<=100)
		 {
			 return true;
		 }
		 return false;
		 
	 }
	 public double getlen()
	 {
		 return len;
	 }
	 public double getbre()
	 {
		 return bre;
	 }
	 public double gethei()
	 {
		 return hei;
	 }
	 public double cal_vol()
	 {
		double vol;
		vol=len*bre*hei;
		return vol;
	 }
	 public String dis()
	 {
		 String op;
		 op=String.format("volume is "+cal_vol());
		 return op;
	 }
	
}

public class SetterCuboid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Cube c[]=new Cube[n];
		for(int i=0;i<n;i++)
		{
			double l=s.nextDouble();
			double b=s.nextDouble();
			double h=s.nextDouble();
			c[i]=new Cube();
			if(c[i].setlen(l) && c[i].setbre(b) && c[i].sethei(h))
			{
				System.out.println(c[i].dis());
			}
			else 
			{
			System.out.println("enter correct nmbrs ");
			}
		}

	}

}
