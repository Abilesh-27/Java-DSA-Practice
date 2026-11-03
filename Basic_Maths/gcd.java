import java.util.*;
public class gcd
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1==0&&n2!=0)
        {
            System.out.println(n2);
            return;
        }
        if(n2==0&&n1!=0)
        {
            System.out.println(n1);
            return;
        }
        if(n2%n1==0)
        {
            System.out.println(n1);
            return ;
        }
        if(n1%n2==0)
        {
            System.out.println(n2);
            return ;
        }
        int gcd=1;
        for(int i=Math.min(n1,n2)/2;i>=2;i--)
        {
            if((n1%i==0)&&(n2%i==0))
            {
                gcd=i;
                break;
            }
        }
        System.out.println(gcd);

    }
}