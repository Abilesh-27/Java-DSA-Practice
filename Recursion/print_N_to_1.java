import java.util.Scanner;

public class print_N_to_1 {
    public static int rec(int n)
    {
        if(n==0)
            return 0;
        System.out.print(n+" ");
        return rec(n-1);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        rec(n);
    }
}
