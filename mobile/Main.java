package mobile;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Създаване на потребители
        Seller seller = new Seller("JohnDoe", "john@example.com");
        Buyer buyer = new Buyer("JaneDoe", "jane@example.com");

        // Създаване на автомобили
        Product car1 = new Product("Toyota Corolla", "2021, Excellent condition, low mileage", 22000.00);
        Product car2 = new Product("BMW 3 Series", "2018, Well-maintained, full service history", 28000.00);

        // Създаване на обяви
        Advertisement ad1 = new Advertisement(car1, "For Sale", seller.getUsername());
        Advertisement ad2 = new Advertisement(car2, "For Sale", seller.getUsername());

        // Търсене и филтриране
        SearchAndFilter searchAndFilter = new SearchAndFilter();
        searchAndFilter.addAdvertisement(ad1);
        searchAndFilter.addAdvertisement(ad2);

        System.out.println("Search results for 'Toyota':");
        List<Advertisement> searchResults = searchAndFilter.searchByKeyword("Toyota");
        searchResults.forEach(System.out::println);

        System.out.println("Advertisements with price between $20,000 and $30,000:");
        List<Advertisement> filteredResults = searchAndFilter.filterByPrice(20000, 30000);
        filteredResults.forEach(System.out::println);

        // Статистика
        System.out.println("Total advertisements: " + Statistics.countAdvertisements(searchResults));
        System.out.println("Average price: $" + Statistics.averagePrice(filteredResults));
    }
}
