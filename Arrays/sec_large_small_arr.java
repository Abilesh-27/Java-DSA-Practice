import java.util.Scanner;

public class sec_large_small_arr {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sec_max=0;
        int sec_min=0;
        for(int i=0;i<n;i++)
        {
            int n1=sc.nextInt();
            if(max<n1)
            {
              sec_max=max;  
              max=n1;
            }
            else if(n1 > sec_max && n1 != max)
            {
                sec_max=n1;
            }
            if(min>n1)
            {
                sec_min=min;
                min=n1;
            }
            else if(n1 < sec_min && n1 != min)
            {
                sec_min = n1;
            }
        }
        System.out.println(sec_max);
        System.out.println(sec_min);
    }
}
