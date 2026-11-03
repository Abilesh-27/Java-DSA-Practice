import java.util.Scanner;

public class Linear_Search
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        boolean flag=false;
        int t=sc.nextInt();
        for(int i=0;i<10;i++)
        {
            if(a[i]==t)
            {
                System.out.println("Found at index "+i);
                flag=true;
                return;
            }
        }
        System.out.println("Not Found");
    }
}