public class prob1 {
    public static void main(String[] args) {
        int[][] randArr = new int[4][4];

        for (int i = 0; i < randArr.length; i++) {
            for (int j = 0; j < randArr[0].length; j++) {
                randArr[i][j] = (int) (Math.round(Math.random()));
            }
        }

        System.out.println("4x4 matrix : ");
        for (int i = 0; i < randArr.length; i++) {
            for (int j = 0; j < randArr[0].length; j++) {
                System.out.print(randArr[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        int rowSumIndex = 0;
        int colSumIndex = 0;
        int rowSum2 = 0;
        int colSum2 = 0;

        for (int i = 0; i < randArr.length; i++) {

            int rowSum1 = 0;

            for (int j = 0; j < randArr[0].length; j++) {
                rowSum1 += randArr[i][j];
            }

            if (rowSum1 > rowSum2) {
                rowSum2 = rowSum1;
                rowSumIndex = i;
            }

        }
        for (int j = 0; j < randArr[0].length; j++) {
            int colSum1 = 0;

            for (int i = 0; i < randArr.length; i++) {
                colSum1 += randArr[i][j];
            }

            if (colSum1 > colSum2) {
                colSum2 = colSum1;
                colSumIndex = j;
            }
        }
        System.out.println("The largest row index : " + rowSumIndex);
        System.out.println("The largest col index : " + colSumIndex);
    }
}
