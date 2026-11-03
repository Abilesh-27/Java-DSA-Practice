import java.util.Scanner;

public class arr_ro_k_times {
    public static void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap_arr.swap(nums, left, right);

            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        // int arr[]=new int[n];
        // int m=0;
        // for(int i=n-k;i<n;i++)
        // {
        //    arr[m]=nums[i];
        //    m++;
        // }
        // for(int i=0;i<n-k;i++)
        // {
        //     arr[m]=nums[i];
        //     m++;
        // }
        // int j=0;
        // for(int i:arr)
        // {
        //     nums[j]=i;
        //     j++;
        // }//TC O(N) SC O(N)
        rotate(nums,k); //TC O(N) SC O(1)
        for(int i:nums)
        {
            System.out.print(i+" ");
        }
    }
}
