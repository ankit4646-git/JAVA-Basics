import java.util.*;

public class sum {
    public static void main(String[] args){
        //Create a variable to enter the values
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int a = sc.nextInt();
             //Perform Operation
            if(a % 2 == 0)
                System.out.println(a + " is Even...");
            else
                System.out.println(a + " is Odd...");
                
        sc.close();
    }
}
