public class SelectionSort{
    private static void selectionSort(int arr[])
    {
        int min;
        int temp;
        for(int i=0;i<arr.length-1;i++)
        {
            min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public static void main(String args[])
    {
        int arr[]={64,25,11,22,12};
        selectionSort(arr);
        System.out.println("sorted array");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}