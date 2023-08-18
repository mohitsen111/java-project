import java.util.Scanner;

class power{

    static void pow(Double a, Double b)
    {
         double i , res = 1;
         for(i=1;i<=b;i++)
         {
            res = res * a;
         }
         System.out.printf("your result is: "+res);
    }
 public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        double a,b;
        System.out.print("Enter any number: ");
        a = sc.nextInt();
        System.out.print("Enter power: ");
        b = sc.nextInt();
        pow(a,b);
    }
    
 
    }
}