
import java.util.Scanner;
import java.lang.Math;

public class prob2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("number of rows : ");
        int row = input.nextInt();

        System.out.print("number of cols : ");
        int col = input.nextInt();

        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int rand = (int) (1 + Math.random() * 10);
                matrix[i][j] = rand;
            }
        }
        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
        int sumCOL = 0;
        for (int i = 0; i < col; i++) {

            for (int j = 0; j < row; j++) {
                sumCOL += matrix[j][i];
            }

            System.out.println("col " + (i + 1) + " sum: : " + sumCOL);
            sumCOL = 0;
        }

    }
}
