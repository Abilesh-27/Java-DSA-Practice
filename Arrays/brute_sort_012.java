package medium;
import java.util.Scanner;

public class brute_sort_012{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
      
        Merge_Sort.merge_sort(arr, 0, n-1);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    
}
