import java.util.Scanner;

public class Prob1 {
    public static void searchByCompany(String companyName, Icecream[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getIcecreamCompany().equals(companyName)) {
                System.out.println(arr[i].getIcecreamCompany());
                System.out.println(arr[i].getIcecreamType());
                System.out.println(arr[i].getIcecreamPrice());
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Icecream[] iceCreamArr = new Icecream[5];
        for (int i = 0; i < iceCreamArr.length; i++) {
            iceCreamArr[i] = new Icecream();
            System.out.print("Icecream company : ");
            iceCreamArr[i].setIcecreamCompany(input.nextLine());
            System.out.print("Icecream type : ");
            iceCreamArr[i].setIcecreamType(input.nextLine());
            System.out.print("Icecream price : ");
            iceCreamArr[i].setIcecreamPrice(input.nextInt());

            input.nextLine();
            System.out.println();
        }

        for (int i = 0; i < iceCreamArr.length; i++) {
            System.out.println(iceCreamArr[i].getIcecreamType());
            System.out.println(iceCreamArr[i].getIcecreamCompany());
            System.out.println(iceCreamArr[i].getIcecreamPrice());

            System.out.println();
        }
        System.out.print("search by company : ");
        String search = input.nextLine();
        searchByCompany(search, iceCreamArr);

    }

}
