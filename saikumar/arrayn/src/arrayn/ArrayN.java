package arrayn;
import java.util.Scanner;


public class ArrayN {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		int su=0;
		
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			su+=a[i];
		}
		System.out.println("ans is "+su);
		s.close();
		
		
			
	
		
		// TODO Auto-generated method stub

	}

}
