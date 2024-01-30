package SubSuper;
class Sai
{
	int i,j;
	Sai(int i,int j)
	{
		this.i=i;
		this.j=j;
		
	}
	public void dis()
	{
		System.out.println("i ->"+i+". j-> "+j);
	}
}
class Subclass45 extends Sai
{
	int k;
	Subclass45(int k)
	{
		super(12,13);
		this.k=k;
		
	}
	public void dis()
	{
		super.dis();
		System.out.println("k-> "+k);
	}
}

public class SAikumar77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Subclass45 s=new Subclass45(12);
       s.dis();
	}

}
