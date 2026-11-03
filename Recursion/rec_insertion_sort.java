import java.util.*;
public class rec_insertion_sort
{
    public static int[] rec_insertion_sort1(int[] arr, int n,int i)
    {
       if(i==n)
        return arr;
       int key=arr[i];
       int j=i-1;
       while(j>=0&&key<arr[j])
       { 
         arr[j+1]=arr[j];
         j--;
       }
       arr[j+1]=key;
       recursion obj=new recursion();
    
       return rec_insertion_sort1(arr,n,i+1);
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
        rec_insertion_sort1(arr,n,1);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}