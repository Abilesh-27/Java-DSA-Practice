import java.util.*;
public class pattern16
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char c='A';
        int x=65;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++){
                c=(char)x;
                System.out.print(c+" ");
            } 
            x++;
            System.out.println();
        }
    }
}