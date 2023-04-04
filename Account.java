package entities;

public class Account {
    private int accountId;
    private int customerId;
    private  double balance;
    private String branch;

    public Account(int accountId, int customerId, double balance, String branch) {
        this.accountId = accountId;
        this.customerId = customerId;
        this.balance = balance;
        this.branch = branch;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
