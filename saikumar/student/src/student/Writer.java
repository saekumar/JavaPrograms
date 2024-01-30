package student;


	
	import java.io.*;
	import java.util.*;

	public class Writer {

		public static void main(String[] args) throws Exception
		{
			// TODO Auto-generated method stub
			File f1=new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\java programmings\\saikumar\\student\\src\\student\\Untitled 1");
			File f2=new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\java programmings\\saikumar\\student\\src\\student\\stddetails");
			File f3=new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\java programmings\\saikumar\\student\\src\\student\\3rdfile");
			PrintWriter p=new PrintWriter(f3);
			Scanner s;
			s=new Scanner(f1);
			while(s.hasNextLine())
			{
				String a=s.nextLine();
				p.print(a);
				p.println();
			}
			s=new Scanner(f2);
			while(s.hasNextLine())
			{
				String a=s.nextLine();
				p.print(a);
				p.println();
			}
			p.close();
			s=new Scanner(f3);
			while(s.hasNextLine())
			{
				String a=s.nextLine();
				System.out.println(a);
				
			}
			
			
			

		}

	}



