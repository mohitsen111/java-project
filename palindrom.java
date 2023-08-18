import java.util.Scanner;
public class palindrom 
{
public static void main(String arg[])
{
    int a,def=0,n;
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the number is here: ");
      a= sc.nextInt();
    }
    n=a; 
    while(a>0)
     {
        def = 10*def + a%10; 
        a=a/10;
     }
     if(n==def)
     System.out.print("number is palindrom ");
     else
     System.out.println("Number is not palindrom ");
}
}