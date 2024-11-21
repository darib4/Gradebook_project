package mobile;

public class Seller extends User {
    public Seller(String username, String email) {
        super(username, email);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Seller");
    }
}

