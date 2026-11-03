import java.util.Scanner;

public class name_recursion {
    public static int rec(int n)
    {
        if(n==0)
            return 0;
        System.out.print("Abi27 ");
        return rec(n-1);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        rec(n);
    }
}
