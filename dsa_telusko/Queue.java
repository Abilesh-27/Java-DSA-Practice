import java.util.*;
class qiueue
{
    int front=0;
    int rear=-1;
    int size=0;
    int n;
    int arr[];
    qiueue(int n)
    {
        this.n=n;
        arr=new int[n];
    }
    public void enqueue(int data)
    {
        if(!isfull())
        {
           rear=(rear+1)%n;
           arr[rear]=data;
           size++;
        }
        else
            System.out.println("Overflow");
    }
    public void dequeue()
    {
       if(!isempty())
       {
         front++;
         size--;
       }
       else{
         System.out.println("Underflow");
       }
    }
    public boolean isfull()
    {
      return size==n;
    }
    public boolean isempty()
    {
      return size==0;
    }
    public int peek()
    {
      return arr[front];
    }
    public void show()
    {
      for(int i=front;i<n;i++)
      {
        System.out.print(arr[i]+" ");
      }
      System.out.println();
    }
}
public class Queue 
{
    public static void main(String []args)
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       qiueue obj=new qiueue(n);
       obj.enqueue(5);
       obj.enqueue(2);
       obj.enqueue(7);
       obj.enqueue(1);
       obj.enqueue(3);
       obj.show();
       obj.enqueue(9);
       obj.dequeue();
       obj.show();
       obj.dequeue();
       obj.show();
       obj.enqueue(9);
       obj.show();
       obj.dequeue();
       obj.dequeue();
       System.out.println(obj.peek());
       obj.dequeue();
       obj.dequeue();
       obj.dequeue();
    }
}