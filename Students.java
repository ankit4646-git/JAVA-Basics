// Create an Array To Store marks of 5 Students and Print Them Using Loop

import java.util.*;

public class Students{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] Marks = new int[n];
        System.out.println("Enter Marks of " + n " Students:");
        for (int i = 0; i < n; i++) {
            Marks[i] = sc.nextInt();
        }
        System.out.println("Marks of \" + n \" Students: " );
        for(int i=0 ; i<n ; i++){
            System.out.println("Student " + (i+1) + " marks: " + Marks[i]);
        }
    }
}