package arraysrecta;
import java.util.*;
class Gruhaa
{
	public void Solution(String sa,int k)
	{
		int i,j;
		int n=sa.length();
		int c=n-k;
		String st[]=new String[10];
		for(i=1,j=i+k;i<=n-k;i++)
		{
		 st[i]=sa.substring(i,j);
		}
		
		
		Arrays.sort(st);
		System.out.println(st[1]);
		System.out.println(st[c]);
		
	}
	
}

public class Hacker {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String sa=s.next();
		int k=s.nextInt();
		Gruhaa g=new Gruhaa();
		g.Solution(sa, k);

	}

}
