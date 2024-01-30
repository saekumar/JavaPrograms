package prudhvi2;
import java.util.Scanner;
class sai
{
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }


public class Interview {

	
		    public static void main(String args[])
		    {
		    	Scanner s=new Scanner(System.in);
		    	int n=s.nextInt();
		        int arr[] =new int[n];
		        for(int i=0;i<n;i++)
		        {
		        	arr[i]=s.nextInt();
		        }
		        int x =s.nextInt();
	
		        
		        int result = search(arr, x);
		        if (result == -1)
		            System.out.print(
		                "false\n");
		        else
		            System.out.print("true\n "
		                             + result);
		    }
		}

}
