
import java.util.Scanner;
public class pow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.print("Enter power : ");
        int a = sc.nextInt();
        System.out.print("Your result : "+pow1(n,a));
        System.out.println("\n");
        System.out.println("Your cube is : "+cube1(n,3));
        System.out.println("\n");
        System.out.println("Your squre is : "+squr1(n,2));
    }
    
    static int pow1(int a, int b)
    {
        if(b==0)
        return 1;
        else
           {
            return a*pow1(a, b-1);
           }
    }

    static int cube1(int a , int b )
    {
      
        if(b==0)
        return 1;
        else
          return a*cube1(a,b-1);
    }

    static int squr1(int a, int b)
    {
        if (b==0)
          return 1;
          else
            return a*squr1(a, b-1);
    }
}
