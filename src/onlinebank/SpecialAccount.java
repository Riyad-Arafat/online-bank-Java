package onlinebank;

/**
 *
 * @author Abdelrahman Hany
 */
public class SpecialAccount extends Account {

    public SpecialAccount(float balance, String accountNumber) {
        super(balance, accountNumber);
    }

    public SpecialAccount() {
    }

    @Override
    public void withdraw(float amount) {

        if (amount > this.balance) {
            if (this.balance - amount >= -1000) {
                this.balance = this.balance - amount;
                System.out.println(amount + "withdraw");
                System.out.println("your balance is = " + balance);
            } else {
                System.out.println("You do not have enough balance ");
                System.out.println("your balance is = " + balance);
            }
        } else {
            this.balance = this.balance - amount;
            System.out.println(amount + "withdraw");
            System.out.println("your balance is = " + balance);
        }
    }

}
