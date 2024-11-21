package mobile;

import java.util.List;

public class Statistics {
    public static int countAdvertisements(List<Advertisement> ads) {
        return ads.size();
    }

    public static double averagePrice(List<Advertisement> ads) {
        return ads.stream()
                .mapToDouble(ad -> ad.getProduct().getPrice())
                .average()
                .orElse(0.0);
    }
}

