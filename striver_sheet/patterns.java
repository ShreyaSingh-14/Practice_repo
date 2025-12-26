
public class patterns
{
    public static void main(String[] args)
    {
	System.out.println("patterns 1");
 	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			System.out.print("*");
		}
	System.out.println();
	}

	System.out.println("patterns 2");
        for(int i=0;i<5;i++)
	{
		for(int j=0;j<i;j++)
		{
			System.out.print("*");
		}
	System.out.println();
	}

	System.out.println("patterns 3");
	  for(int i=0;i<5;i++)
	{
		for(int j=0;j<i;j++)
		{
			System.out.print(j+1);
		}
	System.out.println();
	}

	System.out.println("patterns 4");
	  for(int i=0;i<5;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print(i+1);
		}
	System.out.println();
	}

	System.out.println("patterns 5");
	  for(int i=0;i<5;i++)
	{
		for(int j=5;j>i;j--)
		{
			System.out.print("*");
		}
	System.out.println();
	}

	System.out.println("patterns 6");
	  for(int i=0;i<5;i++)
	{
		for(int j=5;j>i;j--)
		{
			System.out.print(5-j+1);
		}
	System.out.println();
	}

	System.out.println("patterns 7");
	  for(int i=0;i<5;i++)
	{
		for(int j=0;j<5-i-1;j++)
		System.out.print(" ");
		for(int k=0;k<=i;k++)
		System.out.print("*");
		for(int l=1;l<=i;l++)
		System.out.print("*");
	System.out.println();
	}
	System.out.println("patterns 8");
	  for(int i=0;i<5;i++)
	{
		for(int j=0;j<i;j++)
		System.out.print(" ");
		for(int k=0;k<5-i;k++)
		System.out.print("*");
		for(int l=1;l<5-i;l++)
		System.out.print("*");
	System.out.println();
	}
	
	System.out.println("patterns 10");
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4-i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("patterns 11");
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<=i;j++)
		{
			if((i+j)%2==0)
			System.out.print("1");
			else
			System.out.print("0");
		}
		System.out.println();
	}
}
}
 class patterns2
{
    public static void main(String[] args)
    {
	System.out.println("patterns 12");
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<=i;j++)
		System.out.print(j+1);
		for(int k=2;k<2*(4-i);k++)
		System.out.print(" ");   
		for(int l=0;l<=i;l++)
		System.out.print(i+1-l);
	System.out.println();
	}
	System.out.println("patterns 13");
	
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print((i*(i+1))/2+1+j+" ");
		}
		System.out.println();
	}

	System.out.println("patterns 14");
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print((char)(j+65));
		}
		System.out.println();
	}
	
	System.out.println("patterns 15");
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5-i;j++)
		{
			System.out.print((char)(j+65));
		}
		System.out.println();
	}

	System.out.println("patterns 16");
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print((char)(i+65));
		}
		System.out.println();
	}
	System.out.println("patterns 17");
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4-i;j++)
		System.out.print(" ");
		for(int k=0;k<=i;k++)
		System.out.print((char)(k+65));
		for(int l=0;l<i;l++)
		System.out.print((char)(i-l-1+65));
		System.out.println();
	}
	System.out.println("patterns 18");
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print((char)(69-i+j));
		}
		System.out.println();
	}
	
	System.out.println("patterns 19");
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5-i;j++)
		System.out.print("*");
		for(int k=0;k<2*i;k++)
		System.out.print(" ");
		for(int l=0;l<5-i;l++)
		System.out.print("*");
		System.out.println();
	}
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<=i;j++)
		System.out.print("*");
		for(int k=0;k<2*(4-i);k++)
		System.out.print(" ");
		for(int l=0;l<=i;l++)
		System.out.print("*");
		System.out.println();
	}
	System.out.println("patterns 20");
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<=i;j++)
		System.out.print("*");
		for(int k=0;k<2*(4-i);k++)
		System.out.print(" ");
		for(int l=0;l<=i;l++)
		System.out.print("*");
		System.out.println();
	}
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4-i;j++)
		System.out.print("*");
		for(int k=1;k<=2*(i+1);k++)
		System.out.print(" ");
		for(int l=0;l<4-i;l++)
		System.out.print("*");
		System.out.println();
	}
	System.out.println("patterns 21");
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			if(i==0||i==3||j==0||j==3)
			System.out.print("*");
			else
			System.out.print(" ");
		}
		System.out.println();
	}

	System.out.println("patterns 22");

		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)
			{	
				int top=i;
				int bottom=6-i;
				int left=j;
				int right=6-j;
				System.out.print(4-Math.min(Math.min(top,bottom),Math.min(right,left)));
			}
		System.out.println();
		}
    }
}
