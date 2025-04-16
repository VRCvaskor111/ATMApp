// 9. BankDatabase.java
import java.util.HashMap;

class BankDatabase {
    private HashMap<String, User> users = new HashMap<>();

    public void addUser(User user) {
        users.put(user.userId, user);
    }

    public User getUser(String id) {
        return users.get(id);
    }
}