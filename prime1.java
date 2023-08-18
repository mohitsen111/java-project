import java.util.Scanner;
public class prime1 
{
  public static void main(String arg[])
  {
    int a,flag=0,i;
    try (Scanner src = new Scanner(System.in)) {
      System.out.print("Enter a number: ");
      a= src.nextInt();
    }
    i=1;
    while(i<=a)
    {
      if(a%i==0)
        {
            flag++;
       }
       i++;
    }
    if(flag==2)
      {
        System.out.println("Number is Prime: "+a);
      }
    else
    {
      System.out.println("Number is not prime"+a);  
    }  
  }    
}
