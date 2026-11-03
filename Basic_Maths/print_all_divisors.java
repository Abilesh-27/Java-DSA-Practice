import java.util.*;
public class print_all_divisors
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        List<Integer>l=new ArrayList<Integer>();
        int n=sc.nextInt();
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
               l.add(i);
               System.out.print(i+" ");
               if(n/i!=i)
               {
                l.add(n/i);
                System.out.print(n/i+" ");
               }
            }
        }
        System.out.println();
        Collections.sort(l);
        for(int a:l)
        {
            System.out.print(a+" ");
        }
    }
}