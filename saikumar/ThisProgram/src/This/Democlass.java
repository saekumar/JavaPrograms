package This;
class Demo
{
	Demo()
	{
		this(12,13);
		System.out.println("1st\n");
	}
	Demo(int x,int y)
	{
		this(13);
		System.out.println("2nd\n");
		
	}
	Demo(int x)
	{
		System.out.println("3rd\n");
		
	}
}

public class Democlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Demo d=new Demo();
		}

	}
}