class Test{
    public int max(int a,int b)
    {
        return a>b?a:b;
    }
    public int max(int a,int b,int c)
    {
        if(a>b && a>c)
          return a;
        else if(b>c)
           return b;
        else 
          return c;    
    }
}

public class M_overload {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.max(5, 5));
        System.out.println( t.max(1, 01, 01));
       

    }
    
}
