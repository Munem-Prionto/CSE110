/* package lab1; */

import java.util.Scanner;
import java.lang.Math;

public class prob5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("center (p,q) ");

        System.out.print("p : ");
        int p = input.nextInt();
        System.out.print("q : ");
        int q = input.nextInt();

        System.out.print("radius : ");
        int radius = input.nextInt();

        System.out.println("enter a point (x,y) ");
        System.out.print("x : ");
        int x = input.nextInt();
        System.out.print("y : ");
        int y = input.nextInt();

        double distance = Math.sqrt(Math.pow(p - x, 2) + Math.pow(q - y, 2));

        if (distance > radius) {
            System.out.println("the point is outside the circle.");
        } else if (distance < radius) {
            System.out.println("the point is inside the circle.");
        } else if (distance == radius) {
            System.out.println("the point is on the circle.");
        }
    }

}
