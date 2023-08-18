// public class exceptions {
//     public static void main(String[] args) {
//         int a[] = {10,0};
//         try{
//         // int r = a[0]/a[1];
//         // System.out.println(r);
//         System.err.println(a[11]);
//         }
//         catch(ArithmeticException  e)
//         {
//             System.out.println(e);
//         }
//         catch(ArrayIndexOutOfBoundsException e)
//         {
//             System.out.println(e);
//         }
//     }
// }

public class exceptions {
public static int meth1() throws Exception
{
  System.out.println(area(10,5)); 
}

public static int area(int a,int b) throws Exception
{
    if(a<0 || b<0)
      throw new Exceptions();
    return a*b;
}
    public static void main(String[] args) throws Exception  {
       meth1(); 
    }
}

