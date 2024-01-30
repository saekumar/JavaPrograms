package menu;
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
	public void dis() {
		
	}
	
	
}


public class Studentdetails {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    boolean repeat=true;
	    Student sd[]=new Student[10];
	    int c=0;
	    while(repeat)
	    {
	    	System.out.println("1.create\n2.display\n3.search based on s_no\n4.print stddetails\n5.exit");
	    System.out.println("enter your choice");
	    int ch=s.nextInt();
	    if(ch==1)
	    {
	    	sd[c]=new Student();
	    	System.out.println("enter s.no,s.name,age");
	    	int no=s.nextInt();
			String name=s.nextLine();
			int a=s.nextInt();
			sd[c].store(no,name,a);
			c++;
			
			
	    }
	    else if(ch==2)
	    {
	    	for(int i=0;i<c;i++)
	    	{
	    		System.out.println(sd[i].dis);
	    		
	    	}
	    }
	    }
	    else if(ch==3)
	    {
	    	System.out.println("enter s_no to thr search");
	    	int x=s.nextInt();
	    	int sear=0;
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
	    		System.out.println("not exist");
	    }
	    else if(ch==4)
	    {
	    	for(int i=0;i<c;i++)
	    	{
	    		if(sd[i].age<18)
	    		{
	    			System.out.println(sd[i].display);
	    		}
	    	}
	    }
	    else if(ch==5)
	    	repeat=false;
	    
		// TODO Auto-generated method stub

	}

}
