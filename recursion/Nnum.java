import java.util.Scanner;
public class Nnum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.print("Result is : "+num1(n));
    }
    
    static int num1(int a)
    {
        if(a==1)
        {
            System.out.println(a);
          return;
        }
        else
          return num1(a-1);
    }
}
