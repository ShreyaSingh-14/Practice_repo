class buy_and_sell_brute_force{
     public static void main(String args[])
    {
        int price[]={100,113,110,85,105,102,86,63,81,101,94,106,101,79,94,90,97};
        int arr[]=new int[price.length-1];
        for(int i=0;i<price.length-1;i++)
        {
            arr[i]=price[i+1]-price[i];
        }
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum=sum+arr[j];
                if(sum>max)
                {
                    max=sum;
                }
            }
        }
        System.out.println(max);
    }
}