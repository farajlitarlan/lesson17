package lesson_17;

public class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("%.1f AZN added to account.%n", amount);
        } else {
            System.out.println("Warning: Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.printf("%.1f AZN withdrawn from account.%n", amount);
    }

    public void displayAccountDetails() {
        System.out.printf("Account Number: %s%nAccount Owner: %s%nBalance: %.1f AZN%n", accountNumber, accountHolder, balance);
    }
}
