import java.util.Scanner;
public class paterson {
      public static void main(String arg[])
      {
        int n,fact=1,tem = 0;
        try (Scanner src = new Scanner(System.in)) {
          System.out.print("Enter any Number want to check paterson number: ");
          n = src.nextInt();
        }
        int b= n;
        int i =1;
        while(n!=0)
        {
        int  temp = n%10;
               while(temp>=i)
                  {
                      fact = fact*i;
                      i++;
                  }
             tem = fact+tem;   
        }
        if(b==tem)
        System.out.print("Number is an paterson"+b);

        else
        System.out.print("number is not an paterson "+b);
      }    
}
