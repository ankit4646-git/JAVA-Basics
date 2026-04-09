import java.util.*;

public class fact {
    public static void main(String[] args){
        //Create a variable to enter the value
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int a = sc.nextInt();
            int i;
            int fact
             //Perform Operation
            if(a == 0)
                System.out.println("Factorial is 1..");
            else
                for(i=1;i<a;i++){
                    fact*=i;
                }
            System.out.println("Factorial of The Number Is:" + a);  
        sc.close();
    }
}
