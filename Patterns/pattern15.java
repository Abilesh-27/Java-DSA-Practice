import java.util.*;
public class pattern15 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char c;
        for(int i=1;i<=n;i++)
        {
            int x=65;
            for(int j=0;j<=(n-i);j++)
            {
               c=(char)x;
               System.out.print(c+" ");
               x++;
            }
            System.out.println();
        }
    }
}
