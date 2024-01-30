package student;
import java.util.*;
public class CountryVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Vector<String> sa=new Vector<String>();
		boolean repeat =true;
		String name,key;
		int ch;
		while(repeat)
		{
			ch=s.nextInt();
			if(ch==1)
			{
				name=s.next();
				sa.add(name);
			}
			else if(ch==2)
				
			{
			 Collections.sort(sa);
				
			}
			else if(ch==3)
			{
				key=s.next();
				if(sa.contains(key))
				{
					System.out.println("yess");
				}
				else
				{
					System.out.println("nooo");
				}
				
			}
			else
			{
				repeat=false;
			}
		}
		
		

	}

}
