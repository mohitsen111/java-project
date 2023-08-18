import java.util.Scanner;
public class evenodd
{
    public static void main(String arg[])
    {
        int a,b,flag=0,sum=0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the value: ");
            a = sc.nextInt();
        }
        for(b=1;b<=a;b++)
        {
            if(b%2==0)
            {
             flag = b;
             System.out.print("\t" +flag );
             sum = sum + flag;
            
            }
        }
        System.out.print("\n");
        System.out.println("sum of even digit is: "+sum);
    }

} 