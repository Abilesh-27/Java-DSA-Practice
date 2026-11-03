package medium;

import java.util.HashSet;
import java.util.Scanner;

public class optimal_2sum {
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
        HashSet <Integer>set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(set.contains(target-arr[i]))
            {
                System.out.println(true);
                return;
            }
            set.add(arr[i]);
        }
        System.out.println(false);
    }
}
