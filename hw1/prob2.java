import java.lang.Math;
import java.util.Scanner;

public class prob2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (1 + Math.random() * 100);
        }

        System.out.print("original Array : ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("shift by : ");
        int shiftNumber = input.nextInt();

        for (int j = 0; j < shiftNumber; j++) {
            int last = numbers[numbers.length - 1];

            for (int i = numbers.length - 1; i > 0; i--) {
                numbers[i] = numbers[i - 1];
            }
            numbers[0] = last;
        }

        System.out.print("after right shifting " + shiftNumber + " positions : ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }

    }
}
