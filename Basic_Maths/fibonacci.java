import java.util.Scanner;


public class fibonacci {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int first=0;
        if(n==0)
        {
            System.out.println(0);
            return;
        }
        if(n==1)
        {
            System.out.println(0+" "+1);
            return;
        }
        int second_first=1;
        System.out.print(first+" "+second_first+" ");
        int third=0;
        for(int i=1;i<=n;i++)
        {
           third=first+second_first;
           first=second_first;
           second_first=third;
           System.out.print(third+" ");
        }
    }
}
