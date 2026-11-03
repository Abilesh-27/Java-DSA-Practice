import java.util.*;
public class pattern17
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char ch='A';
        for(int i=0;i<n;i++)
        {
            int x=64;
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<((2*i)+1);j++)
            {
                if(j<=(((2*i)+1)/2))
                {
                     x++;
                    ch=(char)x;
                    System.out.print(ch+" ");
                }
                else
                {
                    x--;
                    ch=(char)x;
                    System.out.print(ch+" ");
                }
            }
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}