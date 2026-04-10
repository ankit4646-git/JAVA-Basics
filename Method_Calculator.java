import java.util.*;

public class Method_Calculator {
    
    public static int add(int n1, int n2) { 
        return n1 + n2; 
    }
    public static int subtract(int n1, int n2) {
         return n1 - n2;
     }
    public static int multiply(int n1, int n2) { 
        return n1 * n2; 
    }
    
    public static int divide(int n1, int n2) {
        if (n2 == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return n1 / n2;
    }

    public static int modulus(int n1, int n2) {
        if (n2 == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return n1 % n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean shouldContinue = true;

        while (shouldContinue) {
            System.out.println("Enter Operator (+, -, *, /, %):");
            char op = sc.next().charAt(0);

            System.out.println("Enter two numbers:");
            int num1 = sc.nextInt(); 
            int num2 = sc.nextInt();

            switch (op) {
                case '+': System.out.println("Result = " + add(num1, num2)); 
                    break;
                case '-': System.out.println("Result = " + subtract(num1, num2));
                    break;
                case '*': System.out.println("Result = " + multiply(num1, num2)); 
                    break;
                case '/': System.out.println("Result = " + divide(num1, num2)); 
                    break;
                case '%': System.out.println("Result = " + modulus(num1, num2)); 
                    break;
                default: System.out.println("Invalid Operator!!");
            }

            System.out.println("Do you want to continue? (Y/N)");
            if (sc.next().equalsIgnoreCase("N")) {
                shouldContinue = false;
            }
        }
        System.out.println("Calculator Closed.");
        sc.close();
    }
}
