// 10. AuthenticationService.java
class AuthenticationService {
    private BankDatabase db;

    public AuthenticationService(BankDatabase db) {
        this.db = db;
    }

    public User authenticate(String id) {
        return db.getUser(id); // Very basic authentication
    }
}