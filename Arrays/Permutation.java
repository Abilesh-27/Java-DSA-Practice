import java.util.ArrayList;
import java.util.Scanner;

public class Permutation{
    public static void rec(ArrayList<Integer>ds,ArrayList<ArrayList<Integer>>ans,boolean freq[],int arr[])
    {
        if(ds.size()==arr.length)
        {
            ans.add(new ArrayList<Integer>(ds));
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(!freq[i])
            {
                ds.add(arr[i]);
                freq[i]=true;
                rec(ds,ans,freq,arr);
                freq[i]=false;
                ds.remove(ds.size()-1);
            }
        }

    }
    public static ArrayList<ArrayList<Integer>> permutation(int []arr)
    {
       ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
       ArrayList<Integer>ds=new ArrayList<>();
       boolean freq[]=new boolean[arr.length];
       rec(ds,ans,freq,arr);
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
        ArrayList<ArrayList<Integer>>result=permutation(arr);
        for(int i=0;i<result.size();i++)
        {
            for(int j=0;j<result.get(i).size();j++)
            {
                 System.out.print(result.get(i).get(j));
            }
            System.out.println();
        }

    }
}
