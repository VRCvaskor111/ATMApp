// 6. CheckingAccount.java
class CheckingAccount extends Account {
    public CheckingAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited in Checking: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn from Checking: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}