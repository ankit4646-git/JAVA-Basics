//  Create a Program to Accept a Student Name: UPOPER CASE, Lower CASE

import java.util.*;

public class Name{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Name :");
        String Name = sc.nextLine();
        System.out.println("Original Name is:" + Name);
        int len = Name.length();
        System.out.println("Length of Name is: " + len);
        System.out.println("Upper Case:" + Name.toUpperCase());
        System.out.println("Lower Case:" + Name.toLowerCase());
        
        for (int i = 0; i < Name.length(); i++) {
            char U = Name.charAt(i);
            if (Character.isUpperCase(U)) {
                System.out.println("Upper Case:" + U + " ");
            }
        for (int j = 0; j < Name.length(); j++) {
            char L = Name.charAt(i);
            if (Character.isLowerCase(L)) {
                System.out.println("Lower Case:" + L + " ");
            }
        }

        }
    sc.close();
    }
}