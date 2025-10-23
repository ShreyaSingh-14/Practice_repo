public class kadaneAlgorithm {
    public static void main(String args[])
    {
        int price[]={100,113,110,85,105,102,86,63,81,101,94,106,101,79,94,90,97};
        int arr[]=new int[price.length-1];
        for(int i=0;i<price.length-1;i++)
        {
            arr[i]=price[i+1]-price[i];
        }
        int max=arr[0];
        int endMax=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            endMax=Math.max(endMax+arr[i],arr[i]);
            max=Math.max(endMax,max);
        }
        System.out.println(max);
    } 
}
