package Assignment1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
      System.out.println("Please enter your name: ");
      String name= in.nextLine();
      System.out.println("Please enter your year of study: ");
      int year= in.nextInt();
      System.out.println("Please enter your cost of food ");
      double cost_food=in.nextDouble();
      System.out.println("Please enter your cost of textbook ");
      double cost_textbook=in.nextDouble();
      System.out.println("Please enter your cost of misc");
      double cost_misc=in.nextDouble();
      System.out.println("Please enter your number of courses");
      int numofcourses=in.nextInt();
      System.out.println("Are you OffCampusStudent or OnCampusStudent, if you are OffCampusStudent please enter off if you are OnCampusStudent please enter on");
      String Student_status =in.next();

      if(Student_status.equalsIgnoreCase("on")) {
          OnCampusStudent OnStudent = new OnCampusStudent(year,name,cost_food,cost_textbook,cost_misc,numofcourses);

         System.out.println( OnStudent.toString());

      }
      else if(Student_status.equalsIgnoreCase("off"))
      {

          OffCampusStudent  OffStudent=  new OffCampusStudent(year,name,cost_food,cost_textbook,cost_misc,numofcourses);
          System.out.println( OffStudent.toString());
      }



}

}
