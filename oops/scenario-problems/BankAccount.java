
class BankAccount{
    private int accountNumber;
    private String holder;
    private int balance;
    private static int totalAccounts = 0;

    public BankAccount(int accountNumber,String holder, int balance){
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(int amount){
        if(amount>0){
            balance+= amount;
            System.out.println("Money Deposited by holder : " + amount);
        }else{
            System.out.println("Invalid amount");
        }
    }

    public void withDraw(int amount){
        if(amount>balance){
            System.out.println("Insufficient balancce");
        }else{
            balance =  balance - amount;
            System.out.println("Money withdrawl by holder : " + amount);
        }
    }
     public void getStatement(){
        System.out.println("Bank Account Number : " + accountNumber);
        System.out.println("Account's Holder: " + holder);
        System.out.println("Bank Balance : " + balance);

     }
     public static int getTotalAccounts(){
        return totalAccounts;
     }
    
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, "Shivam", 1000);
        BankAccount acc2 = new BankAccount(102, "Harsh", 2000);
        BankAccount acc3 = new BankAccount(103, "Suman", 1500);

        acc1.deposit(300);
        acc1.withDraw(500);
        
        acc2.deposit(100);
        acc2.withDraw(500);

        acc3.deposit(499);
        acc3.withDraw(600);

        // Total accounts
        System.out.println("Total Accounts Created: " + BankAccount.getTotalAccounts());
    }
}
