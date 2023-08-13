import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneNumber;

        while (true) {
            System.out.print("Enter a phone number: ");
            phoneNumber = scanner.nextLine();

            if (phoneNumber.isEmpty()) {
                System.out.println("Telephone number can't be empty.");
                continue;
            }

            if (isValidPhoneNumber(phoneNumber)) {
                System.out.println("Number is validated.");
            } else {
                System.out.println("Invalid phone number.");
            }
            
            break;
        }
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        int length = phoneNumber.length();
        
        if (length != 10 && length != 12) {
            return false;
        }

        if (length == 12) {
            if (!phoneNumber.startsWith("+94")) {
                return false;
            }
            phoneNumber = phoneNumber.substring(4);
        } else if (length == 10) {
            if (!phoneNumber.startsWith("0")) {
                return false;
            }
            phoneNumber = phoneNumber.substring(1);
        }

        for (char c : phoneNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }
}
