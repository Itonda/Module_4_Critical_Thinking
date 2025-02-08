// Necessary utilities for input, dynamic array, and max/min calculation
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ListOperations { // Main class init
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in); // Scanner init
        List<Double> doublesList = new ArrayList<>(); // Empty dynamic array init

        System.out.println("Enter the list of doubles: ");

        int listLength = 5; // Sets length of array by limiting element additions to array - loop init
        int count = 0; // counter for loop - loop init

        // Loop for adding elements to array. Stops at listLength
        while (count < listLength) { // Condition - Loop exits when count == listLength
            doublesList.add(scn.nextDouble()); // Adds input to next index in array. Implies count == array index
            count++; // Updates count after each array addition
        }

        System.out.println("\nEntered list: " + doublesList + "\n"); // Output completed array

        scn.close(); // Release scanner

        // Loop for calculating total of array elements
        double total = 0; // Loop and total init.
        for (Double i : doublesList) { // Traversal of doublesList
            total += i; // Updates total as running total of each index value of doublesList
        }

        // Variables set to calculate average, max and min of array, and interest of total
        double average = total / doublesList.size();
        double maxOfList = Collections.max(doublesList);
        double minOfList = Collections.min(doublesList);
        double interestOfListTotal = total * 0.2;

        // Output total, average, max and min of array, and interest of total
        System.out.println("Sum of entered list: " + total);
        System.out.println("Average of entered list: " + average);
        System.out.println("Maximum of entered list: " + maxOfList);
        System.out.println("Minimum of entered list: " + minOfList);
        System.out.println("Interest of total: " + interestOfListTotal);
    }
}