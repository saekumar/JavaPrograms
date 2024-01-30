package squareroot;
import java.util.Scanner;


public class Squqreroot {

	public static void main(String[] args) {
		
		Scanner v=new Scanner(System.in);
		int a,b,c,s;
		double area;
		a=v.nextInt();
		b=v.nextInt();
		c=v.nextInt();
		s=(a+b+c)/2;
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("area is "+area);
		v.close();
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
