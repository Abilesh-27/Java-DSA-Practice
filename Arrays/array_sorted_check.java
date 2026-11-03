import java.util.Scanner;

public class array_sorted_check {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        if(n==1)
            System.out.println("Sorted");
        int i=arr.length-1;
        int j=i-1;
        boolean istrue=true;
        while(i>0)
        {
            if(arr[j]>arr[i])
            {
                istrue=false;
                break;
            }
            i--;
            j=i-1;
        }
        if(istrue)
            System.out.println("Sorted");
        else
            System.out.println("Not Sorted");
    }
}
