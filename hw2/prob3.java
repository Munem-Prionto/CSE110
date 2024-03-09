
import java.util.Scanner;
import java.lang.Math;

public class prob3 {
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
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int max = matrix[0][0];
        int maxRow = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    maxRow = i;
                }
            }
        }

        System.out.println("max : " + max);
        maxRow = maxRow + 1;
        System.out.println("maxRow : " + maxRow);

    }
}
