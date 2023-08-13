import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Enter a single word: ");
            input = scanner.nextLine().trim();
        } while (input.contains(" ")); 
        
        if (isPalindrome(input)) {
            System.out.println("'" + input + "' is a palindrome.");
        } else {
            System.out.println("'" + input + "' is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
