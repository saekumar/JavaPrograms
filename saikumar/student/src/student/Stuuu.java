package student;
import java.util.*;
class Studentt
{
	private int sno;
	private int age;
	private String name;
	public void setData(int sno,int age,String name)
	{
		this.sno=sno;
		this.age=age;
		this.name=name;
	}
	public int getsno()
	{
		return sno;
		
	}
	public int getage()
	{
		return age;
		
	}
	public String getsname()
	{
		return name;
		
	}
	public String toString()
	{
		return (" sno "+getsno()+"\n age "+getage()+"\n name "+getsname());
		
	}
}
public class Stuuu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Studentt te=new Studentt();
		LinkedList<Studentt> st=new LinkedList<>(); ;
		int sno,age,ch,key,i;
		String name;
		boolean repeat =true;
		while(repeat)
		{
			System.out.println("1.add\n2.display\n3.search\n");
			System.out.println("enter ur ch");
			ch=s.nextInt();
			if(ch==1)
			{
				
				sno=s.nextInt();
				age=s.nextInt();
				name=s.next();
				te.setData(sno, age, name);
				
				st.add(te);
			}
			else if(ch==2)
			{
				
			for(i=0;i<st.size();i++)
			{
				System.out.println(st.get(i));
			}
			}
			else if(ch==3)
			{
				System.out.println("enter sno to search ");
				key=s.nextInt();
				for(i=0;i<st.size();i++)
				{
					if(st.get(i).getsno()==key)
					{
						System.out.println(st.get(i));
						break;
					}
				}
				if(i==st.size())
				{
					System.out.println("not exists ");
				}
			}
			else
				
			{
				repeat=false;
			}
		}

	}

}
