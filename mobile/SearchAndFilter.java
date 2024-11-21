package mobile;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchAndFilter {
    private List<Advertisement> advertisements;

    public SearchAndFilter() {
        this.advertisements = new ArrayList<>();
    }

    public void addAdvertisement(Advertisement ad) {
        advertisements.add(ad);
    }

    public List<Advertisement> searchByKeyword(String keyword) {
        return advertisements.stream()
                .filter(ad -> ad.getProduct().getName().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Advertisement> filterByPrice(double minPrice, double maxPrice) {
        return advertisements.stream()
                .filter(ad -> ad.getProduct().getPrice() >= minPrice && ad.getProduct().getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }
}

