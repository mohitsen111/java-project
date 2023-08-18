import java.util.Scanner;
public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.println(fact1(n));
    }

    static int fact1(int a)
    {
        if(a==0)
          return 1;
        else
          return (a*fact1(a-1));  
    }
    
}
