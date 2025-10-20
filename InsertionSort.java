import java.util.*;
public class InsertionSort
{
    public static void main(String args[])
    {
        int arr[]={5,2,4,6,1,3};
        insertion(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    private static void insertion(int arr[])
    {
        int key,j;
        for(int i=1;i<arr.length;i++)
        {
            key=arr[i];
            j=i-1;
            while(j>=0&&arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
 