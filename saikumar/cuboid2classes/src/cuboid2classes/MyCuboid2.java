package cuboid2classes;
import java.util.Scanner;

public class MyCuboid2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[10];
		int su=0;
		
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
			su+=a[i];
			
		}
		System.out.println("sum is "+su);
		
		
		// TODO Auto-generated method stub

	}

}
