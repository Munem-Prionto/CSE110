import java.lang.Math;

public class prob3 {
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

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.print("sorted Array : ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}
