import java.util.Scanner;
public class speed {
    public static void main(String arg[])
    {
        float distance, time;
        try (Scanner src = new Scanner(System.in)) {
            System.out.print("Enter the Distance in KM : ");
            distance = src.nextInt();
            System.out.print("Enter Time in Hour: ");
            time = src.nextInt();
        }
        float speed = distance/time;
        System.out.print("The speed is in KMPH: "+speed); 
    }
    
}
