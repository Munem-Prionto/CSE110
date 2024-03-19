import java.util.Scanner;

class Book {
    private int ISBN;
    private String bookTitle;
    private int numberOfPages;
    static int count = 0;

    Book() {
        count++;
    };

    Book(int i, String bT, int p) {
        ISBN = i;
        bookTitle = bT;
        numberOfPages = p;
        count++;
    }

    /* setter */
    public void setISBN(int isbn) {
        ISBN = isbn;
    }

    public void setBookTitle(String bookT) {
        bookTitle = bookT;
    }

    public void setNumberOfPages(int nOfP) {
        numberOfPages = nOfP;
    }

    /* getters */
    public int getISBN() {
        return ISBN;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    static int getCount() {
        return count;
    }

    /* methods */
    public int comapreTo(Book book) {
        if (this.getNumberOfPages() > book.getNumberOfPages()) {
            return 1;
        } else if (this.getNumberOfPages() == book.getNumberOfPages()) {
            return 0;
        } else {
            return -1;
        }
    }

    public String toString() {
        return "ISBN : " + getISBN() + "\n" + "BookTitle : " + getBookTitle() + "\n" + "NumberOfPages : "
                + getNumberOfPages();

    }

}

/* Main */
public class Prob2 {
    public static void displayAll(Book[] bookArr) {
        for (int i = 0; i < bookArr.length; i++) {
            System.out.println(bookArr[i].toString());
            System.out.println();
        }
    }

    public static boolean isHeavier(Book book) {
        if (book.getNumberOfPages() > 500) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book[] bookArr = new Book[5];

        for (int i = 0; i < bookArr.length; i++) {
            bookArr[i] = new Book(); /* INTIALIZE */

            System.out.print("ISBN : ");
            int isbn = input.nextInt();
            input.nextLine();
            System.out.print("Book Title : ");
            String bookT = input.nextLine();
            System.out.print("Number Of Pages : ");
            int noOfPg = input.nextInt();

            bookArr[i].setISBN(isbn);
            bookArr[i].setBookTitle(bookT);
            bookArr[i].setNumberOfPages(noOfPg);

            System.out.println();

        }

        displayAll(bookArr);
        System.out.println(
                "number of pages of " + bookArr[0].getBookTitle() + " (caller) is greater than "
                        + bookArr[1].getBookTitle() + " (callee) object's number of pages : "
                        + bookArr[0].comapreTo(bookArr[1]));
        System.out.println("Is " + bookArr[0].getBookTitle() + " a heavy book? : " + isHeavier(bookArr[0]));

        System.out.println("book count " + Book.getCount());

    }
}