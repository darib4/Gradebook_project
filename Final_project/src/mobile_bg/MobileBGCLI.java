package mobile_bg;

import java.util.List;
import java.util.Scanner;
import localization.LanguageManager;
import entities.Car;

public class MobileBGCLI {
    private Scanner scanner;
    private CarMarketplace marketplace;
    private LanguageManager languageManager;

    public MobileBGCLI(String languageCode) {
        this.scanner = new Scanner(System.in);
        this.marketplace = new CarMarketplace();
        this.languageManager = new LanguageManager(languageCode);
    }

    public void start() {
        System.out.println(languageManager.getMessage("welcome"));
        while (true) {
            System.out.println("\n" + languageManager.getMessage("choose_option"));
            System.out.println(languageManager.getMessage("view_listings"));
            System.out.println(languageManager.getMessage("add_listing"));
            System.out.println(languageManager.getMessage("search_listings"));
            System.out.println(languageManager.getMessage("view_statistics"));
            System.out.println(languageManager.getMessage("exit"));
            System.out.print(languageManager.getMessage("enter_choice") + " ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> viewListings();
                case 2 -> addListing();
                case 3 -> searchListings();
                case 4 -> viewStatistics();
                case 5 -> {
                    System.out.println(languageManager.getMessage("goodbye"));
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void viewListings() {
        List<Listing> listings = marketplace.getListings();
        if (listings.isEmpty()) {
            System.out.println(languageManager.getMessage("no_listings"));
        } else {
            listings.forEach(System.out::println);
        }
    }

    private void addListing() {
        System.out.print("Enter car brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter car model: ");
        String model = scanner.nextLine();
        System.out.print("Enter car year: ");
        int year = scanner.nextInt();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Car car = new Car(brand, model, year);
        marketplace.addListing(new Listing(car, price));
        System.out.println(languageManager.getMessage("listing_added"));
    }

    private void searchListings() {
        System.out.print("Enter search query (e.g. brand = 'BMW' & year > 2015): ");
        String query = scanner.nextLine();
        List<Listing> results = marketplace.search(query);

        if (results.isEmpty()) {
            System.out.println(languageManager.getMessage("no_results"));
        } else {
            results.forEach(System.out::println);
        }
    }

    private void viewStatistics() {
        marketplace.displayStatistics();
    }
}

