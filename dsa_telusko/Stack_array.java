import java.util.*;
class Stack1{
  int size;
  int top=0;
  int arr[];
  Stack1(int size)
  {
     this.size=size;
     arr=new int[size];
  }
  public void push(int data)
  {
      if(!isfull())
      {
          arr[top]=data;
          top++;
      }
      else{
        System.out.println("Stack Overflow");
      }
  }
  public void pop()
  {
     if(!isempty())
     {
        top--;
     }
     else{
       System.out.println("Stack Underflow");
     }
  }
  public void peek()
  {
     if(!isempty())
     {
       System.out.println(arr[top-1]);
     }
     else{
       System.out.println("Stack Underflow");
     }
  }
  public boolean isfull()
  {
    return top>=size;
  }
  public boolean isempty()
  {
    return top==0;
  }
  public void show()
  {
     if(!isempty())
     {
       for(int i=top-1;i>=0;i--)
       {
         System.out.print(arr[i]+" ");
       }
        System.out.println();
     }
  }
}
public class Stack_array
{
  public static void main(String[]args)
  {
     Scanner sc=new Scanner(System.in);
     int size=sc.nextInt();
     Stack1 obj=new Stack1(size);
     for(int i=0;i<size;i++)
     {
       obj.push(sc.nextInt());
     }
     obj.show();
     obj.pop();
     obj.show();
     obj.push(19);
     obj.show();
     obj.push(39);
     obj.show();
     obj.peek();
     obj.pop();
     obj.show();
     obj.pop();
     obj.show();
     obj.pop();
     obj.show();
     obj.pop();
     obj.show();
     obj.pop();
     obj.show();
     obj.pop();
     obj.show();
     obj.push(1);
     obj.show();
  }
}