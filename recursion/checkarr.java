import java.util.Scanner;

public class checkarr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,4,1,2,1,11};
              for(int i=0;i<arr.length;i++)
                    System.out.print((i +1)+ " : "+arr[i]+"\n");
        System.out.print("Enter key : ");
        int k = sc.nextInt();
        System.out.println(checkarr(arr,0,k));
    }

    public static int checkarr(int[] arr, int start_index,int key)
    {
        
        if(arr[start_index] == key)
        {
          return start_index +1 ;
        }
        else if(arr[start_index] != key)
           return -1;  
        else 
          return checkarr(arr,start_index+1,key);
            
    }
    
}
