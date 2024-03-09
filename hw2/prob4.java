
import java.util.Scanner;
import java.lang.Math;

public class prob4 {
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
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        int min = matrix[0][0];
        int minCol = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                    minCol = j;
                }
            }
        }

        System.out.println("min : " + min);
        minCol = minCol + 1;
        System.out.println("minCol : " + minCol);

    }
}
