class maxSubarrayDivideAndConquer
{
    //nlogn time complexity 
    public static void main(String args[])
    {
        int price[]={100,113,110,85,105,102,86,63,81,101,94,106,101,79,94,90,97};
        int arr[]=new int[price.length-1];
        for(int i=0;i<price.length-1;i++)
        {
            arr[i]=price[i+1]-price[i];
        }
       int max=max_subarray(arr,0,arr.length-1);
        System.out.println(max);
    }
    private static int max_subarray(int arr[],int low,int high)
    {
        int mid;
        int left_sum;
        int right_sum;
        int cross_sum;
        if(high==low)
        {
            return arr[low];
        }
        else
        {
            mid=(low+high)/2;
            left_sum=max_subarray(arr,low,mid);
            right_sum=max_subarray(arr,mid+1,high);
            cross_sum=max_cross(arr,low,mid,high);
            return Math.max(left_sum,Math.max(right_sum,cross_sum));
        }
    }
    private static int max_cross(int arr[],int low,int mid,int high)
    {
        int left_sum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=mid;i>=0;i--)
        {
            sum=sum+arr[i];
            if(sum>left_sum)
            {
                left_sum=sum;
            }
        }
        int right_sum=Integer.MIN_VALUE;
        sum=0;
        for(int j=mid+1;j<arr.length;j++)
        {
            sum=sum+arr[j];
            if(sum>right_sum)
            {
                right_sum=sum;
            }
        }
        return left_sum+right_sum;
    }
}