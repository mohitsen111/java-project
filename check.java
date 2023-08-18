import java.util.Scanner;
public class check 
{
   public static void main(String arg[])
   {
    int a;
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter a Number: ");
         a= sc.nextInt();
    }
     if(a>0)
     System.out.print("\n Number is postive") ;
     else if(a==0)
     System.out.print("\n Number is Zero");
     else 
     System.out.print("Entered number is negative");    
    }
}