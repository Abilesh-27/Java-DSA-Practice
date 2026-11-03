import java.util.*;
public class left_arr_ro1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        // int temp=0;
        // for(int i=0;i<n-1;i++)
        // {
        //     int j=i+1;
        //     temp=arr[j];
        //     arr[j]=arr[i];  //in j=(i-1+n)%n
        //     arr[i]=temp;
            
            
        // }
        int first=arr[0];
        for(int i=0;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[n-1]=first;
        for(int i:arr)
        {
           System.out.print(i+" ");
        }
    }
}