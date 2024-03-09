import java.util.Scanner;

public class prob4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("number of strings : ");
        int n = input.nextInt();
        input.nextLine();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("string " + (i + 1) + " : ");
            words[i] = input.nextLine();
        }
        for (int j = 0; j < words.length - 1; j++) {
            for (int i = 0; i < words.length - 1; i++) {
                if (words[i].charAt(0) == words[i + 1].charAt(0) && words[i].length() >= 2) {
                    if (words[i].charAt(1) > words[i + 1].charAt(1)) {
                        String temp = words[i];
                        words[i] = words[i + 1];
                        words[i + 1] = temp;
                    }
                } else if (words[i].charAt(0) > (int) (words[i + 1].charAt(0))) {
                    String temp = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = temp;
                }

            }
        }

        System.out.println();
        for (int i = 0; i < words.length; i++) {

            System.out.println(words[i]);

        }

    }
}
