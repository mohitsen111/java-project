
import java.util.Scanner;
 class cylinder
 {
     public double height;
     public double radius;
     
     public double surfacearea()
     {
            return 2*Math.PI * radius * height + 2*Math.PI*radius*radius; 
     }
     public double basearea()
     {
         return Math.PI*radius*radius; 
     }
     public double lateral_surface()
     {
         return 2*Math.PI * radius * height;
     }
     public double volume()
     {
         return Math.PI*radius*radius*height;
     }
     public double daimeter()
     {
         return 2*Math.sqrt(volume()/(Math.PI*height));
     }
 }
public class cylinderclass {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            cylinder c1 = new cylinder();
              System.out.print("Enter length: ");
                c1.height = sc.nextDouble();
              System.out.print("Enter radius: ");
                c1.radius = sc.nextDouble();
                  System.out.println("Surface area : "+c1.surfacearea());
                  System.out.println("Base area : "+c1.basearea());
                  System.out.println("lateral surface area : "+c1.lateral_surface());
                  System.out.println("volume : "+c1.volume());
                    System.out.println("daimeter : "+c1.daimeter());
        }
              
   }
    
}
