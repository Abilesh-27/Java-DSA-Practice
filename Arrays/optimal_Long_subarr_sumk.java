package medium;
import java.util.Scanner;

public class optimal_Long_subarr_sumk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int left=0;
        int right=0;
        int sum=0;
        int max=0;
        while(right<n)
        {
             sum += arr[right];

            while(left<=right&&sum>k)
            {
              sum-=arr[left];
              left++;
            }
            if(sum==k)
            {
               max=Math.max(max,right-left+1);
            }
            right++;
            
        }
        System.out.println(max);
    }
}
