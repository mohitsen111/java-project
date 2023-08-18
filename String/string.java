import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
 
            //   String str, str1;
            //   str = sc.next();
            //   System.out.println(str);

            //   str1 = sc.nextLine();
            //   System.out.println(str1);
    //         int[] a = {3, 10, 7, 4, 5, 23, 54, 67, 83, 9};
    //         int k;
    //         System.out.println("Enter a number to search: ");
    //         k = sc.nextInt();
    //         System.out.println(find(a, k));
         String s2 = " sen";
         String s3 = new String("mohit");
        // System.out.println(s1.substring(2,3));
       // System.out.println(s1.contains("M"));
       //System.out.println(s1.compareTo(s3));
       StringBuilder sb = new StringBuilder(s1);
       System.out.println(sb);
       System.out.println(sb.length());
       System.out.println(sb.charAt(2));
       sb.setCharAt(2,'b');
       System.out.println(sb);
       sb.append(s2);
       System.out.println(sb);
         
    //     }
    // }

    // static int find(int[] arr, int k) {
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] == k) {
    //             return i + 1;
    //         }
    //     }
    //     return -1;
    }
}
}