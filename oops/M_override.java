import java.util.function.Supplier;

class supper{
        protected void display()
        {
            System.out.println("I am in suppper :)  ");
        }
    }

   class sub extends supper
   {
       public void display()
      {
        System.out.println("I am in subWay Baby :* ");
      }
   } 


public class M_override {

    public static void main(String[] args) {
       supper s = new supper();
       sub s1 = new sub();
        s.display();
        s1.display();
    }
}
