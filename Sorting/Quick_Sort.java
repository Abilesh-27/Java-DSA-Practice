import java.util.Scanner;
public class Quick_Sort
{    
public static void quick_sort(int []arr,int low,int high)
{
    if(low<high)
    {
        int pivot=partition(arr,low,high);
        quick_sort(arr,low,pivot-1);
        quick_sort(arr,pivot+1,high);
    }
}
public static int partition(int []arr,int low,int high)
{
    Swap obj=new Swap();
    int pivot=arr[high];
    int i=low-1;
    for(int j=low;j<high;j++)
    {
        if(arr[j]<pivot)
        {
            i++;
            obj.swap_arr(arr, i, j);
        }
    }
    obj.swap_arr(arr, pivot, i);
    return i+1;
}

    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        quick_sort(a, 0, a.length-1);
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    
    }
}