

public class fibonacci {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib1(n));
    }

    public static int fib1(int n)
      {
        if(n==0 || n==1)
          return n;
        else
          return fib1(n-1) + fib1(n-2);
      }
    
}
