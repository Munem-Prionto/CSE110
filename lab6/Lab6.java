import java.util.Calendar;
import java.util.Scanner;

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Calendar dateCreated;

    public Account() {
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = Calendar.getInstance();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Calendar getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return ((annualInterestRate / 100) / 12);
    }

    public double getMonthlyInterestAmount() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

}

class CheckingAccount extends Account {

    private double overdraftLimit;

    CheckingAccount(int id, double balance, double annualInterestRate, double overdraftLimit) {
        super(id, balance, annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    
}

class SavingsAccount extends Account {
    private long cardNumber;
    Calendar expiryDate;

    SavingsAccount(int id, double balance, double annualInterestRate, long cardNumber) {
        super(id, balance, annualInterestRate);
        this.cardNumber = cardNumber;
        expiryDate = Calendar.getInstance();
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getCreditBalance() {
        return 3 * getBalance();
    }

    public Calendar getExpiryDate() {
        return expiryDate;
    }

}

public class Lab6 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Account acc1 = new Account(1122, 20000, 4.5);
        acc1.withdraw(2500);
        acc1.deposit(3500);

        System.out.println("============A=============");
        System.out.println("ID : " + acc1.getId());
        System.out.println("Balance : " + acc1.getBalance() + " $ ");
        System.out.println("Monthly Interest Rate : " + acc1.getMonthlyInterestRate() * 100 + " % ");
        System.out.println("Monthly Interest Ammount : " + acc1.getMonthlyInterestAmount() + "$ ");
        System.out.println("Date Created : " + acc1.getDateCreated().getTime());

        
        acc1.getBalance();

        System.out.println();
        System.out.println();


        System.out.println("============C=============");
        Account[] accounts = new Account[4]; 
        int i = 0; 
        
        while (i < accounts.length) {
            System.out.println("Press (1) for creating a Checking Account");
            System.out.println("Press (2) for creating a Savings Account");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Enter id:");
                    int id1 = scanner.nextInt();
                    System.out.println("Enter balance:");
                    double balance1 = scanner.nextDouble();
                    System.out.println("Enter interest rate:");
                    double annualInterestRate1 = scanner.nextDouble();
                    System.out.println("Enter overdraft limit:");
                    double overdraftLimit1 = scanner.nextDouble();

                    accounts[i] = new CheckingAccount(id1, balance1,annualInterestRate1,overdraftLimit1);
                    System.out.println("===========Account " + (i + 1) + "==============");
                    System.out.println("ID : " + accounts[i].getId());
                    System.out.println("Balance : $" + accounts[i].getBalance());
                    System.out.println("Monthly Interest Rate : " + accounts[i].getMonthlyInterestRate() * 100 + "%");
                    System.out.println("Monthly Interest Amount : $" + accounts[i].getMonthlyInterestAmount());
                    System.out.println("Date Created : " + accounts[i].getDateCreated().getTime());
                    System.out.println();
                    
                    i++; 
                    break;
                case 2:
                    System.out.println("Enter id:");
                    int id2 = scanner.nextInt();
                    System.out.println("Enter balance:");
                    double balance2 = scanner.nextDouble();
                    System.out.println("Enter interest rate:");
                    double annualInterestRate2 = scanner.nextDouble();
                    System.out.println("Enter card no:");
                    long cardNumber2 = scanner.nextLong();
                    
                    accounts[i] = new SavingsAccount(id2, balance2,annualInterestRate2, cardNumber2);
                    System.out.println("===========Account " + (i + 1) + "==============");
                    System.out.println("ID : " + accounts[i].getId());
                    System.out.println("Balance : $" + accounts[i].getBalance());
                    System.out.println("Monthly Interest Rate : " + accounts[i].getMonthlyInterestRate() * 100 + "%");
                    System.out.println("Monthly Interest Amount : $" + accounts[i].getMonthlyInterestAmount());
                    System.out.println("Date Created : " + accounts[i].getDateCreated().getTime());
                    System.out.println();
                    i++;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}