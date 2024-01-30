package prudhvi;
import java.util.Scanner;


public class Prudhvi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int c=s.nextInt();
		int n1=0,n2=1;
		for(int i=2;i<c;i++)
		{
			n=n1+n2;
			n1=n2;
			n2=n;
			System.out.println("ans is "+n);
		}
		
		
		s.close();

	
	}

}
