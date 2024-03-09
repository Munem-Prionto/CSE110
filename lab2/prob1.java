import java.util.Scanner;

public class prob1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("enter number of students : ");
        int numberOfStudent = input.nextInt();

        int[] scores = new int[numberOfStudent];

        System.out.println("enter scores of " + numberOfStudent + " students : ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }

        int best = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (best < scores[i]) {
                best = scores[i];
            }
        }

        for (int i = 0; i < scores.length; i++) {

            if (scores[i] >= best - 10) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is A");
            } else if (scores[i] >= best - 20) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is B");
            } else if (scores[i] >= best - 30) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is C");
            } else if (scores[i] >= best - 40) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is D");
            } else {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is F");
            }
        }

    }
}
