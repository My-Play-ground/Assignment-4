import java.util.Scanner;

public class Question6{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        if(input.trim().isEmpty()){
            System.out.println("Input is empty,Try again: ");

        }else{
            String[] words = input.split("\\s+");
            StringBuilder reversedSentence = new StringBuilder();
            for(int i = -words.length - 1;i>= 0 ;i--){
                
            }

        }
        
    }
}