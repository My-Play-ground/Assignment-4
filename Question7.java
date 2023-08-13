import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().trim();

        if (sentence.isEmpty()) {
            System.out.println("Input sentence is empty.");
        } else {
            String[] words = sentence.split("\\s+");
            String shortestWord = words[0];
            String longestWord = words[0];

            for (String word : words) {
                if (word.length() < shortestWord.length()) {
                    shortestWord = word;
                }
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

            System.out.println("Shortest word: " + shortestWord + " (Length: " + shortestWord.length() + ")");
            System.out.println("Longest word: " + longestWord + " (Length: " + longestWord.length() + ")");
        }

        scanner.close();

    }
}
