import java.util.Scanner;

public class switch1 {
    /**
     * @param arg
     */
    public static void main(String arg[]) {
        int a, b, ch;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the First Number: ");
            a = sc.nextInt();
            System.out.print("Enter the second number: ");
            b = sc.nextInt();

            System.out.print("Enter the choice 1-> add\n 2->subtract \n 3->multply \n4->divide \n Put choice: ");
            ch = sc.nextInt();
        }
        switch (ch) {
            case 1:
                System.out.println("Addition =" + (a + b));
                break;
            case 2:
                System.out.println("Substraction =" + (a - b));
                break;
            case 3:
                System.out.println("Multiplication =" + (a * b));
                break;
            case 4:
                System.out.println("Division =" + (a / b));
                break;
            default:
                System.out.println("wrong choice");

        }
    }
}