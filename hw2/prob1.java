
import java.util.Scanner;;

public class prob1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("number of rows : ");
        int row = input.nextInt();

        System.out.print("number of cols : ");
        int col = input.nextInt();

        int[][] matrix = new int[row][col];

        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]" + " : ");
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                System.out.print(matrix[i][j] + " ");
                sum += matrix[i][j];
            }
            System.out.println();
        }

        System.out.println("smm : " + sum);

    }
}
