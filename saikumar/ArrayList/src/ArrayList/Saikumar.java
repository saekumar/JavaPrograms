package ArrayList;
import java.util.*;


public class Saikumar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList<Integer>a=new ArrayList();
		boolean repeat=true;
				int value;
		int index;
		while(repeat)
		{
			System.out.println("1. add\n 2. update\n 3.remove\n 4.print\n 5.check\n 6.exit\n");
			System.out.println("enter your chpocie");
			int ch=s.nextInt();
			if(ch==1)
			{
				System.out.println("enter the valuue to add");
				value=s.nextInt();
				a.add(value);
			}
			else if(ch==2)
			{
				System.out.println("enetr the index and new value");
				index=s.nextInt();
				
			}
		}

	}

}
