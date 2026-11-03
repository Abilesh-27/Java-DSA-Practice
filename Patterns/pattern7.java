import java.util.*;
public class pattern7 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=0;
        for(int i=1;i<2*n;i++)
        {
           if(i>=n)
           {
             star=2*n-i;
           }
           else
           {
             star=i;
           }
           for(int j=0;j<star;j++)
           {
             System.out.print("*");
           }
           System.out.println();
        }
    }
}
