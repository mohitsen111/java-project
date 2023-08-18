
public class arrsum {
    public static void main(String[] args) {
        int[] arr = {1,4,7,2,9,11};
        System.out.println(arrsum(arr,0));
       //arrsum(arr);
    }

    static int arrsum(int[] a, int start_index)
    {
        if(start_index == a.length)
          return 0;
        
        return a[start_index] + arrsum (a, start_index + 1);
    }
}
