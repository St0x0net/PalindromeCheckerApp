/**
 * =============================================================================
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * =============================================================================
 * * Use Case 9: Recursive Palindrome Checker
 * * Description:
 * This class validates a palindrome using recursion, where the function
 * calls itself to check smaller versions of the original string.
 * * At this stage, the application:
 * - Uses a recursive method to compare start and end characters
 * - Defines a base condition to terminate recursion
 * - Utilizes the JVM Call Stack for method execution
 * * @author vamsikoneru06
 * @version 9.0
 */
public class App {

    /**
     * Application entry point for UC9.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Define the input string
        String input = "deified";

        // Call the recursive function
        boolean isPalindrome = isPalindromeRecursive(input, 0, input.length() - 1);

        // Display the result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    /**
     * Recursive method to check if a string is a palindrome.
     * Recursive call compares start & end characters.
     */
    private static boolean isPalindromeRecursive(String str, int start, int end) {
        // Base condition: if pointers cross, it's a palindrome
        if (start >= end) {
            return true;
        }

        // Check if characters at current positions match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call: move pointers inward
        return isPalindromeRecursive(str, start + 1, end - 1);
    }
}