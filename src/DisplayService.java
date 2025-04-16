// 11. DisplayService.java (Abstraction)
interface DisplayService {
    void displayWelcome(String name);
}

class SimpleDisplay implements DisplayService {
    public void displayWelcome(String name) {
        System.out.println("Welcome, " + name + "!");
    }
}