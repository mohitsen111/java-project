import java.util.Scanner;
/* node class ............................................. */
class node{
    int data;
    node next;
     node(int data)
    {
        this.data = data;
          next = null;
    }
}

public class link2 {
/* Linked list creation ........................................ */
    public static node createlinkedlist(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");
        int data = sc.nextInt();
        node head = null , tail = null;
         while(data != -1)
         {
            node current = new node(data);
            if(head == null)
            {
                head = current;
                tail = current;
            }
            else
            {
                tail.next = current;
                tail = tail.next;
            }
            System.out.print("Enter : ");
            data = sc.nextInt();
         }
         return head;
    }
    /* case 1:  Insert at the begining..............................................  */
       public static node beginat(node head,int x )
       {
          node new1 = new node(x);
          node temp = head;
          new1.next = temp;
          temp = new1;
          return temp;
       }
       /* case 2:  Insert at end ..................................................*/
       public static node endAt(node head,int x)
       {
          node temp = head;
          node new1 = new node(x);
          while(temp.next != null)
            temp = temp.next;
           

            temp.next = new1;
            return head;

    }
    /* case 3: insert at given position..................................................... */
      public static node atgiven(node head,int data,int key)
      {
        node temp = head;
        int count = 1;
        node new1 = new node(data);
        while(temp != null){
            count++;
            if(count == key)
            {
                node new2 = temp.next;
                temp.next = new1;
                new1.next = new2;
            }
            temp = temp.next;
        }
        return head;
      }
      /*  case 7 :   count........................................ */
      public static int count(node head)
      {
        int count =0;
        while(head != null)
        {
            count++;
            head = head.next;
        }
        return count;
      }
    /* case 9:       searching ................................................................. */
    public static boolean Searching(node head,int key)
    {
        node temp = head;
        while(temp != null)
        {
            if(temp.data == key)
            return true;

            temp = temp.next;
        }
        return false;
    }
    /* case 8:      Print ith element of the list............................  */
    public static int ith(node head,int key)
    {
        int count1 = count(head);
        {
          if(count1>=key)
          {
            node temp = head;
            int count = 0;
            while(temp.next != null)
            {
                    count++;
                    if(count == key)
                       break;
   
                  temp = temp.next;     
            }
            return temp.data;
          }
          else
          return 0;
        }
        

    }
       /* case 4 :             Delete a node at begininig................................................. */
       public static node deltbegin(node head)
       {
         node temp = head;
         return temp.next;
       }
       /* case 5:           delete the last node ...................................................... */
        public static node delend(node head)
        {
            if(head == null)
             return head;
           if(head.next == null)
             return head;
             
             node temp = head;
                while(temp.next.next != null){
                  temp = temp.next;
               }
               temp.next = null;
               return head;
            }
            /* case 6 :    Delete at given....................................... */
            public static node delgiven(node head, int key)
            {
                node temp = head;
                int count = 0;
                while(temp != null)
                {
                    count++;
                    if((count+1) == key)
                    {
                         temp.next = temp.next.next;
                    }
                    temp = temp.next;

                }
                return head;
            }
       
       /* dafault:       liked list print ..................................................... */
     public static void print(node head)
     {
        while(head != null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Create a Linked List first");
          node head = createlinkedlist();
          node temp = head;
          System.out.print("enter your choice : ");
          int flag = sc.nextInt();
                    switch (flag) 
            {
            case 1 :   {System.out.print("Enter a number want to Add First : ");
                        int a = sc.nextInt();
                       // node new1 = 
                       beginat(temp,a);
                        print(temp);
                     break;}
            case 2 :  { System.out.print("Enter a number want to Add last : ");
                      int a = sc.nextInt();
                     node new2 = endAt(temp,a);   
                     temp = new2;
                     print(new2);
                     break; }    
            case 3 : {System.out.print("Enter data want to insert :  ");
                     int a = sc.nextInt();
                     System.out.print("Enter place where you want to inser data : ");
                     int b = sc.nextInt();
                    node new3 = atgiven(temp,a,b);
                    print(new3);
                      break;}
            case 4 : node new4 = deltbegin(temp); 
                     print(new4);
                      break;
            case 5 : node new5 = delend(temp);
                     print(new5);      
                     break;
            case 6 :   System.out.print("press key which node want to delete : ");
                       int a = sc.nextInt();
                         node new6 = delgiven(temp,a);
                         print(new6);  
                       break;
            case 7 : System.out.println("Count is : "+count(temp));
                      break;
            case 8 : {System.out.print("key which element you want to see : ");
                      int c = sc.nextInt();
                     System.out.println("element is: "+ith(temp, c));    
                     break;}
            case 9 :  System.out.print("Enter element want to search : ");
                       int b = sc.nextInt();
                      System.out.print(Searching(temp,b));  
                      break;                           
            
            default: print(temp);
            break;
          }
        }
             //   System.out.println("Count is : "+count(head));
        //   System.out.println("element is: "+ith(head, 3));
        //   node new1 = beginat(head,10);
        //   node new2 = deltbegin(new1);
        //  node new3 = endAt(head,17);
        //  System.out.println(Searching(head,3)); 
         // node new4 = delend(head);
         // node new5 = atgiven(head,10,3);
         // node new6 = delgiven(head,3);
                                      // node n1 = new node(10);
                                      // node n2 = new node(20);
                                      // node n3 = new node(30);
                                      // node n4 = new node(40);
                                      // n1.next = n2;
                                      // n2.next = n3;
                                      // n3.next = n4;
        //  print(new1);
        //  System.out.println();
        //  print(new2);
        //  System.out.println("new3:");
        //  print(new3);
        //  System.out.println("new6:");
        //  print(new6);
        }
    