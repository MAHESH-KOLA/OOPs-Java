import java.util.*;

class Person{
    String name, address;
    Person(String name, String address){
        this.name=name;
        this.address=address;
    }
    String getName(){
        return this.name;
    }
    String getAddress(){
        return this.address;
    }
    void setAddress(String address){
        this.address=address;
    }

    String to_String(){
        return name + "(" + address + ")";
    }
}

public class Student extends Person{
    int numCount=0;
    final int maxCount=30;
    String courses[] = new String[30];
    int grades[] = new int[30];
    Student(String name, String address){
        super();
    }
    String to_String(){
        return super.to_String();
    }
    void addCourseGrade(String course, int grade){
        courses[numCount]=course;
        grades[numCount]=grade;
        numCount++;
    }
    void printGrades(){
        for(int i=0;i<maxCount;i++){
            System.out.println(grades[i]);
        }
    }
    double getAverageGrade(){
        int sum=0;
        for(int i=0;i<maxCount;i++){
            sum+=grades[i];
        }
        double avg=sum/sumCount;
        return avg;
    }
    String to_string(){
        return super.to_string();
    }
}
class module4_2{
    public static void main(String[] args) {
        Student S = new Student("ram", "aayodhya");
        System.out.println(S.getName());
        
        
    }
  } 