import java.util.Scanner;
class maxintwono
{
    public static void main(String arg[])
    {
        int a,b;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter First Number: ");
            a= sc.nextInt();
            System.out.print("Enter the second number: ");
            b= sc.nextInt();
        }
        if(a>b)
        {
            System.out.print("first is greater");
        }
        else 
        System.out.print("second is greater");
    }
}



