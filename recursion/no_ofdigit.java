
public class no_ofdigit {
     
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(dig1(n));
    }
    
    static int dig1(int a)
    {
        if(a==0)
          return 0;
        int b = dig1(a/10);
          return b+1;
            
    }
}
