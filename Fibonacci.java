import java.util.*;

public class Fibonacci {
    public static void main(String[] args){
        // Create a variable to Styore no opf Terms in Series
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the no of Terms");
            int count = sc.nextInt();
            // Create Initial Conditions
            int n1=0 , n2=1;
            System.out.print("The Fibonacci Series of "+ count + " terms is:");
            int i=1 ;
            while(i<=count){
                System.out.print(n1 + " ");
            // Calculate Next Terms and Swap
                int sum = n1 + n2;
                n1 = n2 ;
                n2 = sum ;
                i++ ;
            }
            
        sc.close();
    }
}