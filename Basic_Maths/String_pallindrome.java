// import java.util.*;
// public class String_pallindrome
// {
//     public static boolean pallindrome(String s,int n,int i)
//     {
//        if(i>=n/2)
//         return true;
//        if(s.charAt(i)!=s.charAt(n-1-i))
//          return false;
//       return pallindrome(s,n,i+1);
         
//     }
//     public static void main(String[]args)
//     {
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
       
//         int n=s.length();
//         if(pallindrome(s, n,0))
//         {
//             System.out.println("Pallindrome");
//         }
//         else
//             System.out.println("Not Pallindrome");
//     }
// }
import java.util.*;
public class String_pallindrome
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        StringBuilder sb=new StringBuilder(s); 
        sb.reverse();
        if(s.equals(sb.toString()))
        {
            System.out.println("Pallindrome");
        }
        else
        {
            System.out.println("Not Pallindrome");
        
        }
    }
}