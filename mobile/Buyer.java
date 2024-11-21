package mobile;

public class Buyer extends User {
    public Buyer(String username, String email) {
        super(username, email);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Buyer");
    }
}
