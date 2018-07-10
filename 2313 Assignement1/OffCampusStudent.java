package Assignment1;
import java.util.*;
public class OffCampusStudent extends UniversityStudent implements EssentialLivingCost {
    double totalcost;
    String livingplace;
    double cost_house;
    final double cost_Surrey=7200;
    final double cost_Burnaby=13200;

    public OffCampusStudent(int year, String name, double cost_food, double cost_textbook, double cost_misc, int numofcourses)
    {
        Scanner in = new Scanner(System.in);
        super.setYear(year);
        super.setName(name);
        super.setNum_courses(numofcourses);
        System.out.println("which city do you live :");
        livingplace = in.next();
        if(livingplace.equalsIgnoreCase("surrey"))
        {
            cost_house=cost_Surrey;
        }
        else if (livingplace.equalsIgnoreCase("burnaby"))
        {
            cost_house=cost_Burnaby;
        }
        totalcost = textbooks(cost_textbook) + misc(cost_misc) + costs_of_food(cost_food) + cost_house + numofcourses * getCourses_fee();
    }

    public double  costs_of_food(double cost){
        return cost;
    }
    public double textbooks (double cost){
        return cost;
    }
    public double misc(double cost){
        return cost;
    }
    public String toString() {

        String str = "Your name is " + getName() + "\n";
        str += "Your year of study is " + getYear() + "\n";
        str += "Your total cost is " + totalcost + "\n";
        return str;
    }

}
