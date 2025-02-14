package notification;

public class EmailNotifierAdapter extends Notifier {
    private final EmailNotifier emailNotifier;
    private final String email;

    public EmailNotifierAdapter(String email) {
        this.emailNotifier = new EmailNotifier();
        this.email = email;
    }

    @Override
    public void notifyUser(String message) {
        emailNotifier.sendEmail(email, "New Car Listing", message);
    }
}

