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
class recursion
{
	public static void main(String args[])
	{
	System.out.println("Linearly from 1 to N");
	recurAsc(5);
	System.out.println("print number from N to 1");
	recurDes(5);
	}
	static void recurAsc(int n)
	{
		if(n==0)
		return;
		
		recurAsc(n-1);
		System.out.println(n);
	}

	static void recurDes(int n)
	{
		if(n==0)
		return;
		System.out.println(n);
		recurDes(n-1);
		
	}

}
class Solution {
	public static void main(String args[])
	{
		int arr[]={3,5,4,6,7,5,3,0,4};
		reverseArray(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
    static void reverseArray(int arr[]) {
        // code here
        helper(0,arr.length-1,arr);
    }
    static void helper(int i,int j,int arr[])
    {
        if(i>=j)return;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        helper(i+1,j-1,arr);
    }
}
class str
{
	public static void main(String args[])
	{
	String s="fnxelvbzxubkrhoxzxkrpqfougxlpdelimhtaqrkzlupincexzludifmxmyqiuvauqvxgixmqvgjstcongurtfroajfcqrpegicnalmrgokbujfdyidbpelloeldjyryqkmocwwhvixarrgoqnwfqtrqosxqzrobhskwitkpjptebwaqtorwaixbydvfyfxdexidcttwm";
int n=1131;
System.out.println(getCount(s,n));
	}
    static int getCount(String S, int N) {
        // your code here
        int arr[]=new int[26];
        int count=0;
       // System.out.println(S.length());
        for(int i=0;i<S.length();i++)
        {
            arr[S.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]==N)
            {
                count++;
            }
		System.out.println(arr[i]);
            
        }
        return count;
    }

}
