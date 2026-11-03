import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class optimal_union_of_sorted_arr
{
    public static List<Integer> union_of_sorted_arr(int arr1[],int arr2[])
    {
        ArrayList<Integer>list=new ArrayList<>();
        int i=0;int j=0;
        int n1=arr1.length;
        int n2=arr2.length;
        while(i<n1&&j<n2)
        {
            if(arr1[i]<arr2[j])
            {
                if(((list.isEmpty())||(list.get(list.size()-1)!=arr1[i])))
                list.add(arr1[i]);
                i++;
            }
            else if(arr2[j]<arr1[i])
            {
               if(((list.isEmpty())||(list.get(list.size()-1)!=arr2[j])))
               list.add(arr2[j]);
               j++;
            }
            else 
            {
                if(((list.isEmpty())||(list.get(list.size()-1)!=arr1[i])))
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        while(i<n1)
        {
            if(list.get(list.size()-1)!=arr1[i])
            {
                list.add(arr1[i]);
               
            }
            i++;
        }
        while(j<n2)
        {
            if(list.get(list.size()-1)!=arr2[j])
            {
                list.add(arr2[j]);
               
            }
            j++;
        }
        return list;
        
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
        List<Integer>ans=union_of_sorted_arr(arr1, arr2);
        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }

    }
}