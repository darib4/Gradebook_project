package mobile;

public class Guest extends User {
    public Guest(String username, String email) {
        super(username, email);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Guest");
    }
}
