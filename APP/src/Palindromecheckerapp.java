public class Palindromecheckerapp {

    public static void main(String[] args) {

        // Input string (you can change this value)
        String input = "level";

        // Variable to store reversed string
        String reversed = "";

        // Reverse string using for loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);  // String concatenation
        }

        // Compare original and reversed string using equals()
        if (input.equals(reversed)) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}