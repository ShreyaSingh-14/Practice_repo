class test
{
    public static int numSpecial(int[][] mat)
        {
            for(int i=0;i<mat.length;i++)
            {
                for(int j=i;j<mat[0].length;j++)
		{
			System.out.print("*");
		}
		System.out.println();
            }
		return 0;
        }
	public static void main(String args[])
	{
		int arr[][]={{1,0,0},{0,0,1},{1,0,0}};
		System.out.println(numSpecial(arr));
	}
}