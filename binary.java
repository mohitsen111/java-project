import javax.lang.model.util.ElementScanner14;
import java.util.Scanner;
public class binary {
    
    public static void main(String args[])
     {
    //    int[] arr = {1,2,3,4,5,6,7};
    //    int key = 0;
    //    System.out.println("Index Of Key is : "+bin(arr,key));

    int[] arr = {0,0,0,1,1,1,1,1};
    int x = 10;
    int y = 20;
    // System.out.println(firstOccurenc(arr, x));
    // System.out.println(firstOccurenc(arr, y));
    // // System.out.println("Last ");
    // // System.out.println(lastOccurence(arr, x));
    // // System.out.println(lastOccurence(arr, y));
    System.out.println("occ_"+occurance(arr,1));
}

    static int bin(int[] arr, int key)
    {
        int start = 0;
        int end = arr.length -1;
        while(start<=end)
        {
            int mid = (start + end)/2;
            if(key == arr[mid])
               return mid;
            else if(key>arr[mid])
               start = mid+1;
            else 
                end = mid-1;  
        }
        return -1;
    }
/* First occurance of repeated number ; */
    static int firstOccurenc(int[] arr,int key)
    {
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<key)
               low = mid + 1;
            else if(arr[mid]>key)
               high = mid-1;
            else{
                if(mid==0 || (arr[mid-1] != arr[mid]))
                    return mid;
                else
                   high = mid - 1;    
            }   
        }
        return -1;
    }


/* Last occurance of repeated number ; */

  static int lastOccurence(int[] arr,int key)
  {
    int low = 0, high = arr.length-1;
    while(low<=high){
        int mid = (low+high)/2;
        if(arr[mid]<key)
           low = mid + 1;
        else if(arr[mid]>key)
           high = mid -1;
        else{
            if(mid==arr.length-1 || (arr[mid] != arr[mid+1]))
                return mid;
            else
               low = mid + 1;    
        }   
    }
    return -1;
}

static int occurance(int[] arr,int key)
{
    int first = firstOccurenc(arr, key);
    if(first == -1) 
        return 0;
    else
       return (lastOccurence(arr,key)-first+1);    
} 
}