import java.util.Scanner;
public class even
{
    public static void main(String arg[])
    {
        int a;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            a= sc.nextInt();
        }
        if(a%2==0)
        System.out.print("Number is even ");
        else 
        System.out.print("number is odd");

        }

    }

    

