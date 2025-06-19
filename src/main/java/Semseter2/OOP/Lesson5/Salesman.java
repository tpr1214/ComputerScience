package Semseter2.OOP.Lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Salesman {
    private String firstName;
    private String lastName;
    private int basicSalary;
    private Map<Integer, List<Product>> salesByDates;// לשנות למפה



    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public Salesman(String firstName, String lastName, int basicSalary){
        this.firstName=firstName;
        this.lastName=lastName;
        this.basicSalary=basicSalary;


    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String toString (){
       return  this.firstName+" "+this.lastName+ "  "+basicSalary;
    }
}
