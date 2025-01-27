
public class poly4 {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount(2000, 650);

        withdrawFromAccount(savingsAccount, 300);
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        
    }
    public static void withdrawFromAccount(BankAccount account, int amount) {
        
        account.withdraw(amount);
      }
}
class BankAccount{
    int balance;

    public BankAccount(int initbalance){
        this.balance = initbalance;
    }

    int getBalance(){
        return balance;
    }

    public void deposit(int amt){
        this.balance+=amt;
    }

    public void withdraw(int amt){
        
        if(amt<=balance){
            balance = balance-amt;
        }
        else{
            System.out.println("Insufficent balance: ");
        }
    }
}

class SavingsAccount extends BankAccount {
  
    private int withdrawalLimit;

    public SavingsAccount(int initialBalance, int withdrawalLimit) {
      super(initialBalance);
      
      this.withdrawalLimit = withdrawalLimit;
    }
    @Override
    public void withdraw(int amount) {
     
      if (amount <= withdrawalLimit) {
        
        super.withdraw(amount);
        System.out.println("Withdraw Amount :"+amount);
      } else {
        
        System.out.println("Withdrawal limit exceeded.");
      }
    }
  } 