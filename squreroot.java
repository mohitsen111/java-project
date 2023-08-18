import javax.lang.model.util.ElementScanner14;

public class squreroot {

    static int squreroot(int x)
    {
        int low = 1;
        int high = x;
        int ans = -1;
        while(low<=high)
        {
           int mid = (low+high)/2;
           int mysqrt = mid*mid;
           if(mysqrt == x)
              return mid;
           else if(mysqrt>x)
             high = mid -1;
           else 
              low = mid+1;     
              ans = mid;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(squreroot(1000000));
    }
}
