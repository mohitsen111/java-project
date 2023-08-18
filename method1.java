
import java.util.Scanner;
public class method1 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter values of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Result : "+max(a,b));

        }
    }

    private static int max(int a, int b) {
        int c = a+b;
        return c;
    }
    
}