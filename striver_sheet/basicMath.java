import java.util.*;
public class basicMath {
   	 public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("enter the number");
		int n=sc.nextInt();
		int count=0;
		for(int a=n;a>0;a=a/10)
		{
			count++;
		}	
		System.out.println(count);

		count=0;
		int a=n;
		while(a>0)
		{
			count++;
			a=a/10;
		}
		System.out.println(count);
	}

}
