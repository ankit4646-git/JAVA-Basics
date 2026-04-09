import java.util.*;

public class ArraySortingSearch {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        // Take the size of the array from the user
        System.out.print("Enter the number of elements: ");
        int count = sc.nextInt();
        int[] arr = new int[count];
        System.out.println("Enter " + count + " integers:");
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(arr));

        // Sort the array using nested loops (Bubble Sort)
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Search for an element (Linear search example)
        System.out.print("Enter the number of elements: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println(key + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(key + " not found in the array.");
        }
    }
}