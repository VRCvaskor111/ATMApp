// 5. SavingsAccount.java
class SavingsAccount extends Account {
    public SavingsAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited in Savings: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn from Savings: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}