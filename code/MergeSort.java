public class MergeSort{
    public static void mergeSort(int arr[],int p,int N)
    {
        if(p<N)
        {
        int q=(p+N)/2;
        mergeSort(arr,p,q);
        mergeSort(arr,q+1,N);
        merge(arr,p,q,N);
        }
    }
    public static void merge(int arr[],int p,int q,int N)
    {
        int n1=q-p+1;
        int n2=N-q;
        int l[]=new int[n1+1];
        int r[]=new int[n2+1];
        int i,j;
        for( i=0;i<n1;i++)
        {
            l[i]=arr[p+i];
        }
        for( j=0;j<n2;j++)
        {
            r[j]=arr[q+j+1];
        }
        l[i]=Integer.MAX_VALUE;
        r[j]=Integer.MAX_VALUE;
         i=0;
         j=0;
         //we could have used while loop with condition i<n1 && j<n2
         //but in that case we have to handle the remaining elements in the arrays separately
         //that would have taken another set of while loops to handle that
         //there are ways to code better look for solutions in books they were written by awesome people
        for(int k=p;k<N;k++)
        {
            if(l[i]<=r[j])
            arr[k]=l[i++];
            else
            arr[k]=r[j++];
        }
    }
    //remember one things
    //when we are making changes in the same array to all the indexing must be considered throughtly
    //not all of them will start form 0 and end on lenght as we are passing p and q as the range we w
    //we will be working on
    public static void main(String args[])
    {
        int arr[]={5,2,4,7,1,3,2,6};
        mergeSort(arr,0,arr.length-1);
        System.out.println("sorted array");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}