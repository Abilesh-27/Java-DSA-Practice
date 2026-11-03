import java.util.HashMap;
import java.util.Scanner;

public class optimal_appear_once_arr
{
    public static int appear_once(int []arr)
    {
        int xor=0;
         for(int i=0;i<arr.length;i++)
         {
            xor=xor^arr[i];
         }
         return xor;
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
        System.out.println(appear_once(arr));
        
    }
}