package SubSuper;
class Sire
{
	public String toString()
	{
		return "sai";
	}
}
class Hire extends Sire
{
	public String toString()	
	{
		return super.toString()+" hari";
		
	}
}

public class Himanshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Hire h=new Hire();
      System.out.println(h);
	}

}
