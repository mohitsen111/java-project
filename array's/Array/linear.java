import java.util.Scanner;
public class linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter length of array : "); 
        n = sc.nextInt();
        int[] arr = new int[n];
        int key ;
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element in array : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter an key want to search : ");
        key = sc.nextInt();
        int flag = bin(arr,key);
        if(flag == -1)
          System.out.println("Not Found");
          else
        System.out.print("Position of "+key+" is : "+flag); 
    }
        
    static int bin(int[] arr, int key){
        for(int i=0;i<arr.length;i++)
           {
            if(arr[i]==key)
               return i+1;
           }
           return -1;
    }
}