import java.util.Arrays;
import java.util.Scanner;

public class prob6 {

    public static int[] sort(int[] array) {

        int[] newArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < newArray.length; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j] > newArray[i]) {
                    int temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("no of students : ");
        int numberOfStudent = input.nextInt();

        String[] namesArray = new String[numberOfStudent];
        int[] marksArray = new int[numberOfStudent];

        for (int i = 0; i < numberOfStudent; i++) {
            System.out.print("name : ");
            namesArray[i] = input.next();
            input.nextLine();
            System.out.print("marks : ");
            marksArray[i] = input.nextInt();

        }

        int[] sortedArray = sort(marksArray);

        for (int i = 0; i < numberOfStudent; i++) {
            for (int j = 0; j < numberOfStudent; j++) {
                if (sortedArray[i] == marksArray[j]) {
                    System.out.println(namesArray[j] + "  " + marksArray[j] + " marks");

                }
            }
        }

    }
}
