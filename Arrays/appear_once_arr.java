import java.util.HashMap;
import java.util.Scanner;

public class appear_once_arr {
    public static int appear_once(int []arr)
    {
        int num=-1;
         HashMap<Integer,Integer>map=new HashMap<>();
         for(int i=0;i<arr.length;i++)
         {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
         }
         for(int key:map.keySet())
         {
            if(map.get(key)==1)
            {
               num=key;
               break;
            }
         }
         return num;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(appear_once(arr));
        
    }
}
