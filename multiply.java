import java.util.Scanner;
public class multiply {
    public static void main(String arg[])
    {
        int a,b=1;
        try (Scanner src = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            a = src.nextInt();
        }
        while(a>0)
        {
            b = b*(a%10);
            a=a/10;
        }
        System.out.println("Product of given number: "+b);
    }
}
