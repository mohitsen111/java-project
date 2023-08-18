import java.util.Scanner;
public class buublesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        // System.out.print("Enter length of array : "); 
        // n = sc.nextInt();
        int[] arr = {4,3,1,7,2};
       
        // for(int i=0;i<n;i++)
        // {
        //     System.out.print("Enter element in array : ");
        //     arr[i] = sc.nextInt();
        // }
           bin(arr);
           for(int i=0;i<arr.length;i++)
           {
            System.out.println(arr[i]);
           }
       
    }
     static int[] bin(int[] arr)
    {
        int temp = 0;
    for(int i=0;i<arr.length-1;i++)
       {
        for(int j=i+1;j<arr.length;j++)
          {
               if(arr[i]>arr[j])
                 {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                 }
          }
       }
       return arr;
    }
}
