package arrayAvg;

import java.util.Scanner;

public class Arrayavg {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		int su=0;
		double avg=0;
		
		
		int a[]=new int[n];
		
		 int smallest = a[0];
		 int largest = a[0];
		 
		 for(int i=0; i< a.length; i++)
		 {
			 a[i]=s.nextInt();
		 if(a[i] > largest)
		 largest = a[i];
		 else if (a[i] < smallest)
		 smallest = a[i];
		 
		 }
		 System.out.println("Smallest Number is : " + smallest);
		 System.out.println("Largest Number is : " + largest); 
		for(int i=0;i<n;i++)
		{
		
			su+=a[i];
		}
	
		
		System.out.println("sum is "+su);
		avg+=su/n;
		System.out.println("avg is "+avg);
		s.close();
	}
}
