import java.util.Scanner;
class student
{
  public int roll_no;
  public String name;
  public String course = "MCA";
  public int marks_1;
  public int marks_2;
  public int marks_3;
  int flag = 0;

  public String detail()
  {
      return "Course: "+course+"\n Roll no: "+roll_no+"\n Name: "+name;
  }
  public int total ()
  {
    return marks_1 + marks_2 + marks_3;
  }
  public int average ()
  {
    return total () / 3;
  }
  public void grade ()
  {
    if(marks_1 <33 || marks_2<33 || marks_3<33 ){
    System.out.println("Failed");
    }
 
    else{
    if (average () >= 80)
      System.out.println ("Grade is : 'A' ");
   if (average () >= 60 && average () < 80)
      System.out.println ("Grade is : 'B' ");
  }
}
  

}

public class studentClass {
    public static void main (String str[])
    {
      try (Scanner sc = new Scanner (System.in)) {
        student s1 = new student ();
            System.out.print ("Roll number: ");
            s1.roll_no = sc.nextInt ();
            System.out.print ("Name: ");
            s1.name = sc.next();
          //   System.out.print ("Course: ");
          //   s1.course = sc.next ();
            System.out.print ("Marks 1: ");
            s1.marks_1 = sc.nextInt ();
            System.out.print ("Marks 2: ");
            s1.marks_2 = sc.nextInt ();
            System.out.print ("Marks 3: ");
            s1.marks_3 = sc.nextInt ();
            System.out.println();
            System.out.println("**************************");
            System.out.println();
            System.out.println(s1.detail());
            System.out.println ("Total : " + s1.total ());

            System.out.println ("Average : " + s1.average ());
              s1.grade();
           
    }
    }
}
