import java.lang.Math;

public class prob5 {
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
            int randomIndex = (int) (Math.random() * numbers.length);
            int temp = numbers[i];
            numbers[i] = numbers[randomIndex];
            numbers[randomIndex] = temp;
        }
        System.out.print("Shuffled Array : ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }

    }
}
