/**
 * Created by Leon on 01/05/2018.
 */

public class BankAccount {
    private String account = "";
    private double balance = 0.0;

    public BankAccount(String account) {
        this.account = account;
    }

    public double deposit(double amount) {
        this.balance += amount;
        return this.balance;
    }

}
