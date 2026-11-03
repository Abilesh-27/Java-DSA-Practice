import java.util.Scanner;

public class hashing {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int hash[]=new int[1000000001];
        for(int i=0;i<n;i++)
        {
            hash[arr[i]]+=1;
        }
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++)
        {
            int in=sc.nextInt();
            System.out.print(in+":"+hash[in]+" ");
            System.out.println();
        }
    }
}
