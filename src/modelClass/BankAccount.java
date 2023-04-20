
package modelClass;

/**
 *
 * @author Chan Yuen Fu
 */
public class BankAccount {
    private int id;
    private String username;
    private double amount;
    private String accountNo;
    private String bankName;
    
    public BankAccount(){
        
    }

    public BankAccount(int id, String username, double amount, String accountNo, String bankName) {
        this.id = id;
        this.username = username;
        this.amount = amount;
        this.accountNo = accountNo;
        this.bankName = bankName;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
       
}
