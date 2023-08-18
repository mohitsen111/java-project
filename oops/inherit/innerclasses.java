// class Outer{
//     int x = 10;
//     class Inner{
//       int y = 20;
//       public void innerDisplay(){
//         System.out.println(x+" "+y);
//       }
//     }
//     public void outerDisplay(){
//         Inner i = new Inner();
//         i.innerDisplay();
//     }
// }

public class innerclasses {
    public static void main(String[] args) {
        Outer O = new Outer();
        O.outerDisplay();
    }
}



   class Outer {
    public void Display(){
        class Inner{
            public void innerDispaly(){
                System.out.println("Inner wali Classs :)");
            }
        }
    }
   Outer i = new Outer();
    i.innerDisplay();
   }
 