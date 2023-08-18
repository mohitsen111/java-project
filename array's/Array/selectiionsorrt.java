import java.util.Scanner;
public class selectiionsorrt {
    public static void main(String[] args) {
        int[] arr = {4,3,1,7,2};
        fang(arr);
        for(int i=0;i<arr.length;i++)
           System.out.println(arr[i]);
    }

     static int[] fang(int[] arr)
      {
        int min = 0;
        for(int i=0;i<arr.length-1;i++)
          {  
            min_index = i;
             min = arr[i];
              for(int j=i+1;j<arr.length;j++)
                {
                    if(min>arr[j])
                      {
                        min_index = j;
                        min = arr[j];
                      }
                }
                if(min_index != i )
                {
                    arr[min_index] = arr[i];
                    arr[i] = min; 
                }
        }
          return arr;
      }
}
