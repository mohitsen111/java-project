import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.swing.undo.StateEdit;
import javax.tools.ToolProvider;

// class stackEmptyException extends Exception
// {
//     public String userdefine(String str)
//     {
//           return str;
//     }
//     // private static final long serialVersionUID = 1l;
// }

class stackFullException extends Exception
{
    public static String stackFullException(String str){
        return(str);
    }
   // private static final long serialVersionUID = 1l;
}
class stack
{
    private int data[];
    private int topIndex;

    public stack()
    {
        data = new int[10];
        topIndex = -1;
    }

    public void push(int elem)
    {
       if(topIndex == data.length)
    //    System.out.println("Stack is full ");
         throw new stackFullException("Stack is full ");

         data[++topIndex] = elem;
         System.out.println("element added succesfully : "+elem);
    }

    public int pop()
    {
        topIndex--;
        System.out.println("element poped succesfully");
        return data[topIndex--];
    }

    public int top()
    {
        if(topIndex == -1)
        System.out.println("Stack is Empty");
         //throw new stackEmptyException("Stack is Empty");
        return data[topIndex];
    }

    public int sizeOf()
    {
        return topIndex +1;
    }

    public boolean isEmpty()
    {
        if(topIndex == -1)
           return true;
         else
           return false;  
    }
}

public class impli {
    
    public static void main(String[] args) throws stackFullException  {
       stack st = new stack();
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter : ");
       int key = sc.nextInt();
       while(key != -1)
       {
         st.push(key);
         key = sc.nextInt();
       }
        
       System.out.println(st.sizeOf());
       System.out.println(st.top());
       System.out.println(st.isEmpty());
       st.pop();
       System.out.println(st.top());

    }
}
