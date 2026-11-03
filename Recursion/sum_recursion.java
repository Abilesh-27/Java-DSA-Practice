import java.util.Scanner;

public class sum_recursion {
    public static int rec_sum(int n,int sum)
    {
        if(n==0)
            return sum;
        sum+=n;
        return rec_sum(n-1,sum);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        System.out.println(rec_sum(n,sum));
    }
}
