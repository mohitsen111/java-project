import java.util.Scanner;
public class allsubstring {

       
        public static void main(String strg[]) {
            Scanner sc = new Scanner(System.in);
            String str ;
            System.out.print("Enter any string : ");
            str = sc.next();
            subwaystr(str);
        }

       static void subwaystr(String str){
          for(int i=0;i<str.length();i++)
             {
                 for(int j=i;j<str.length();j++)
                    {
                        System.out.print(str.substring(i,j+1)+"\t"); 
                    }
             }
            
        }
    }
