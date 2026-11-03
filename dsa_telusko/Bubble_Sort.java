import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        int l=a.length;
        for(int i=0;i<l-1;i++)
        {
            for(int j=0;j<l-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(int i:a)
        {
            System.out.println(i);
        }
    }
}
