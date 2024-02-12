/* package lab1; */

import java.util.Scanner;

public class prob4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===========================");
            System.out.println("1) USD to BDT");
            System.out.println("2) BDT to USD");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            System.out.println("===========================");

            switch (choice) {
                case 1:
                    System.out.print("Enter Amount(USD) : ");
                    double usd = scanner.nextInt();
                    System.out.println(usd + " USD = " + usd * 109.83 + " BDT");

                    break;
                case 2:
                    System.out.print("Enter Amount(BDT) : ");
                    double bdt = scanner.nextInt();
                    System.out.println(bdt + " BDT = " + bdt / 109.83 + " USD");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
