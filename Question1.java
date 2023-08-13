import java.util.Scanner;

public class Question1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = scan.nextInt();
        int x1 = 0;
        int x2 = 1;
        int i = 1;
        
        do{
            System.out.println(x1 + " ");
            int x3 = x1 + x2;
            x1 = x2;
            x2 = x3;
            
            i++;

        }while(i<=n);
        
    }
}