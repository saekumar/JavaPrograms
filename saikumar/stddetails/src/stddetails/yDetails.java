package stddetails;
import java.util.Scanner;
class Std_det
{
	int s_no;
	String s_name;
	public void store(int s1,String name)
	{
		s_no=s1;
		s_name=name;
		
	}
	public String dis()
	{
		String op;
		op=String.format("s.no=%d s.name +%s",  s_no,s_name);
		
		return op;
		
		
	}
	
}


public class yDetails {
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		Std_det sd=new Std_det[n];
		for(int i=0;i<n;i++)
		{
			int m=s.nextInt();
			
			
		}
		// TODO Auto-generated method stub

	}

}
