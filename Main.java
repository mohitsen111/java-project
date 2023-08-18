import java.util.Scanner;
public class Main
{
public static void main(String args[])
{
int a,b,c;
try (Scanner sc = new Scanner(System.in)) {
    System.out.println("Enter value of A: ");
    a=sc.nextInt();
    System.out.println("Enter value of B: ");
    b= sc.nextInt();
}
c=a+b;
System.out.println("Addition="+c);
}
}
