import java.util.Scanner;
public class factorial 
{
   public static void main(String arg[])
   {
    int a,fact=1;
    try (Scanner src = new Scanner(System.in)) {
        System.out.print("Enter the number: ");
        a= src.nextInt();
    }
    int i=1;
    while(i<=a)
        {
            fact = i*fact;
            i++;
        }
    System.out.print("Factorial of number: "+fact);    
   } 
}
