import java.util.Scanner;

public class optimal_missing_num_arr {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        long sum=0;
        n=n+1;
        for(int i=0;i<n-1;i++)
        {
            sum+=arr[i];
        }
        long expected_sum=n*(n+1)/2;
        int miss_num=(int)(expected_sum-sum);
        System.out.println(miss_num);
    }
}
