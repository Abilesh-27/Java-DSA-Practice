import java.util.ArrayList;
import java.util.Scanner;

public class leader_arr {
    public static int[] leader(int arr[])
    {
        int n=arr.length;
        ArrayList<Integer>list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>max)
            {
                list.add(arr[i]);
                max=arr[i];
            }
        }
        int[] ans = new int[list.size()];

        for(int i = 0; i < list.size(); i++)
        {
            ans[i] = list.get(i);
        }
        return ans;

    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
        int [] result=leader(arr);
        print_arr.printArr(result);
    }
}
