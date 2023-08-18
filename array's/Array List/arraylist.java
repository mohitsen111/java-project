import java.util.ArrayList;

import javax.swing.event.InternalFrameAdapter;
public class arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(5);
        l1.add(10);
        // System.out.println(l1.get(0));
        // System.out.println(l1.get(1));
        l1.add(2,15);
        System.out.println(l1.size()); 
        l1.clear();
        l1.forEach(n->System.out.println(n));
        l1.
    
    }
    
}
