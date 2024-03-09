import java.util.Arrays;

import java.lang.Math;
import java.util.Scanner;

public class prob5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int row = 8;
        int col = 10;
        System.out.println();
        /*
         * char[] correctAns = { 'A', 'B', 'C', 'D', 'A', 'B', 'D', 'D', 'C', 'A' };
         */

        System.out.println("ENTER CORRECT ANSWERS : ");
        char[] correctAns = new char[col];
        for (int i = 0; i < correctAns.length; i++) {
            correctAns[i] = input.next().charAt(0);
        }

        System.out.print("CORRECT ANSWERS : ");

        for (char c : correctAns) {
            System.out.print(c + " ");
        }
        System.out.println();

        char[][] ans = new char[row][col];

        for (int i = 0; i < row; i++) {
            System.out.println("student " + i + "    ");
            for (int j = 0; j < col; j++) {
                ans[i][j] = input.next().charAt(0);

                /*
                 * ans[i][j] = randomChar();
                 * System.out.print(ans[i][j] + " ");
                 */

            }
            System.out.println();
        }
        int[][] marks = new int[row][col];
        int[] marksSum = new int[row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (ans[i][j] == correctAns[j]) {
                    marks[i][j] = 1;
                } else {
                    marks[i][j] = 0;
                }
            }

        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                /* System.out.print(marks[i][j] + " "); */
                sum += marks[i][j];

            }
            marksSum[i] = sum;
            sum = 0;
            /* System.out.println(); */
        }

        int[][] marksSum2d = new int[row][2];
        for (int i = 0; i < row; i++) {
            marksSum2d[i][0] = i;
            marksSum2d[i][1] = marksSum[i];
        }

        for (int i = 0; i < row; i++) {
            System.out.println("student " + marksSum2d[i][0] + " got " + marksSum2d[i][1] + " marks ");
        }
        for (int j = 0; j < row; j++) {
            for (int i = 0; i < row - 1; i++) {
                if (marksSum2d[i][1] < marksSum2d[i + 1][1]) {
                    int temp[] = marksSum2d[i];
                    marksSum2d[i] = marksSum2d[i + 1];
                    marksSum2d[i + 1] = temp;
                }

            }
        }

        System.out.println();
        System.out.println("List of students arranged from highest to lowest mark");
        System.out.println();
        for (int i = 0; i < row; i++) {
            System.out.println("student " + marksSum2d[i][0] + " ( " + marksSum2d[i][1] + " marks)");
        }

    }

    public static char randomChar() {
        int random = 65 + (int) (Math.random() * 4);
        char randomChar = (char) (random);
        return randomChar;
    }

}
