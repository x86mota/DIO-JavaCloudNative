public class BankAccount {

    private int accountNumber;
    private String branchNumber;
    private String customerName;
    private double balance;

    public BankAccount(int accountNumber, String customerName, String branchNumber, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.branchNumber = branchNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getBranchNumber() {
        return branchNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }
}
