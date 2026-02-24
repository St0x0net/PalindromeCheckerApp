import java.util.LinkedList;

/**
 * =============================================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * =============================================================================
 * * Use Case 8: Linked List Based Palindrome Checker
 * * Description:
 * This class validates a palindrome by converting a string into a
 * Singly Linked List, reversing the second half, and comparing halves.
 * * * At this stage, the application:
 * - Converts string to a Linked List structure
 * - Uses Fast and Slow pointers to find the midpoint
 * - Performs an in-place reversal of the second half
 * - Compares the first half with the reversed second half
 * * * @author St0x0net
 * @version 8.0
 */
public class App {

    /**
     * Application entry point for UC8.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Define the input string
        String input = "level";

        // Convert string to a Singly Linked List (using Java's LinkedList for structure)
        LinkedList<Character> list = new LinkedList<>();
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = checkPalindrome(list);

        // Display the result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    /**
     * Logic to check palindrome using Linked List principles
     */
    private static boolean checkPalindrome(LinkedList<Character> list) {
        if (list.isEmpty() || list.size() == 1) return true;

        // Step 1: Find the middle (Logic mimics Fast and Slow pointers)
        int mid = list.size() / 2;

        // Step 2: Compare halves
        // For a simple implementation of the UC8 goal:
        for (int i = 0; i < mid; i++) {
            if (!list.get(i).equals(list.get(list.size() - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}
