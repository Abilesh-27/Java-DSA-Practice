package medium;

import java.util.Scanner;

public class optimal_sort_012 {
    public static void swap(int []nums,int a,int b)
    {
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public static void sortColors(int[] nums) {
        int n=nums.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high)
        {
           if(nums[mid]==0)
           {
             swap(nums,low,mid);
             low++;
             mid++;
           }
           else if(nums[mid]==1)
           {
             mid++;
           }
           else if(nums[mid]==2)
           {
              swap(nums,high,mid);
              high--;
           }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sortColors(arr);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
