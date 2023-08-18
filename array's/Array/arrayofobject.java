
// here we can made a array of objects
class student{
    private int id;
    String name;
    int marks;
    final String course = "MCA";

    public student(/*int id,*/String name, int marks)
    {
      //this.id = id;
      this.name = name;
      this.marks = marks; 
      }
     
      
      public void setId(int id){
        this.id = id;
      }

      public int getId()
      {
        return this.id;
      }


     void display()
      {
          System.out.println(getId()+" : "+this.name+" : "+this.marks+" : "+course);
      }
}
public class arrayofobject
{
  public static void main(String[] args) {
      student s1 = new student("Bindu",8);
      // student s2 = new student(102,"Prakash",8);
      // student s3 = new student(103,"k berhazi",8);
      s1.setId(101);
      s1.display();
      // s2.display();
      // s3.display();
      
      // s1.id = 101;
      // s1.name = "Bindu";
      // s1.marks = 8;
      
      // s2.id = 102;
      // s2.name = "Prakash";
      // s2.marks = 8;
      
      // s3.id = 103;
      // s3.name = "k berhazi";
      // s3.marks = 7;
      
      // student std[] = new student[3];
      
      // std[0] = s1;
      // std[1] = s2;
    // std[2] = s3;
    //   for(int i=0;i<3;i++)
    //   {
    //     System.out.println(this.id+" : "+this.name+" : "+this.marks);
    // }
      
    
  }
}
