import java.util.Scanner;
public class reverse_array {
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
            t=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=t;
        }
        for(int I:arr)
        {
           System.out.print(I+" ");
        }
    }
}
