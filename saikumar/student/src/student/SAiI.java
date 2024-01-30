package student;

import java.util.Scanner;

class Mani
{
	private int sno;
	private String sname;
	public void setno(int sno)throws Exception
	{
		if(sno<0)
		{
			throw new Exception("give correct sno ");
		}
		else
		{
			this.sno=sno;
		}
	}
	public void setsname(String sname)throws Exception
	{
		if(sname==null)
		{
			throw new Exception("give corret sname ");
			
		}
		else
		{
			this.sname=sname;
		}
	}
	public int  getsno()
	{
		return sno;
		
	}
	public String getname()
	{
		return sname;
	}
	public String toString()
	{
		return "sno "+sno+"\n"
				+ " sname "+sname;
	}
	
}

public class SAiI {

	public static void main(String[] args)throws Exception
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Mani m=new Mani();
		int sno=s.nextInt();
		String sname=s.next();
		m.setno(sno);
		m.setsname(sname);
		System.out.println(m);

	}

}
