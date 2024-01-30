package student;
import java.util.*;
import java.io.*;

public class Sort {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\java programmings\\saikumar\\student\\src\\student\\stddetails");
		Scanner s=new Scanner(f);
		String a[]=new String[100];
		int i=0,c=0;
		while(s.hasNext())
		{
			a[i]=s.next();
			i++;
			c++;
		}
        Arrays.sort(a,0,c);
        for(i=0;i<c;i++)
        {
        System.out.println(a[i]);
        }
	}

}
