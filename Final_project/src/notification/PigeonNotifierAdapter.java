package notification;

public class PigeonNotifierAdapter extends Notifier {
    private final PigeonNotifier pigeonNotifier;
    private final String address;
    private final Integer pigeonNumber;

    public PigeonNotifierAdapter(String address, Integer pigeonNumber) {
        this.pigeonNotifier = new PigeonNotifier();
        this.address = address;
        this.pigeonNumber = pigeonNumber;
    }

    @Override
    public void notifyUser(String message) {
        pigeonNotifier.sendPigeon(address, pigeonNumber, message);
    }
}
