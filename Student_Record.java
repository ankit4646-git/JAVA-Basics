import java.util.*;

class Student {
    String name;
    int rollNumber;
    double marks;

    public void info() {
        System.out.println("The Name of the Student is: " + this.name);
        System.out.println("The Roll Number of the Student is: " + this.rollNumber);
        System.out.println("The Marks of the Student is: " + this.marks);
    }
}

public class Student_Record { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();

        System.out.println("Enter The Student Name:");
        s1.name = sc.nextLine();

        System.out.println("Enter The Roll Number:");
        s1.rollNumber = sc.nextInt();

        System.out.println("Enter The Marks:");
        s1.marks = sc.nextDouble();

        s1.info();
        sc.close();
    }
}
