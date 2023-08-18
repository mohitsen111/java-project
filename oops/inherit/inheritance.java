import javax.sql.rowset.spi.SyncResolver;

class circle{
    public double radius;
            
    public double area()
    {
           return 2 * Math.PI * radius *radius;
    }
    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }
          
}

class cone extends circle{
       

}

public class inheritance {
    circle c = new circle();
    c.radius = 3;
    System.out.print(c.area());
    
}
