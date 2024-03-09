import java.util.Scanner;

public class prob4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        int count = 0;
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            int num = input.nextInt();
            if (Isdistinct(num, numbers)) {
                numbers[count] = num;
                count++;
            }
        }
        System.out.print("number of distinct numbers : " + count);
        System.out.println();
        System.out.print("distinct numbers : ");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }

    }

    public static boolean Isdistinct(int num, int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                return false;
            }
        }
        return true;
    }
}
