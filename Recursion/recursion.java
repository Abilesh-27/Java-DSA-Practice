import java.util.Scanner;
import java.util.Scanner;

 class reverse_array {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int t=1;
        for(int i=0;i<n/2;i++)
        {
            swap_arr.swap(arr, i, n-i-1);
        }
        print_arr.printArr(arr);
    }
}

public class recursion {
    public static int rec(int n,String s,int c)
    {
        if(n==0)
            return c;
        System.out.print(s+" ");
        c++;
        return rec(n-1,s,c);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        int c=0;
        int n1=rec(n,s,c);
        System.out.println();
        System.out.println(s+" is printed by "+n1+" times");
    }
}
