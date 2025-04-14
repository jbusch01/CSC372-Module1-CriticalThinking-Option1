public class CheckingAccount extends BankAccount {
    private double interestRate;
    private double overdraftFee = 30.0;

    public CheckingAccount(String firstName, String lastName, int accountID, double interestRate) {
        super(firstName, lastName, accountID); 
        this.interestRate = interestRate;
    }

    public void processWithdrawal(double amount) {
        if (getAccountBalance() - amount < 0) {
            setBalance(getAccountBalance() - amount - overdraftFee);
            System.out.printf("Your account balance is negative. $%.2f overdraft fee applied.%n", overdraftFee);
        } else {
            withdrawal(amount);
        }
    }

    public void displayAccountInfo() {
        accountSummary();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}