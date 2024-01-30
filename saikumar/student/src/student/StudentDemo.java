package student;
import java.util.*;
class Student
{
	int sno,age;
	String sname;
	Student(int sno,int age,String sname)
	{
		this.sno=sno;
		this.age=age;
		this.sname=sname;
	}
	public String toString()
	{
		return ("sno "+sno+" age  "+age+" sname "+sname);
	}
	
}
class SortBysno implements Comparator<Student>
{
	public int compare(Student a,Student b)
	{
		if(a.sno==b.sno)
		{
			return 0;
		}
		
		else if(a.sno<b.sno){
			return -1;
			
		}
		else
		{
			return 1;
		}
	}
	
}
class SortBysname implements Comparator<Student>
{
	public int compare(Student a,Student b)
	{
		return a.sname.compareTo(b.sname);
	}
}
class SortByAge implements Comparator<Student>
{
	public int compare(Student a,Student b)
	{
		if(a.age==b.age)
		{
			return 0;
		}
		
		else if(a.age<b.age){
			return -1;
			
		}
		else
		{
			return 1;
		}
	}
	
}


public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <Student> str=new Vector<Student>();
		
		int sno,age;
		String sname;
		Scanner sc=new Scanner(System.in);
		boolean repeat =true;
		int ch;
		while(repeat)
		{
			System.out.println("enter ur ch ");
			ch=sc.nextInt();
			if(ch==1)
			{
				Collections.sort(str,new SortBysno());
				for(int i=0;i<str.size();i++) {
					System.out.println(str.get(i));
			}
			}
			else if(ch==2)
			{
					Collections.sort(str,new SortBysname());
					for(int i=0;i<str.size();i++) {
						System.out.println(str.get(i));
			}
			}
			else if(ch==3)
			{
						Collections.sort(str,new SortByAge());
						for(int i=0;i<str.size();i++) {
							System.out.println(str.get(i));
			}
			}
			else if(ch==4)
			{
				sno=sc.nextInt();
				age=sc.nextInt();
				sname=sc.next();
				str.add(new Student(sno, age, sname));
				
			}
			else if(ch==5)
							
			{
							repeat=false;
		    }
			
			
			
		}

	}

}
