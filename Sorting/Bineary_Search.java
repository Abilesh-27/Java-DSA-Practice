import java.util.Scanner;

public class Bineary_Search
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        int f=0;
        int l=a.length-1;
        int t=sc.nextInt();
        while(l>=f)
        {
            int mid=(l+f)/2;
            if(a[mid]==t)
            {
                System.out.println(mid);
                return;
            }
            else if(a[mid]<t)
            {
                f=mid+1;
            }
            else if(a[mid]>t)
            {
                l=mid-1;
            }
        }
        System.out.println("No element found");
    }
}