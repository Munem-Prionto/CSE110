import java.lang.Math;

public class prob4 {
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

        int i = 0, j = numbers.length - 1, c = 0;
        while (i < j) {
            c = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = c;
            i++;
            j--;
        }
        System.out.print("reversed array : ");
        for (int k : numbers) {
            System.out.print(k + " ");
        }

    }
}
