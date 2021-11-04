import java.util.Scanner;
public class DebitAccount extends BankAccount {

    private double service;
    

    public DebitAccount() {
        super();
        Scanner zboard = new Scanner(System.in);
        System.out.println("Enter the Service Charge in " + getName() + "'s Bank Account");
        service = zboard.nextDouble();
    }

    public double writeCheck() {
        double balanceOne = Double.parseDouble(getBalance()); 
        
        withdraw();
        balanceOne = serviceCharge();
        if (balanceOne < 0) {
            balanceOne = overDraft();
        }
        return balanceOne;
    }
     public double overDraft() {
       double balanceOne = Double.parseDouble(getBalance());
         balanceOne = balanceOne - 50;
        return balanceOne;
    }
    
    public double serviceCharge() {
         double balanceOne = Double.parseDouble(getBalance());
        balanceOne = balanceOne - service;
         return balanceOne;
    }

    
}