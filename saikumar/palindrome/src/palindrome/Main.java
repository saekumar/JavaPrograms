package palindrome;
import java.util.Scanner;


public class Main {
   public static int is_palin(int n)
   {
	   int s=0,k;
	   while(n>0)
	   {
		   k=n%10;
		   s=(s*10)+k;
		   n/=10;
	   }
	   return s;
	   
   }
   public static boolean find_palin(int x,int y)
   {
	   if(x==y)
	   {
		   return true;
		   
	   }
	   else
		   return false;
	   
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int n=s.nextInt();
		
		for(int i=0;i<a;i++)
		{
		int rev=is_palin(n);
		boolean re=find_palin(n,rev);
		if(re==true)
		{
			System.out.println("it is palindrome ");
		}
		else 
			System.out.println("not palindrome ");
		}
		
		
      s.close();
	}

}
