import java.util.Scanner;
public class fabonacci 
{
public static void main(String arg[])
{
    try (Scanner sc = new Scanner (System.in)) {
        System.out.print("Enter number of terms: ");
        int a = sc.nextInt();
        int n1=0,n2=1,n3,i;    
        System.out.print(n1+" "+n2);    
           
        for(i=2;i<a;++i)
        {    
         n3=n1+n2;    
         System.out.print(" "+n3);    
         n1=n2;    
         n2=n3;    
        }
    }    
    }

}    
