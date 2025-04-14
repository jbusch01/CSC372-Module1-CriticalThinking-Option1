class BankAccount {
    String firstName;
    String lastName;
    int accountID;
    double balance;
    
    public BankAccount(String firstName, String lastName, int accountID, double balance) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.accountID = accountID;
       this.balance = balance;
    }

    public void deposit(double depositAmount) {

    }

    public void withdrawal(double withdrawalAmount) {

    }

    public void accountSummary(String firstName, String lastName, int accountID, double balance) {

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAccountID() {
        return accountID;
    }

    public double getAccountBalance() {
        return balance;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}