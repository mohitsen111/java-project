class Data<T>
{
   private T obj;
   void setObj(T obj)
   {
       this.obj = obj;

   }
   T getObj()
   {
      return this.obj;
   }

}

public class generics {
    public static void main(String[] args) {
        Data<String> sb = new Data<>();
        sb.setObj("Mohit");
        System.out.println(sb.getObj()); 
        Data<Integer> in = new Data<>();
        in.setObj(111);
        System.out.println(in.getObj());
    }
    
}
