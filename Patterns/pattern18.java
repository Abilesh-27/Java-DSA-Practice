import java.util.Scanner;

public class pattern18 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<2*n;i++)
        {
            if(i>4)
            {
                for(int j=0;j<i-n;j++)
                {
                    System.out.print("*");
                }
                for(int j=0;j<2*(2*n-i);j++)
                {
                    System.out.print(" ");
                }
                for(int j=0;j<i-n;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<2*i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            if(i!=4)
                System.out.println();
        }
           
        }
    }
}
