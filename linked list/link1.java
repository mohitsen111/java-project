import java.util.Scanner;
/* Class for Node */
 class Node<T> {

    T data;
    Node<T> next;

    Node(T data){
            this.data = data;
            next = null;
    }
}


public class link1 {
     
    // /* Create LinkedList */
     public static Node<Integer> createlinkedlist(){
    // Node<Integer> n1 = new Node<Integer>(10);
    // Node<Integer> n2 = new Node<Integer>(20);
    // Node<Integer> n3 = new Node<Integer>(30);
    // Node<Integer> n4 = new Node<Integer>(40);
    // n1.next = n2;
    // n2.next = n3; 
    // n3.next = n4;
    // return n1;

    //  Creta linked list with taking input from user ;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter : ");
    int data = s.nextInt();
    // Node<Integer> head = null;
    //    while(data != -1){
    //   Node<Integer> currentNode = new Node<Integer>(data);
    //          if(head == null){
    //         head = currentNode; 
    //                      } 
    //     else{
    //          Node<Integer> tail = head;
    //          while(tail.next != null){
    //               tail = tail.next;
    //          }
    //          tail.next = currentNode;
    //         }
    //     System.out.print("Enter : ");    
    //     data = s.nextInt();
    // optimised way to impliment Linked list
       Node<Integer> Head = null, Tail = null;
         
             while(data!=-1)
       {
        Node<Integer> currentNode = new Node<Integer>(data);
         if(Head == null)
         {
                  Head = currentNode;
                  Tail = currentNode;
                   
         }
         else{
            Tail.next = currentNode;
            Tail = Tail.next;
            
         }
         System.out.print("Enter : ");
         data = s.nextInt();
       }
       return Head;  
    }
          

   /*  Print LinkedList */
    public static void print(Node<Integer> head){
        while(head != null){
          System.out.print(head.data+" ");
           head = head.next;
        }
    }
    /* Count Node of LinedlList */
    public static int count(Node<Integer> head)
    {
        int count = 0;
        while(head != null){
            head = head.next;
             count++;
    }
     return (count); 
    }

    /* Print ith element of Linkedist */
    // public static int ith(Node<Integer> head)
    // {
    //     // if(count(head) < a)
    //     //   return -1;
    //     //   else{
    //     while(head != null)
    //     {
    //         head = head.next;
    //         if(count(head) == 1){
    //             System.out.println("ith  ke andr: "+count(head));
    //          break;
    //     }
    // }
    //     return head.data;
    //  }

    /* Delete a node  */
       public static Node<Integer> delNode(Node<Integer> head)
       {
         Node<Integer> temp = head;
         return temp.next;
      }

    /* Main Method */
     public static void main(String[] args) {
       Node<Integer> head = createlinkedlist();
    //    System.out.println(head);
    //    System.out.println(head.next);
     //  Scanner sc = new Scanner(System.in); 
    //   System.out.println("your Linkes list is : ");  
    //   print(head);
      //System.out.println();
      //  System.out.print("Number of elemets in your list is: ");
      // System.out.println(count(head));
      // System.out.print("enter index : ");
      // int  a = sc.nextInt();
      //System.out.println(ith(head));
    //   System.out.println("deletion");
         Node<Integer> head1 = delNode(head);
         print(head1);
     
    }
}