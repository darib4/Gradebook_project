package notification;

public class SmsNotifierAdapter extends Notifier {
    private final SmsNotifier smsNotifier;
    private final String phoneNumber;

    public SmsNotifierAdapter(String phoneNumber) {
        this.smsNotifier = new SmsNotifier();
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notifyUser(String message) {
        smsNotifier.sendSms(phoneNumber, message);
    }
}
