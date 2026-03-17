import java.util.Stack;

public class Palindromecheckerapp {

    public static void main(String[] args) {

        // Input string (you can modify this)
        String input = "madam";

        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push all characters into the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Variable to store reversed string
        String reversed = "";

        // Pop characters from stack (reverses the string)
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed string
        if (input.equals(reversed)) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}