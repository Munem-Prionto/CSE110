import java.lang.Math;

public class prob1 {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (1 + Math.random() * 100);
        }
        System.out.print("original Array : ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();

        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (min >= numbers[i]) {
                min = numbers[i];
            }
        }

        System.out.println("min number is : " + min);

    }
}
