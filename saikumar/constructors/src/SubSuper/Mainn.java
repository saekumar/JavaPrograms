package SubSuper;
import java.util.*;
public class Mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int id=s.nextInt();
		int hp=s.nextInt();
		String etype=s.next();
		double ewei=s.nextDouble();
		Engine e=new Engine();
		System.out.println(e);
		s.close();
		

	}

}

class Engine
{
	 int id;
	 int hp;
	 String etype;
	double ewei;
	 void setid(int id)
	{
		this.id=id;
	}
	void sethp(int hp)
	{
		this.hp=hp;
	}
	void setetype(String etype)
	{
		this.etype=etype;
	}
	void setewei(double ewei)
	{
		this.ewei=ewei;
	}
	int getid()
	{
		return id;
	}
	int gethp()
	{
		return hp;
	}
	String getetype()
	{
		return etype;
	}
	double getewei()
	{
		return ewei;
	}
	public String toString()
	{
		return getid()+gethp()+getetype()+getewei();
	}
}

