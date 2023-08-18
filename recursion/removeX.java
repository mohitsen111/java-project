import java.util.Scanner;

public class removeX {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String including \"x : ");
        String str = sc.next();
        System.out.print(remx(str));
    }

    
    static String remx(String str)
    {
        if( str.length() == 0)
           return str;
        
        String str1 = "";
          if(str.charAt(0) != 'x')
             str1+= str.charAt(0);
        
        String small = remx(str.substring(1));
        return str1 + small;
             
    }
}
