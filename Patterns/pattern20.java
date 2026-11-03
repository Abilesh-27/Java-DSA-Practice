import java.util.*;
public class pattern20 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n*2;i++)
        {
            if(i>5)
            {
               for(int j=0;j<((2*n)-i);j++)
               {
                  System.out.print("*");
               }
               for(int j=0;j<((2*i)-(2*n));j++)
               {
                  System.out.print(" ");
               }
               for(int j=0;j<((2*n)-i);j++)
               {
                  System.out.print("*");
               }
               System.out.println();
            }
            else
            {
                for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<(2*n-2*i);j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
           
                System.out.println();
            

        }
    }
}
}
