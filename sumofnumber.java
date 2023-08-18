import java.util.Scanner;
public class sumofnumber {
    public static void main(String arg[])
    {
         int i,a,b,sum=0,pro=1;
         try (Scanner sc = new Scanner(System.in)) {
          System.out.print("Enter the number ");
           a= sc.nextInt();
        }
         
         for(i=1;i<=a;i++)
            {
                b=i%2;
                if(b==0)
                  {
                    sum = sum+i;
                  
                  }
                else
                {
                     pro= pro*i;
                 
                }  
            
    }
 System.out.println("Sum of even numbers: "+sum);
 System.out.println("Product of odd number: "+pro);
}
} 