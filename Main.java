package lesson_17;

public class Main {
    public static void main(String[] args) {


        System.out.println("SavingsAccount :");
        Account savingsAccount = new SavingsAccount("SA123", "Elmdar Aliyev", 5000, 3.5);
        savingsAccount.displayAccountDetails();
        savingsAccount.deposit(1000);
        ((SavingsAccount) savingsAccount).applyInterest();
        savingsAccount.withdraw(3000);
        System.out.println();

        System.out.println("CurrentAccount :");
        Account currentAccount = new CurrentAccount("CA456", "Ali Vəliyev", 2000, 1000);
        currentAccount.displayAccountDetails();
        currentAccount.withdraw(2500);
        currentAccount.withdraw(700);
    }
}
