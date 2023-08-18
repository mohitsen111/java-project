import java.util.Scanner;
class Node{

     int data;
     Node next;

    public Node(int data)
    {
        this.data = data;
        next = null;
    }

  
}
public class link3 {

    public static Node createLinkedList()
    {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node head = null;
        while(data !=-1)
        {
          Node current = new Node(data);
          if(head == null)
        {
            head = current;
        }
        else
        {
            current.next = head;
        }
          System.out.println(current);
          System.out.println(current.next);
    }
        return head;
    }

    public static void main(String[] args) {
       // Node n1 = new Node(10);
        Node head = createLinkedList();
       
    }
}
