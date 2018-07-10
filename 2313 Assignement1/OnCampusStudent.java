package Assignment1;

public class  OnCampusStudent extends UniversityStudent implements EssentialLivingCost {
    final  double cost_house =12000;
    public double totalcost;

    public OnCampusStudent(int year, String name, double cost_food, double cost_textbook, double cost_misc, int numofcourses) {
        super.setYear(year);
        super.setName(name);
        super.setNum_courses(numofcourses);
        totalcost = textbooks(cost_textbook) + misc(cost_misc) + costs_of_food(cost_food) + cost_house + numofcourses * getCourses_fee();


    }

    public double costs_of_food(double cost) {

        return cost;
    }

    public double textbooks(double cost) {
        return cost;
    }

    public double misc(double cost) {
        return cost;
    }

    public String toString() {

        String str = "Your name is " + getName() + "\n";
        str += "Your year of study is " + getYear() + "\n";
        str += "Your total cost is " + totalcost + "\n";
        return str;
    }
}
