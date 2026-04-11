// WAP to create  a constructor of Employee class to initialize employee data

import java.util.*;

class Employee{
    String EmpName ;
    int EmpID ;
    double EmpSalary ;

    Employee(String Name, int ID,double Salary){
        this.EmpName = Name ;
        this.EmpID = ID ;
        this.EmpSalary = Salary ;
    }

    void Info(){
        System.out.println("The Name of the Employeet is: " + this.EmpName);
        System.out.println("The Employee_ID of the Employee is: " + this.EmpID);
        System.out.println("The Salary of the Employee is: " + this.EmpSalary);
    }
}

public class Employee_Record{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Employee Name:");
        String Name = sc.nextLine();

        System.out.println("Enter Employee ID:");
        int ID = sc.nextInt();

        System.out.println("Enter Employee Salary:");
        double Salary = sc.nextDouble();

        Employee e1 = new Employee(Name,ID,Salary);
        e1.Info();
        sc.close();
    }
}
