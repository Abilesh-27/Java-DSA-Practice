package medium;

import java.util.HashMap;
import java.util.Scanner;

public class Better_Long_subarr_sumk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        HashMap<Integer,Integer>map=new HashMap<>();
        int prevSum=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            prevSum+=arr[i];
            if(prevSum==k)
            {
               max=Math.max(max,i+1);
            }
            int ele=prevSum-k;
            if(map.containsKey(ele))
            {
                max=Math.max(max,(i+1)-map.get(ele));
            }
            if(!map.containsKey(prevSum))
            map.put(prevSum,i+1);
        }
        System.out.println(max);
        
    }
    
}
