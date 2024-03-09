import java.util.Scanner;

public class prob2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter password : ");
        String password = input.nextLine();
        if (password.length() > 8 && containsTwoDigits(password) && containsLetterAndNumbers(password)) {
            System.out.println(password + " (valid)");
        } else {
            System.out.println(password + " (Invalid)");
        }

    }

    public static boolean containsTwoDigits(String password) {
        int digits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                digits++;
            }
        }
        if (digits >= 2) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean containsLetterAndNumbers(String password) {
        boolean containsLetterAndNumbers = false;
        for (int i = 0; i < password.length(); i++) {
            if ((password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') ||
                    (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') ||
                    (password.charAt(i) >= '0' && password.charAt(i) <= '9')) {
                containsLetterAndNumbers = true;
            } else {
                containsLetterAndNumbers = false;
            }
        }
        return containsLetterAndNumbers;
    }

}
