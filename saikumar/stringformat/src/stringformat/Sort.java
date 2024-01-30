package stringformat;
import java.util.*;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		StringTokenizer st=new StringTokenizer(str);
		int c=st.countTokens();
		String sa[]=new String[c];
		int i=0;
		while(st.hasMoreElements())
		{
			sa[i]=st.nextToken();
			i++;
		}
		Arrays.sort(sa);
		for(i=0;i<c;i++)
		{
		System.out.println(sa[i]);
		}
	}

}
