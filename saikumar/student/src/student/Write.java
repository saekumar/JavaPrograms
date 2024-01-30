package student;
import java.util.*;
import java.io.*;

public class Write {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		FileWriter sai=new FileWriter("C:\\Users\\ASUS\\OneDrive\\Desktop\\java programmings\\saikumar\\student\\src\\student\\Untitled 1.txt",true);
		Scanner s=new Scanner(System.in);
		System.out.println("enter sno,sname");
		int sno=s.nextInt();
		s.nextLine();
		String sname=s.next();
		
		sai.write(sno+" "+sname);
		sai.close();
		
		
	}

}
