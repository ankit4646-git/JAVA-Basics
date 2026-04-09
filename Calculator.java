import java.util.*;

public class Calculator{
    public static void main(String[] args){
        // Creating Variables to Input Values
        Scanner sc = new Scanner(System.in);
        double num1 ;
        double num2 ;
        boolean Continue = true;
        double Result;

        while(Continue){
            // Enter the Operator
            System.out.println("Enter Operator(+,-*,/,%)");
            char Operator = sc.next().charAt(0);
            // Input The Numbers for Calculations
            System.out.println("Enter the Numbers..");
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();

            switch(Operator){
                case '+':
                    Result = num1 + num2;
                    System.out.println("Result = "+ Result);
                    break;

                case '-':
                    Result = num1 - num2;
                    System.out.println("Result = "+ Result);
                    break;

                case '*':
                    Result = num1 * num2;
                    System.out.println("Result = "+ Result);
                    break;

                case '/':
                    if(num2 != 0){
                        Result = num1 / num2;
                    System.out.println("Result = "+ Result);
                    }
                    else
                        System.out.println("Error; Division Not possible..");
                    break;  
                 
                case '%':
                    if(num2 != 0){
                        Result = num1 % num2;
                    System.out.println("Result = "+ Result);
                    }
                    else
                        System.out.println("Error; Division Not possible..");
                    break;
                
                 
                default:
                    System.out.println("Invalid Operator!!");
                    break;

            }
            // Ask User whether to Countinue or Not
            System.out.println("Do You Want To Perform Further Calculations ; Y/N");
            String Choice = sc.next();
            if(Choice.equalsIgnoreCase("N"))
                Continue = false ;
        }
        System.out.println("The Calculator is Closed....");
        sc.close();
    }
}