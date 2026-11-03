import java.util.Scanner;

public class rec_bubble_sort {
    public static void rec_bubble_sort1(int arr[],int n,int i)
    {
        if(i==n-1)
            return;
        for(int j=0;j<n-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        rec_bubble_sort1(arr, n, i+1);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        rec_bubble_sort1(arr, n, 0);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
