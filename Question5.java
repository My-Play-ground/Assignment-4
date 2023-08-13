import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user  (ASCII only)
        System.out.print("Enter (ASCII only) text: ");
        String input = scanner.nextLine();

        // Check if the input 
        if (!input.isEmpty()) {
            // Invert the sequence 
            String reversedText = reverseString(input);

            // Display the reversed text
            System.out.println("Reversed Text: " + reversedText);
        } else {
            System.out.println("Input is empty,Try again: ");
        }

        scanner.close();
    }

    
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
}
