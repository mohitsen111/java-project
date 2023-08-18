import java.util.Scanner;

public class armstrong {
    public static void main(String arg[])
    {
        int a,temp=0;
        try (Scanner src = new Scanner(System.in)) {
          System.out.print("Enter the number: ");
          a= src.nextInt();
        } 
         int b = a;
      while(a!=0)
          {      
            int rem = a%10;
                 temp = temp + ( rem * rem * rem );
                 a = a/10;
          }
        if(temp == b)
        System.out.println("number is armstrong");
        
        else
        System.out.println("Number is not an armstrong");
    }
    
}
