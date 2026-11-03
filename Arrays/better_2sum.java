package medium;

import java.util.Arrays;
import java.util.Scanner;

public class better_2sum {
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
        Arrays.sort(arr);
        int left=0;
        int right=n-1;
        while(left<right)
        {
            int sum=arr[left]+arr[right];
            if(sum==target)
            {
                System.out.println(true);
                return;
            }
            if(sum<target)
            {
                left++;
            }
            if(sum>target)
            {
                right--;
            }
        }
        System.out.println(false);
    }
}
