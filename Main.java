import java.util.Scanner;
//package Main;
public class Main {
  public static void main(String[] args) {
    BankAccount b1 = new BankAccount("Todd Bauer", 5000);
    BankAccount b2 = new BankAccount("Ryan Kolb", 10000);
    BankAccount b3 = new BankAccount("Pete Nicholson");

    System.out.println(b1.getName() + "'s Bank Account has " + b1.getBalance());
    System.out.println(b2.getName() + "'s Bank Account has " + b2.getBalance());
    System.out.println(b3.getName() + "'s Bank Account has " + b3.getBalance() + "\n");

    b1.deposit(500);
    b2.deposit(250);
    b3.deposit(1000);

    System.out.println(b1.getName() + "'s Bank Account has " + b1.getBalance());
    System.out.println(b2.getName() + "'s Bank Account has " + b2.getBalance());
    System.out.println(b3.getName() + "'s Bank Account has " + b3.getBalance() + "\n");

    b1.withdraw(6000);
    b2.withdraw(5000);
    b3.withdraw(999.99);

    System.out.println(b1.getName() + "'s Bank Account has " + b1.getBalance());
    System.out.println(b2.getName() + "'s Bank Account has " + b2.getBalance());
    System.out.println(b3.getName() + "'s Bank Account has " + b3.getBalance() + "\n");

    BankAccount b4 = new BankAccount();
    BankAccount b5 = new BankAccount();
    BankAccount b6 = new BankAccount();

    b4.deposit();
    b5.deposit();
    b6.deposit();

    b4.withdraw();
    b5.withdraw();
    b6.withdraw();

    System.out.println("\n" + b4.toString());
    System.out.println(b5.toString());
    System.out.println(b6.toString());

    CheckingAccount c1 = new CheckingAccount();

    c1.deposit();

    System.out.println(c1.serviceCharge());
  }
}