package notification;

import mobile_bg.Listing;
import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private List<NotificationSubscription> subscriptions;

    public NotificationService() {
        this.subscriptions = new ArrayList<>();
    }

    public void addSubscription(NotificationSubscription subscription) {
        subscriptions.add(subscription);
    }

    public void notifySubscribers(Listing listing) {
        for (NotificationSubscription subscription : subscriptions) {
            if (subscription.matches(listing)) {
                subscription.getNotifier().notifyUser("New listing matches your criteria: " + listing);
            }
        }
    }
}
