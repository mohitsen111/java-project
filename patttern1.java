import java.util.Scanner;
public class patttern1 {
    


    public static void main(String arg[]) {
       Scanner src = new Scanner(System.in);
       int i,j;
       System.out.print("Enter Value of n : ");
       int n = src.nextInt();

       for(i=1;i<=n;i++)
          {
           for(j=1;j<=i;j++)
              {
                 System.out.print("*\t");
                 
              }
           
              System.out.println("\n");
          }
   }
}
