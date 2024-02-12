/* package lab1; */

import java.util.Scanner;

public class prob2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int minInYear = 365 * 24 * 60;
        int minInDay = 24 * 60;

        System.out.print("enter mins  : ");
        int min = input.nextInt();

        int years = min / minInYear;

        int days = (min % minInYear) / minInDay;

        System.out.println(min + "is approximately " + years + " years and " + days + " days");

    }
}
