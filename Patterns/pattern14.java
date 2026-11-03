import java.util.*;
public class pattern14 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char c='A';
        for(int i=1;i<=n;i++){
            int x=65;
            for(int j=1;j<=i;j++)
            {
               c=(char)x;
               System.out.print(c+" ");
               x++;
            }
            System.out.println();
        }
    }
}
