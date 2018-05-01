/**
 * Created by Leon on 01/05/2018.
 */

public class CheckingAccount extends BankAccount {
    private double limit;

    public CheckingAccount(String account) {
        super(account);
    }

    @Override
    public double deposit(double amount) {
        return super.deposit(amount);
    }
}
