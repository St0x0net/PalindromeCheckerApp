import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

/**
 * ==========================================================
 *  MAIN CLASS - UseCase6PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 6: Queue + Stack Fairness Check
 *
 * Description:
 * This class demonstrates palindrome validation using
 * two different data structures:
 *
 * - Queue (FIFO)
 * - Stack (LIFO)
 *
 * Characters are inserted into both structures and then
 * compared by removing from the front of the queue and
 * the top of the stack.
 *
 * @author St0x0net
 * @version 6.0
 */

public class App {

    /**
     * Application entry point for UC6.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Define the input string to validate
        String input = "civic";

        // Create a Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create a Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);      // Enqueue
            stack.push(c);     // Push
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare dequeue (queue) vs pop (stack)
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        // Display output exactly as shown in your example
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}