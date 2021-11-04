 import java.util.Scanner;
 public class BankAccount {
 private String name; // Initializes Name of the Account
 private double balance; // Initializes Amount of Money in the Account

    public BankAccount() { //Constructor One: Takes Name and Money in Account From User
        Scanner kboard = new Scanner(System.in);
        System.out.println("Enter the Name of the Bank Account");
        name = kboard.nextLine();
        System.out.println("Enter the Amount of Money in " + name + "'s Bank Account");
        balance = kboard.nextDouble();
    }

    public void withdraw() { // Withdraws a Certain Amount Given by the User
        Scanner kboard = new Scanner(System.in);
        System.out.println("Enter the Amount of Money to Withdraw From " + name + "'s Account");
        double withdraw = kboard.nextDouble();
        balance = balance - withdraw;
    }

    public void deposit() { // Deposits a Certain Amount Given by the User
        Scanner kboard = new Scanner(System.in);
        System.out.println("Enter the Amount of Money to Deposit In " + name + "'s Account");
        double deposit = kboard.nextDouble();
        balance = balance + deposit;
    }

    public String toString() {
        if (balance < 0) {
            return name + "'s Bank Account Has Insufficient Funds ($" + Double.toString(balance) + "0)";
        } else {
            return name + "'s Bank Account Has $" + Double.toString(balance) + "0";  
        }

    }

    public BankAccount(String n, double b) {
        name = n;
        balance = b;
    }

    public BankAccount(String n) {
        name = n;
        balance = 0;
    }

    public void deposit(double d) {
        balance = balance + d;
    }

    public void withdraw(double w) {
        balance = balance - w;

    }

    public String getBalance() {
        if (balance < 0) {
            return "Insufficient Funds ($" + Double.toString(balance) + "0)";
        } else {
            return Double.toString(balance);
        }
    }

    public String getName() {
        return name;
    }
}