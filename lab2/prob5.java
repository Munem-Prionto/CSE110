
import java.lang.Math;

public class prob5 {
    public static void main(String[] args) {

        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            int random = (int) (1 + Math.random() * 100);

            arr[i] = random;
        }

        max(arr);
        System.out.println();
        min(arr);

    }

    public static void max(int[] number) {
        int max = number[0];
        int maxIndex = 0;

        for (int i = 0; i < number.length; i++) {
            if (max < number[i]) {
                max = number[i];
                maxIndex = i;
            }
        }
        System.out.println("max value : " + max);
        System.out.println("index of " + max + " : " + maxIndex);

    }

    public static void min(int[] number) {
        int min = number[0];
        int minIndex = 0;

        for (int i = 0; i < number.length; i++) {
            if (min > number[i]) {
                min = number[i];
                minIndex = i;
            }
        }

        System.out.println("min value : " + min);
        System.out.println("index of " + min + " : " + minIndex);

    }
}
