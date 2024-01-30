package student;
class Superclass
{
	 void dis()
	{
		System.out.println("super class  ");
	}
}
class Subclass extends Superclass
{
	void dis()
	{
		System.out.println("sub class  ");
	} 
}

public class Methodfinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subclass s=new Subclass();
		s.dis();

	}

}
