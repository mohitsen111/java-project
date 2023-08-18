import java.util.Scanner;
public class loop3 
{
  public static void main(String arg[])
  {
    int n,sum=0;
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the number: ");
      n= sc.nextInt();
    }
    while(n>0)
    {
        sum = sum + n%10;
        n =n/10;
    }
    System.out.println("Sum of digits of a given number= "+sum);
  }
}
