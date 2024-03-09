import java.util.Scanner;

public class prob3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter an integer : ");
        int number = input.nextInt();

        int temp = number;

        int sum = 0;
        for (int i = number; i != 0; i = i / 10) {
            int r = i % 10;
            sum = (sum * 10) + r;
        }

        if (temp == sum) {
            System.out.println(temp + " is a palindrome");
        } else {
            System.out.println(temp + " is not a palindrome");
        }

    }
}
