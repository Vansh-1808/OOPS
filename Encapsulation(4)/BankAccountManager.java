class BankAccount {
    private double balance; // Private field
    private String accountNumber;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getters and Setters
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    // Methods to modify balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

public class BankAccountManager {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", 1000.0);

        System.out.println("Account Number: " + account.getAccountNumber()); // Output: 12345
        System.out.println("Initial Balance: $" + account.getBalance());     // Output: 1000.0
        account.deposit(500.0);                                              // Output: Deposited $500
        System.out.println("New Balance: $" + account.getBalance());         // Output: 1500.0
        account.withdraw(200.0);                                             // Output: Withdrew $200
        System.out.println("Final Balance: $" + account.getBalance());       // Output: 1300.0
    }
}