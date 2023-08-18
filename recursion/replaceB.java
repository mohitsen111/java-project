import javax.lang.model.util.ElementScanner14;

public class replaceB{

    public static void main(String[] args) {
        String str = "babacbcb";
        System.out.println(rep1(str,'b','X'));
    }

    static String rep1(String str,char c1,char c2)
    {
        if(str.length()==0)
          return str;
           
        char c ;
         if(str.charAt(0)== c1)
           c = c2;
        else 
           c = str.charAt(0);

         String ans =  rep1(str.substring(1), c1, c2);
          return (c+ans);
    }
}