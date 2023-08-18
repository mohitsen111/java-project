// interface Test{
//     void meth1();
//     void meth2();

// }

// class My implements Test{
//     public void meth1()
//     {
//         System.out.println("This is in meth1 :)");
//     }
//     public void meth2(){
//         System.out.println("This is in meth2 :)");
//     }
//     public void meth3(){
//         System.out.println("This is in Meth3 :)");
//     }
// }

// public class interfaces {
//     public static void main(String[] args) {
//         Test t = new My();
//         t.meth1();
//         t.meth2();
//         /* Here meth 3 cant be called bcz it's not in Interface Test. */
//        // t.meth3();

//     }
    
// }

class Phone{
    public void call(){
        System.out.println("calling");
    }
    public void msg(){
        System.out.println("Message");
    }
}

interface Icamera{
     void click();
     void record();
}

interface IMusic{
   void play();
   void pause();
}

class SmartPhone extends Phone implements Icamera , IMusic{

    public  void click(){
        System.out.println("click");
    }
    public void record(){
        System.out.println("record");
    }
    public  void play(){
        System.out.println("play");
    }
    public  void pause(){
        System.out.println("pause");
    }
}

public class interfaces{

    public static void main(String[] args) {
        SmartPhone s1  = new SmartPhone();
        s1.call();
        s1.msg();
        s1.click();
        s1.record();
        s1.play();
        s1.pause();

    }

}