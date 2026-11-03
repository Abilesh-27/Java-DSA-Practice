
import java.util.Scanner;
import java.util.HashMap;
public class count_ele_arr
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean []visited=new boolean[n];
        for(int i=0;i<n;i++)
        {
            int count=1;
           if(visited[i])
            continue;
           for(int j=i+1;j<n;j++)
           {
             if(arr[i]==arr[j])
             {
                visited[j]=true;
                count++;
             }
            
           }
            System.out.println(arr[i]+" "+count);
        }
    }
}