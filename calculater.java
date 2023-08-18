import java.util.Scanner;
public class calculater 
{
public static void main(String arg[])
{
    int a,b,ch;
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the first number: ");
       a= sc.nextInt();
       System.out.print("Enter th e second number: ");
       b= sc.nextInt();
      System.out.print("enter your choice \n1->add \n2->substract \n3->muply \n4->divide\nType here: ");
      ch= sc.nextInt();
    }
     if(ch==1)
   
     System.out.print("\n Addition="+(a+b));
    else if(ch==2)
        { int d=a-b;
          System.out.print("\n Substraction="+d);
        }  
    else if(ch==3)
    System.out.print("\n Multiplication="+(a*b));
    else if(ch==4)
    System.out.print("\n Division="+(a/b));
    
    else
    System.out.print("\n WRONG CHOICE");
}
    
}
