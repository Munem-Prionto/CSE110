import java.util.Scanner;

public class prob2 {
    public static int occurrence(int number, int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == number) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i = 0;
        int k = 0;
        int[] numbers = new int[100];

        System.out.println("enter the integers between 0 and 100: ");
        while (i == 0) {
            int integer = input.nextInt();

            if (0 < integer && integer < 100) {
                numbers[k] = integer;
                k++;
            } else if (integer == 0) {
                i = 1;
            }

        }
        System.out.println();

        for (int j = 1; j <= numbers.length; j++) {
            if (occurrence(j, numbers) > 0) {
                System.out.println(j + " occurs " + occurrence(j, numbers) + " time");
            }

        }

    }
}
