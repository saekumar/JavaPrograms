package Nonstaticcuboid;
class Cuboid1
{
	double le,br,he,v;
	public void store(double l,double b,double h)
	{
		le=l;
		br=b;
		he=h;
		v=le*br*he;
		System.out.println("volume is "+v);
		
		
	}
}

public class NonStatic {

	public static void main(String[] args) {
		Cuboid1 c1=new Cuboid1();
		c1.store(6.9, 9.8,7.6);
		c1.store(8.5, 6.4,9.7);
		
		
		// TODO Auto-generated method stub

	}

}
