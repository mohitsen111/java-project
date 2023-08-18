import java.util.Scanner;
public class loop4 
{
    public static void main(String arg[])
    {
        int a,i; 
        try (Scanner sc = new Scanner(System.in)) {
          System.out.print("Enter a number: ");
          a = sc.nextInt();
        }
        System.out.print("Even number series is ");
        for(i=1;i<=a;i++)
        {
         if(i%2==0)
         System.out.print( i );
        }
      System.out.print("\n");
      System.out.print("Odd number series is ");
        for(i=1;i<=a;i++)
        {
         if(i%2==0)
         System.out.print( i );
        }

      
}
}
