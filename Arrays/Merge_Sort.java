package medium;
import java.util.Scanner;
public class Merge_Sort {
    public static void merge_sort(int[]arr,int s,int e)
    {
    if(s<e)
    {
        int mid=(s+e)/2;
        merge_sort(arr, s, mid);
        merge_sort(arr, mid+1, e);
        merge(arr,s,mid,e);
    }
    }
    public static void merge(int []arr,int s,int mid,int e)
    {
        int n1=mid-s+1;
        int n2=e-mid;
        int a1[]=new int[n1];
        int a2[]=new int[n2];
        for(int x = 0;x < n1;x++)
        {
            a1[x]=arr[s+x];
        }
        
        for(int x=0;x<n2;x++)
        {
            a2[x]=arr[mid+1+x];
        
        }
        int k=s;
        int i=0;
        int j=0;
        while(i<n1 && j<n2)
        {
            if(a1[i] > a2[j])
            {
                arr[k]=a2[j];
                k++;
                j++;
            }
            else
            {
                arr[k]=a1[i];
                k++;
                i++;
            }
        }
        while(j<n2)
        {
                arr[k]=a2[j];
                k++;
                j++;
            
        }
        while(i<n1)
        {
            arr[k]=a1[i];
            k++;
            i++;
        }
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int l=a.length;
        merge_sort(a, 0, l-1);
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}
