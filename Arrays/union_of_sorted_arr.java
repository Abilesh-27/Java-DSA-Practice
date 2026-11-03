import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class union_of_sorted_arr {
    public static Set<Integer> union_of_sorted_array(int []arr1,int[]arr2)
    {
       TreeSet<Integer>set=new TreeSet<>();
       for(int i=0;i<arr1.length;i++)
       {
          set.add(arr1[i]);
       }
       for(int i=0;i<arr2.length;i++)
       {
        set.add(arr2[i]);
       }
       return set;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int arr2[]=new int[m];
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        Integer []arr3=union_of_sorted_array(arr1, arr2).toArray(new Integer[0]);
        for(int i=0;i<arr3.length;i++)
        {
            System.out.print(arr3[i]+" ");
        }
        
    }
}
