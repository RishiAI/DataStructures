import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Account> accounts;

    public Bank(String name) {
        this.bankName = name;
        this.accounts = new ArrayList<Account>();
    }

    public void setName(String name) {
        this.bankName = name;
    }

    public String getName() {
        return bankName;
    }

    public Account getAccount(long accountNumber) {
        for (int i = 0; i <= accounts.size() - 1; i++) {
            if (accounts.get(i).getAccountNumber() == accountNumber) {
                return accounts.get(i);
            }

            }
        return null;
        }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public boolean openAccount(long accountNumber, String customerName, double startingBalance) {
        if (startingBalance <= 0) {
            return false;
        } else {
            for(int i = 0; i<=accounts.size()-1;i++){
                if(accounts.get(i).getAccountNumber() == accountNumber){
                    return false;
                }
            }
            Account acc = new Account(accountNumber, customerName, startingBalance);
            accounts.add(acc);
            return true;
        }
    }

    public double closeAccount(long accountNumber) {
        for (int i = 0; i <= accounts.size() - 1; i++) {
            if (accounts.get(i).getAccountNumber() == accountNumber) {
                Account acc = accounts.get(i);
                double bal = acc.getBalance();
                accounts.remove(i);
                return bal;
        }


        }
        return -1;
    }
}
