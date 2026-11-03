import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[8];
        for(int i=0;i<8;i++)
        {
            a[i]=sc.nextInt();
        }
        int l=a.length;
        for(int i=1;i<l;i++)
        {
           
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key)
            {
               
                    a[j+1]=a[j];
                    
                
                j--;
            }
            a[j+1]=key;
        }
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}
