import java.util.Scanner;
public class string1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str ;
        System.out.println("Enter a string: ");
        str = sc.nextLine();
        System.out.println("Your string is : "+str);
        System.out.println(capital(str));
        System.out.println(lower(str));
        System.out.println(length(str));
       
        System.out.println("enter index of : ");
        String k = sc.next();
        System.out.println(index(str,k));
    }
    
    static String capital(String str)
     {
        return str.toUpperCase();
      }

        
    static String lower(String str)
    {
       return str.toLowerCase();
     }

     static int length(String str)
    {
       return str.length();
     }

     static String index(String str , String a)
     {
        return str.indexOf(a);
     }

}
