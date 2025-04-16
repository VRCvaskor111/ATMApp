// 2. Customer.java
class Customer extends User {
    private Account account;

    public Customer(String userId, String name, Account account) {
        super(userId, name);
        this.account = account;
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    public void checkBalance() {
        System.out.println("Balance: " + account.getBalance());
    }

    @Override
    public void showMenu() {
        System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance");
    }

    public Account getAccount() {
        return account;
    }
}