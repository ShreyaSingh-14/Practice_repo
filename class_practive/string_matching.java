import java.util.*;
public class string_matching {
    public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the main string");
		String str=sc.next().trim();	
		System.out.println("enter the pattern");
		String pat=sc.next();
		int count=0;
		for(int i=pat.length();i<str.length();i++)
		{
			if(pat.substring(pat.length()-1,i).equals(pat))
			count++;
		}
		System.out.println("count="+count);
	}
}
