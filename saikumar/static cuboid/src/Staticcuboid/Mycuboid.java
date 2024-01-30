package Staticcuboid;
class Cuboid
{
	static double len,bre,hei,v;
	public static void store(double l,double b,double h)
	{
		len=l;
		bre=b;
		hei=h;
	}
	public static void cal_vol()
	{
		v=len*bre*hei;
		System.out.println("volume is "+v);
		
	}
}

public class Mycuboid {
	

	public static void main(String[] args) {
		Cuboid.store(2.9,5.6,4.6);
		Cuboid.cal_vol();
		Cuboid.store(5.6, 3.2,8.9);
		Cuboid.cal_vol();
		
		// TODO Auto-generated method stub

	}

}
