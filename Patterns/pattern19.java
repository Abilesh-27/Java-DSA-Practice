import java.util.*;
public class pattern19 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(char ch=(char)('E'- i);ch<='E';ch++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
