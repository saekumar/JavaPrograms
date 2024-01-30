package perfectnmbr;
import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	
		int n=s.nextInt();
		
		int a=0;
		
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				a+=i;
				
			}
		}
		if(a==2*n)
		{
			System.out.println("your nmbr is perfect nmbr ");
		}
		else {
		System.out.println("your nmbr is not perfect nmbr ");
		}
		

	}

}
