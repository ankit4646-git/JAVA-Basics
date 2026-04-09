import java.util.*;

public class Palindrome {
    public static void main(String[] args){
        // Create a variable to Stor Original and Reversed String
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a String");
            String str = sc.nextLine();
            String ReverseString= "";
        // Check The Length of The String 
            int StrLength= str.length();
        // Create The Reversed String
            for(int i = (StrLength - 1) ; i>=0 ; i--){
                ReverseString= ReverseString + str.charAt(i);
            }
        // Compare The Original and Reversed Strings
            if(str.toLowerCase().equals(ReverseString.toLowerCase()))
                System.out.println(str + " is a Palindrome...");
            else
                System.out.println(str + " is not a Palindrome...");
        sc.close();
    }
}