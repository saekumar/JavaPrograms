package stringformat;
import java.util.*;

public class stringss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		
		String  date;
		int day,mon,year,no_of;
		date=s.next();
		String s1=date.substring(0,2);
		mon=Integer.parseInt(s1);
		String s2=date.substring(3,5);
        day=Integer.parseInt(s2);
        String s3=date.substring(6,8);
        year=Integer.parseInt(s3);
        if(mon==1|| mon==3 ||mon==5 || mon==7 || mon==8 || mon==10 ||mon==12 )
        {
        	no_of=31;
        	
        }
        else if(mon==4 || mon==6 || mon==9 || mon==11)
        {
        	no_of=30;
        }
        else
        {
        	if(year%4==0)
        	{
        		no_of=29;
        	}
        	else
        	{
        		no_of=28;
        	}
        }
        
        if(mon>12 || no_of>31)
        {
        	System.out.println("invalid\n");
        }
        else
        {
        	System.out.println("valid\n");
        	switch(mon)
        	{
        	case 1:System.out.println(day+"jan");
        	break;
        	case 2:System.out.println(day+"feb");
        	break;
        	case 3:System.out.println(day+"mar");
        	break;
        	case 4:System.out.println(day+"april");
        	break;
        	case 5:System.out.println(day+"may");
        	break;
        	case 6:System.out.println(day+"june");
        	break;
        	case 7:System.out.println(day+"july");
        	break;
        	case 8:System.out.println(day+"aug");
        	break;
        	case 9:System.out.println(day+"sept");
        	break;
        	case 10:System.out.println(day+"oct");
        	break;
        	case 11:System.out.println(day+"nov");
        	break;
        	case 12:System.out.println(day+"dec");
        	break;
        	}
        }
        
	}

}
