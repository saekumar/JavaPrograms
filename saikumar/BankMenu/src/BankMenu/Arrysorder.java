package BankMenu;



import java.util.*;
public class Arrysorder
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		while(t!=0)
		
		{
		     
		    int n=s.nextInt();
		    int a[]=new int[n];
		    int b[]=new int[n];
		   
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=s.nextInt();
		         b[i]=s.nextInt();
		        
		    }
		    
		    int c[]=Arrays.sort(a);
		    for(int i=0;i<n;i++)
		    {
		        if(b[i]=='0')
		        {
		           System.out.print(a[i]); 
		           break;
		        }
		        
		    }
		    t--;
		    
		    
		    
		}
	
	}
}

