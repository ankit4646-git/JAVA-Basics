//WAP to create a Parent child class reationship and inherit properties/objects

// 1. Create a Public Parent class
class StudentParent {

    // 2. Declare The Parent Class Values
    int rollNo = 10;
    String Name = "Riya";

    void showStudentDetails(){
        System.out.println("Roll No:" + rollNo);
        System.out.println("Name:" + Name);

    }
}
//3. Create Child Class Method

public class CollegeStudent_Inheritance extends StudentParent {

    String collegeName = "ABC College";

    void showCollegeDetails(){
        System.out.println("College Name:" + collegeName);
    }
    public static void main(String[] args){
        CollegeStudent cs = new CollegeStudent();

        cs.showStudentDetails();
        

    }
}
