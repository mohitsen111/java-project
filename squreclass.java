
import java.util.Scanner;
class rectangle
{
    public double length;
    public double breadth;
    
    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return (2*(length+breadth));
    }
}
class squre
{
    public double length;
    public double breadth;
    
    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return (2*(length+breadth));
    }
}
public class squreclass
{
	public static void main(String[] args) {
	    try (Scanner sc = new Scanner(System.in)) {
            rectangle r1 = new rectangle();
               squre s1 = new squre();
               System.out.print("Enter length: ");
                r1.length = sc.nextDouble();
               System.out.print("Enter breadth: ");
                r1.breadth = sc.nextDouble();
                if(r1.length==r1.breadth)
                {
                    s1.length = r1.length;
                    s1.breadth = r1.breadth;
                    System.out.println("Area of squre: "+s1.area());
                    System.out.println("Perimeter of squre: "+s1.perimeter());
                }
                else{
                System.out.println("Area of the rectangle: "+r1.area());
                System.out.println("Perimeter of the rectangle: "+r1.perimeter());
            }
        }
}
}