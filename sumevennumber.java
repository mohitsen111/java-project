import java.util.Scanner;
public class sumevennumber {
  /**
 * @param args
 */
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        int sum=0,mul=1;
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements in array");
          for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
           for(int i=0;i<n;i++)
             {
                if(arr[i]%2==0)
                  {
                    sum += arr[i];
                  }
                 else
                 mul*= arr[i]; 
             }
            System.out.println("Sum of Even number: "+sum+"\nMultiplication of odd numbers: "+mul);
           
    }
  
  }   
}
