public class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Check balance
    public double getBalance() {
        return balance;
    }

    // Display account info
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    // Main method to test
    public static void main(String[] args) {
        BankAccount account = new BankAccount("shekar", 1037450.0);

        account.displayAccountInfo();
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(2000); // Invalid case
        System.out.println("Final Balance: " + account.getBalance());
    }
}