// 3. Admin.java
class Admin extends User {
    public Admin(String userId, String name) {
        super(userId, name);
    }

    @Override
    public void showMenu() {
        System.out.println("Admin Panel - Under Construction.");
    }
}