package temperature;
import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int te=s.nextInt();
		if(te<0)
		{
			System.out.println("freezing weather ");
			
		}
		else if(te<10 && te>0)
		{
			System.out.println("very cold weather ");
		}
		else if(te<20 && te>10)
		{
			System.out.println("cold weather ");
		}
		else if(te<30 && te>20)
		{
			System.out.println("normal weather ");
		}
		else if(te<40 && te>30)
		{
			System.out.println("hot weather ");
		}
		else if( te>=40)
		{
			System.out.println("very hot weather ");
		}
		// TODO Auto-generated method stub
		s.close();

	}

}
