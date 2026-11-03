import java.util.*;
public class pallindrome_num {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=n;
        int rev=0;
        while(n>0)
        {
            int last_digit=n%10;
            rev=(rev*10)+last_digit;
            n=n/10;
        }
        if(rev==n1)
        {
            System.out.println("It is pallindrome Number");
        }
        else
        {
            System.out.println("It is not Pallindrome Number");
        }
    }
}
