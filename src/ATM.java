// 7. ATM.java
class ATM {
    public void executeTransaction(User user, int choice) {
        if (user instanceof Customer) {
            Customer c = (Customer) user;
            switch (choice) {
                case 1 -> c.deposit(100); // Hardcoded for demo
                case 2 -> c.withdraw(50);
                case 3 -> c.checkBalance();
                default -> System.out.println("Invalid Option");
            }
        }
    }
}