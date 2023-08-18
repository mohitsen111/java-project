import java.util.Scanner;
public class array1
{
	public static void main(String[] args)
	{
         int a[] = new int[5];
         int sum = 0;
         try (Scanner src = new Scanner(System.in)) {
            for(int i=0;i<5;i++)
             {
                 System.out.print("Enter a number:  ");
                 a[i] = src.nextInt();
             }
        }
        for(int i=0;i<5;i++)
        {
            System.out.print("Elements are : "+a[i]+"\n");
        }
         for(int i=0;i<5;i++)
         {
          sum = sum +a[i];
            
         }
         System.out.print("sum of the element of array is : "+sum);
    }
}