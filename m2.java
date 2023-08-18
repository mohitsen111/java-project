public class m2 {
  
    public static  void main(String[] args){
        int m1[] = {1,2,3,4,5};
        int num = 7;
        int index = 2;
        update(m1,num,index);
        for(int x:m1)
        {
            System.out.println(x);
        }
      
    
}
     static void update(int[] m1,int a,int index) {
        for(int i=0;i<m1.length;i++)
        {
            m1[i] +=10;
        }
        }
}