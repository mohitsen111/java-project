import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyleFactory;
public class first {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {0,0,0,0};
        int[][] arr1 = {{1,22,3,4},{1,2,3,4},{1,2,3,4}};
         for(int i=0;i<3;i++)
          {
            for(int j=0;j<4;j++)
             {
               arr[j]+= arr1[i][j];
             }
          }
         Arrays.sort(arr);
         
           System.out.println(arr[arr.length-1]);
           
    
}
}