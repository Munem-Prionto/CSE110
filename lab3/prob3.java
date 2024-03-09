public class prob3 {
    public static void main(String[] args) {
        int[][] workHours = new int[8][7];
        String[] days = { "Su", "M ", "T ", "W ", "Th", "F ", "Sa" };

        int[] hoursSum = new int[8];
        int[] employee = { 0, 1, 2, 3, 4, 5, 6, 7 };

        for (int i = 0; i < workHours.length; i++) {
            for (int j = 0; j < workHours[0].length; j++) {
                workHours[i][j] = (int) (1 + Math.random() * 9);
            }
        }
        System.out.print("            ");
        for (int i = 0; i < days.length; i++) {
            System.out.print(days[i] + "  ");
        }

        System.out.println();
        for (int i = 0; i < workHours.length; i++) {
            int sum = 0;
            System.out.print("Employee " + i + "  ");
            for (int j = 0; j < workHours[0].length; j++) {
                System.out.print(workHours[i][j] + "   ");
                sum += workHours[i][j];
            }
            hoursSum[i] = sum;
            System.out.println();
        }

        for (int j = 0; j < hoursSum.length - 1; j++) {
            for (int i = 0; i < hoursSum.length - 1 - j; i++) {
                if (hoursSum[i] < hoursSum[i + 1]) {
                    int temp = hoursSum[i];
                    hoursSum[i] = hoursSum[i + 1];
                    hoursSum[i + 1] = temp;

                    int temp2 = employee[i];
                    employee[i] = employee[i + 1];
                    employee[i + 1] = temp2;

                }

            }
        }

        System.out.println();
        for (int i = 0; i < employee.length; i++) {
            System.out.println("Employee " + employee[i] + "  " + hoursSum[i] + " hours");
        }

    }
}
