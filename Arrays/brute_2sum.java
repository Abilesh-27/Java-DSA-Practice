package medium;

import java.util.Scanner;

public class brute_2sum {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println(true);
                    return;
                }
            }
        }
        System.out.println(false);
    }
}
