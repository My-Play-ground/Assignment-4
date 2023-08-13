import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter (ASCII only) text: ");

        String input= scan.nextLine();

        if (!input.isEmpty()){
            String reversedText = reverseString(input);
            System.out.println("Reversed Text: " + reversedText);

        }else{
            System.out.println("Input is empty,Try again: ");
        }
        scan.close();
    }

    private static String reverseString(String input) {
        char[] charArray = str.toCharArray();
        int left = 0;
    }
}
