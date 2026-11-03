import java.util.*;
public class Amstrong_num {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=n;
        int n2=0;
        while(n1>0)
        {
            int last_digit=n1%10;
            n2+=Math.pow(last_digit,3);
            n1/=10;
        }
        System.out.println(n2);
        if(n2==n)
            System.out.println("It is Amstrong Number");
        else
            System.out.println("It is not Amstrong Number");
    }
}
