import javax.lang.model.util.ElementScanner14;

public class duplicacy {
    
    public static void main(String[] args) {
        String str = "abbcdda";
        System.out.println(dup(str));
    }

    static String dup(String str)
    {
        if(str.length() == 0)
          return str;

        if(str.charAt(0) == str.charAt(1))
          return dup(str.substring(1));
        else 
        {
            String small  = dup(str.substring(1));
            return str.charAt(0) + small;
        }  
    }
}
