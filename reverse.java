import java.util.Scanner;

public class reverse {
    public static void main(String arg[])
    {
        int n,temp=0;
        try (Scanner src = new Scanner(System.in)) {
            System.out.print("Enter any number want to reverse : ");
            n = src.nextInt();
        }
        while(n!=0)
        {   
            temp  = temp * 10 + n%10;
            n /=10;
        }
      System.out.print("Reverse is : " +temp);  
    }
}
