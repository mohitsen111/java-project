import java.util.Scanner;
public class loop2 
{
    public static void main(String arg[])
    {
        int n;
       try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter the value: ");
        n= sc.nextInt();
    }
        int i=1;
            while(i<=n)
        {
            System.out.println(i);
            i++;
        }  
       /*  while (n>=1)
        {   
            System.out.println(n);
            n--;
        }  */

        int  j=1,sum=0;
        while(j<=n)
        {
            sum=sum+j;
            j++;    
        }
        System.out.println("Addition: "+sum);
    }
}
