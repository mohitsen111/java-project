@FunctionalInterface
interface myLambda
{
    public void Display();
}

public class lambda {
    
    public static void main(String[] args) {
        myLambda m = ()->{
            System.out.println("Hello javaians");
        };
        m.Display();
    }
}
