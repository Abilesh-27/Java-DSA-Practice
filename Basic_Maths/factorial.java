import java.util.Scanner;

public class factorial {
    public static int fact(int n,int f)
    {
        if(n==0)
            return f;
        f*=n;
        return fact(n-1,f);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n,1));
    }
}
