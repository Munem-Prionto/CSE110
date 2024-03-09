import java.util.Scanner;

public class prob5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("row: ");
        int row = input.nextInt();
        System.out.print("col: ");
        int col = input.nextInt();

        System.out.print("Sort by values in column : ");
        int n = input.nextInt() - 1;

        System.out.println();

        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = (int) (1 + Math.random() * 99);
            }
        }
        System.out.println("before sorting: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("after sorting: ");
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i][n] < arr[i + 1][n]) {
                    int temp[] = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
