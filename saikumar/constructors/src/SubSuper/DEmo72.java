package SubSuper;
class Superclass
{
	Superclass()
	{
		this(11);
		System.out.println("sai\n");
		
	}
	Superclass(int x)
	{
		System.out.println("hari\n");
		
	}
}
class Subclass extends Superclass
{
	Subclass()
	{
		this(45);
		System.out.println("teja\n");
	}
	Subclass(int y)
	{
		super(11);
		
		System.out.println("tejasree\n");
	}
}

public class DEmo72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subclass s=new Subclass();

	}

}
