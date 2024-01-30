package MyPhone;

public class MyPhone {

	public static void main(String[] args) {
		long ph=9492241468L;
		
		phonenmbr(ph);
		
		
		// TODO Auto-generated method stubṆ

	}
	public static void phonenmbr(long ph)
	{
		long t,r, k;
		r=(ph%100);
		t=(ph/100000000);
		k=r+t;
		System.out.println("ans is "+k);
		
	}
	

}
