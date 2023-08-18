import java.lang.module.ResolutionException;
import java.util.spi.CurrencyNameProvider;

import javax.swing.plaf.synth.SynthStyle;

class all_array
{
   static boolean sorted(int[] arr)
    {
        int res = 0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[res]<arr[i])
               res = i;
        }
        if((res+1)==arr.length)
         return true;
         else
         return false;
    }

    static void reverse(int[] arr)
    {
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }

    }

    static int duplicacy(int[] arr)
    {
        int res = 1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[res-1]!=arr[i])
             {
                arr[res] = arr[i];
                res++;
             }
        }
        return res;
    }
    static int swap(int x,int y)
    {
        x = x + y;
        y = x - y;
        x = x - y;
        return y;
    }

    static int[] lastZero(int[] arr)
    {
        int res = 0;
        for(int i=0;i<arr.length;i++)
        {
          if(arr[i]!=0)
          { 
            int temp = arr[res];
            arr[res] = arr[i];
            arr[i] = temp;
            res++;
          }
        }
        return arr;
    }

    static int[] drotate(int[] arr, int d)
    {
        int[] arr1 = new int[arr.length];
        int res = 0;
        {
            for(int i=d;i<arr1.length;i++,res++)
               arr1[res] = arr[i];
            for(int i=0;i<d;i++,res++)  
                 arr1[res] = arr[i];
         return arr1;    
        }
    }

    static void leader(int[] arr)
    {
        int len = arr.length;
        int current = arr[len-1];
        System.out.println(current);
        for(int i=len-2;i>=0;i--)
          {
            if(arr[current]<arr[i])
              {
                arr[current] = arr[i];
                System.out.println(arr[i]);
              }
          } 
}
    public static void main(String[] args) {
        int[] arr = {7,10,4,10,6,5,2};
     //   System.out.println(sorted(arr));
      //  reverse(arr);
    //   int x = duplicacy(arr);
    //       System.out.println(x); 
    //   for(int x : drotate(arr,2))
    //     System.out.println(x);
             leader(arr);

    }
}