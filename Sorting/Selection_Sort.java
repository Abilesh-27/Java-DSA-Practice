import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=a.length-1;i>=0;i--)
        {
            int large=i;
            for(int j=0;j<i;j++)
            {
                if(a[large]<a[j])
                {
                    large=j;
                }
            }
            int temp=a[large];
            a[large]=a[i];
            a[i]=temp;
            

        }
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}
