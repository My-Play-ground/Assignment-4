import java.util.Scanner;

public class Question1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = 0;
        int x2 = 1;
        
        do{
            System.out.print("Enter a positive number: ");
            int i = scan.nextInt();
            
            int x3 = x1 + x2;
            x1 = x2;
            x2 = x3;
        }
    }
}