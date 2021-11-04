import java.util.Scanner;
public class SavingsAccount extends BankAccount {

    private String name;
    private double balance;
    private String interest;
    private String interest1;
    private double interest2;

    public SavingsAccount() {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Enter the Name of the Bank Account");
        name = kboard.nextLine();
        System.out.println("Enter the Amount of Money in " + name + "'s Bank Account");
        balance = kboard.nextDouble();
        Scanner lboard = new Scanner(System.in);
        System.out.println("Enter the Interest Rate for " + name + "'s Bank Account as a Percent");
        interest = lboard.nextLine();
        interest1 = interest.substring(0, interest.length() - 1);
        interest2 = Double.parseDouble(interest1) / 100;
    }

    public double addInterst() {
        balance = (interest2 + 1) * (balance);
        return balance;
    }

}