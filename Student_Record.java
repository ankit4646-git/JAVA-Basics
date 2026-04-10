// WAP to Create a Class with Student Details and Display Them Using Objects

import java.util.*;


public class Student{
    String Name ;
    int Roll_Number ;
    double Marks ;

    public void Info(){
        System.out.println("The Name of The Student is: " + this.Name);
        System.out.println("The Age of The Student is: " + this.Age);
        System.out.println("The Marks of The Student is: " + this.Marks);
    }
}

public class Data {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        System.out.println("Enter The Student Name:");
        s1.name = sc.newLine();
        System.out.println("Enter the Roll Number:");
        s1.Roll_Number = sc.newInt();
        System.out.println("Enter The Marks:");
        s1.Marks = sc.newDouble();

        s1.Info();
    }
}