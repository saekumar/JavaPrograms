package Menu;
import java.util.Scanner;
class Student
{
	int s_no;
	String s_name;
	int s_age;
	public void store(int no,String name,int a)
	{
		s_no=no;
		s_name=name;
		s_age=a;
		
	}
	public String dis()
	
	{
		
		String op=String.format("num is %d \nname is %s\nage is %d\n",s_no,s_name,s_age);
		
		return op;
		
	}
}

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int no=s.nextInt();
		String name=s.next();
		int a=s.nextInt();
		
		Student sd[]=new Student[n];
		int c=0;
		boolean repeat=true;
		while(repeat)
		{
			System.out.println("1.cre\n2.dis\n3.search\n4.print\n5.exit");
			System.out.println("enter your choice\n");
			int ch=s.nextInt();
			if(ch==1)
			{
				sd[c]=new Student();
				System.out.println("enter your choice\n");
				
				sd[c].store(no, name, a);
				c++;
				
				
			}
			else if(ch==2)
			{
				for(int i=0;i<c;i++)
				{
					System.out.print(sd[i].dis());
					
				}
			}
			else if(ch==3)
			{
				System.out.println("enter s.no to search\n");
				int x=s.nextInt();
				int search=0;
				for(int i=0;i<c;i++)
				{
					if(x==sd[i].s_no)
					{
						search=1;
						break;
						
					}
				}
				if(search==1)
				{
					System.out.println("exists");
					
				}
				else 
					System.out.println("not found");
				
			}
			else if(ch==4)
			{
			
				for(int i=0;i<c;i++)
				{
					if(sd[i].s_age<18)
					{
						System.out.println(sd[i].dis());
					}
				}
			}
			else if(ch==5)
			{
				repeat=false;
			}
			
		}
		s.close();
		
		
		

	}

}
