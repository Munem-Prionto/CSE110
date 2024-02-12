/* package lab1; */

import java.util.Scanner;

public class prob1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer : ");
        int number = input.nextInt();
        if (number % 2 == 0 ^ number % 3 == 0) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

    }
}
