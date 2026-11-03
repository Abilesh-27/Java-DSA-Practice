import java.util.Scanner;

public class move_zeros_to_end {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];   
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                j=i;
                break;
            }
        }
        for(int i=j+1;i<n;i++)
        {
            if(arr[i]!=0)
            {
                swap_arr.swap(arr,i,j);
                j++;
            }
        }
        print_arr.printArr(arr);
    }
}
