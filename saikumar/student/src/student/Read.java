package student;
import java.util.*;
import java.io.*;


public class Read {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		File sai=new File("C:\\\\Users\\\\ASUS\\\\OneDrive\\\\Desktop\\\\java programmings\\\\saikumar\\\\student\\\\src\\\\student\\\\Untitled 1");
		Scanner s=new Scanner(sai);
		int sno=s.nextInt();
		s.nextLine();
		String sname=s.next();
		System.out.println("sno"+sno+"sname is "+sname);

	}

}
