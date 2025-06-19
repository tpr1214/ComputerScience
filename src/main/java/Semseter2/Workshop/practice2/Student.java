package Semseter2.Workshop.practice2;

import java.util.List;

public class Student {
    private String name;
    private int id;
    private int score;
     private Subject subject;

     public Student (){

     }


     public boolean idEquals(int id){
         if(this.id==id){
             return true;
         }else {
             return false;
         }
     }

     public Student compareTo(Student other){
         if(this.score>other.score){
             return this;
         }else {
             return other;
         }
     }


}
