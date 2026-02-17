/**
 * ---------------------------------------------------------------
 * MAIN CLASS - UseCase1PalindromeCheckerApp
 * ---------------------------------------------------------------
 *
 * Use Case 1: Application Entry & Welcome Message
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * @author user69
 * @version 1.0
 */

public class App {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        System.out.println("     Welcome to Palindrome Checker     ");

        // Display Application Details
        System.out.println("Application Name : PalindromeChecker App");
        System.out.println("Version          : 1.0");
        System.out.println("System ready for palindrome validation...\n");

        // -------------------------------
        // UC2: Hardcoded Palindrome Check
        // -------------------------------

        String input = "madam";
        boolean isPalindrome = true;

        // Loop only till half of the string length
        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
