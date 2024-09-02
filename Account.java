import java.util.ArrayList;

public class Account {
    private String bankName;
    private ArrayList<Account> accounts;
    private String customerName;
    private double balance;
    private long accountNumber;

    public Account(long accountNumber, String customerName, double balance){
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;

}

    public long getAccountNumber()
    {return accountNumber;}
    public double getBalance()
    {return balance;}
    public String getCustomerName()
    {return customerName;}


    public boolean deposit(double depositAmount){
        if (depositAmount>0){
            balance+=depositAmount;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean withdraw(double amount){
        if (amount > balance || amount <= 0){
            return false;
        }
        else {
            balance -=amount;
            return true;
        }
    }

    public String toString()
    {
        return ""+accountNumber;
    }
}
