package notification;

import mobile_bg.Listing;
import java.util.function.Predicate;

public class NotificationSubscription {
    private Predicate<Listing> criteria;
    private Notifier notifier;

    public NotificationSubscription(Predicate<Listing> criteria, Notifier notifier) {
        this.criteria = criteria;
        this.notifier = notifier;
    }

    public boolean matches(Listing listing) {
        return criteria.test(listing);
    }

    public Notifier getNotifier() {
        return notifier;
    }
}
