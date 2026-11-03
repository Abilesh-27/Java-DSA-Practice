import java.util.Scanner;

public class print_1_to_N {
    public static int rec(int n,int i)
    {
        if(i==n+1)
            return 0;
        System.out.print(i+" ");
        return rec(n,i+1);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        rec(n,i);
    }
}
