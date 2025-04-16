// 12. ATMApp.java (Main)
public class ATMApp {
    public static void main(String[] args) {
        BankDatabase db = new BankDatabase();
        DisplayService display = new SimpleDisplay();

        // Create account and users
        Account acc1 = new SavingsAccount("SA123", 1000);
        Customer cust = new Customer("cust1", "Alice", acc1);
        db.addUser(cust);

        AuthenticationService auth = new AuthenticationService(db);
        User user = auth.authenticate("cust1");

        if (user != null) {
            display.displayWelcome(user.name);
            user.showMenu();

            // Execute a demo transaction
            ATM atm = new ATM();
            atm.executeTransaction(user, 1); // Deposit
            atm.executeTransaction(user, 3); // Balance
        } else {
            System.out.println("Authentication failed.");
        }
    }
}