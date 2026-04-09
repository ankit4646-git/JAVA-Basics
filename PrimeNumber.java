import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        // Get a number from the user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        boolean isPrime = true;

        // Check for factors using nested logic and break statement
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; 
                }
            }
        }

        //  Print the result
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}