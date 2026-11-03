import java.util.Scanner;

class Linked_List_1
{
   Node Head;
   Node Tail;
   public void add(int data)
   {
     Node newnode=new Node(data);
     if(Head==null)
     {
        Head=newnode;
        Tail=newnode;
     }
     else{
        Tail.next=newnode;
        Tail=newnode;
     }
   }
   public void insert_at_first(int data)
   {
     Node newnode=new Node(data);
     Node temp=Head;
     Head=newnode;
     Head.next=temp;
   }
   public void insert_at_end(int data)
   {
     Node newnode=new Node(data);
     Tail.next=newnode;
     Tail=newnode;
   }
   public void insert_at_mid(int data,int pos)
   {
     Node newnode=new Node(data);
     if(pos==0)
     {
        insert_at_first(data);
     }
     else{
        Node temp=Head;
        int i=0;
        while(i<pos-1)
        {
            temp=temp.next;
            i++;
        }
        Node temp1=temp.next;
        temp.next=newnode;
        newnode.next=temp1;
     }

   }
   public void show()
   {
     Node temp=Head;
     while(temp!=null)
     {
        System.out.print(temp.data+" ");
        temp=temp.next;
     }
   }
}
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}
public class Linked_List
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        Linked_List_1 ll=new Linked_List_1();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            ll.add(sc.nextInt());
        }
        ll.insert_at_end(10);
        ll.show();
        System.out.println();
        ll.insert_at_first(11);
        ll.show();
        System.out.println();
        ll.insert_at_mid(7,6-1);
        ll.show();

    }
}