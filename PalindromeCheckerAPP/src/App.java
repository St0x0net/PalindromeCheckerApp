/**
 * =====================================================
 * MAIN CLASS – UseCase4PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 4: Character Array Based Validation
 *
 * Description:
 * This class validates a palindrome by converting
 * the user-provided string into a character array
 * and comparing characters using the two-pointer technique.
 *
 * @author Developer
 * @version 4.0
 */

import java.util.Scanner;

public class App {

    /**
     * Application entry point for UC4.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter text to check palindrome: ");
        String input = scanner.nextLine();

        // Convert string to character array
        char[] chars = input.toCharArray();

        // Initialize pointers
        int start = 0;
        int end = chars.length - 1;

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {

            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        System.out.println("\nInput : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}