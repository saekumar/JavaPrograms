package SumOfElements;

public class Sum {

	public static void main(String[] args) {
		int n=5;
		int a[]= {1,4,6,3,8};
		sum(a,n);
		avg(a,n);
		
		
		// TODO Auto-generated method stub

	}
	public static float sum(int a[],int n)
	{
		int i;
		float s=0;
		
		for(i=0;i<n;i++)
		{
			s+=a[i];
			
		}
		System.out.println("sum is"+s);
		return s;
		
		
		
	}
	public static void avg(int a[],int n)
	{
		float av;
		av=sum(a,n);
		float avge=av/n;
		System.out.println("avg is "+avge);
	}

}
