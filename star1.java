import java.util.Scanner;
public class star1 {
    public static void main(String arg[])
      {
         int i,j,n;
         Scanner sc= new Scanner(System.in);
         System.out.print("Enter a number: ");
         n = sc.nextInt();
         for(i=1;i<=n;i++)
            {
                for(j=1;j<=i;j++)
                {
                    System.out.print('*');
                }
              System.out.print("\n");  
            }

      }
}
