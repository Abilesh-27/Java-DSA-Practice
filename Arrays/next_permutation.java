import java.util.Arrays;
import java.util.Scanner;

public class next_permutation {
    public static int [] nextpermutation(int []arr)
    {
        int n=arr.length;
       int index=-1;
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                index=i;
                break;
            }
        }
        if(index==-1)
        {
           Arrays.sort(arr);
           return arr;
        }
        for(int i=n-1;i>index;i--)
        {
           if(arr[index]<arr[i])
           {
             swap_arr.swap(arr, index, i);
             break;
           }
        }
        Arrays.sort(arr, index+1, n);
        return arr;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int []ans=nextpermutation(arr);
        for(int i:ans)
        {
            System.out.print(i+" ");
        }

    }
}
