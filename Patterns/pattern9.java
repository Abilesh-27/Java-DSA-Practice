import java.util.*;
public class pattern9 {
   public static void main()
   {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     for(int i=1;i<=n;i++)
     {
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(j);
        }
        System.out.println();
     }
   } 
}
