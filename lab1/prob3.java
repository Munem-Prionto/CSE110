/* package lab1; */

import java.util.Scanner;
import java.lang.Math;

public class prob3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a : ");
        int a = input.nextInt();

        System.out.print("b : ");
        int b = input.nextInt();

        System.out.print("c : ");
        int c = input.nextInt();

        double discriminant = (Math.pow(b, 2)) - (4 * a * c);

        System.out.println(discriminant);

        if (discriminant < 0) {
            System.out.println("The equation has no real roots");
        } else if (discriminant > 0) {
            double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("root1 : " + r1 + "  root 2 : " + r2);
        } else if (discriminant == 0) {
            double r = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println("root : " + r);
        }

        System.out.println(discriminant);

    }
}
