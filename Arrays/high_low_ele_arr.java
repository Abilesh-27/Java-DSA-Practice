import java.util.HashMap;
import java.util.Scanner;

public class high_low_ele_arr {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>hash=new HashMap<>();
        int max=0,min=n;
        int maxhash=0,minhash=0;
        for(int i=0;i<n;i++)
        {
            hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);
            
        }
        for (var i : hash.keySet()) 
        {
            if (hash.get(i)>max) 
            {
            max=hash.get(i);
            maxhash=i;
            }
            if (hash.get(i)<min) 
            {
                min=hash.get(i);
                minhash=i;
            }
        }
        System.out.println(maxhash+" "+minhash);

        
    }
}
