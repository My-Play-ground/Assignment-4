import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter (ASCII only) text: ");

        String input= scan.nextLine();

        if (!input.isEmpty()){
            String reversedText = reverseString(input);
            System.out.println("Reversed Text: " + reversedText);

        }
    }

    private static String reverseString(String input) {
        return null;
    }
}
