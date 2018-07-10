package Assignment1;

import java.util.ArrayList;

public abstract class  UniversityStudent {
    public UniversityStudent(){

    }
    private String name;
    private int year;
    private int num_courses;
    private final double courses_fee=1000.30;



    public int getNum_courses() {
        return num_courses;
    }

    public void setNum_courses(int num_courses) {
        this.num_courses = num_courses;
    }

    public double getCourses_fee() {
        return courses_fee;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


