package lesson_17;


public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        double totalFunds = getBalance() + overdraftLimit;

        if (amount > totalFunds) {
            System.out.printf("%.1f AZN withdrawn. Overdraft balance: %.1f AZN%n", amount, overdraftLimit - (amount - getBalance()));
            setBalance(getBalance() - amount);
        } else {
            if (amount > getBalance()) {
                double overdraftUsed = amount - getBalance();
                overdraftLimit -= overdraftUsed;
                setBalance(0);
                System.out.printf("%.1f AZN withdrawn. Overdraft balance: %.1f AZN%n", amount, overdraftLimit);
            } else {
                super.withdraw(amount);
            }
        }
    }
    }



