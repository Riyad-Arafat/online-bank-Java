package onlinebank;

/**
 *
 * @author Abdelrahman Hany
 */

public class Account {
    protected float balance;
    private int accountNumber;

    public Account(float balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public Account() {
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Account{" + "balance = " + balance + ", Account_Number = " + accountNumber + '}';
    }

    public void deposit(float amount) {
        this.balance = this.balance + amount;
        System.out.println(amount + " deposit ");
        System.out.println("your balance is = " + balance);
    }

    public void withdraw(float amount) {
        if (amount > this.balance) {
            System.out.println("You do not have enough balance ");
            System.out.println("your balance is = " + balance);
        } else {
            this.balance = this.balance - amount;
            System.out.println(amount + " withdraw ");
            System.out.println("your balance is = " + balance);
        }

    }
}