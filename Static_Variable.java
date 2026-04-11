// WAP in which we create Employee Objects with shared Company Names using static variables

import java.util.*;

class Employee{
    static String CompName = "Tech Solutions";
    String EmpName ;
    int EmpID ;
    double EmpSalary ;

    Employee(String Name, int ID,double Salary){
        this.EmpName = Name ;
        this.EmpID = ID ;
        this.EmpSalary = Salary ;
    }

    void Info(){
        System.out.println("The Name of the Company is: " + this.CompName);
        System.out.println("The Name of the Employee is: " + this.EmpName);
        System.out.println("The Employee_ID of the Employee is: " + this.EmpID);
        System.out.println("The Salary of the Employee is: " + this.EmpSalary);
    }
}

public class Static_Variable{
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
