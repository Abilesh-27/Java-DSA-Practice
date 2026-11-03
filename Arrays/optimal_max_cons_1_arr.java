import java.util.HashMap;
import java.util.Scanner;

public class optimal_max_cons_1_arr {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
           if(arr[i]==1)
           {
              count++;
           }
           else
           {
             if(count>max)
             {
                max=count;
             }
             count=0;
           }
        }
        if(count>max)
        {
                max=count;
        }
        System.out.println(max);
    }
}
