package mobile_bg;

import entities.Car;
import entities.Part;
import entities.Service;
import data.ProductList;
import filter.CarFilter;
import filter.PartFilter;
import filter.ServiceFilter;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarMarketplace marketplace = new CarMarketplace();

        System.out.println("Welcome to MobileBG!");
        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. View all cars");
            System.out.println("2. View all parts");
            System.out.println("3. View all services");
            System.out.println("4. Filter cars");
            System.out.println("5. Filter parts");
            System.out.println("6. Filter services");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> displayCars(marketplace.getCars());
                case 2 -> displayParts(marketplace.getParts());
                case 3 -> displayServices(marketplace.getServices());
                case 4 -> filterCars(scanner, marketplace);
                case 5 -> filterParts(scanner, marketplace);
                case 6 -> filterServices(scanner, marketplace);
                case 7 -> {
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void displayCars(List<Car> cars) {
        if (cars.isEmpty()) {
            System.out.println("No cars available.");
        } else {
            cars.forEach(System.out::println);
        }
    }

    private static void displayParts(List<Part> parts) {
        if (parts.isEmpty()) {
            System.out.println("No parts available.");
        } else {
            parts.forEach(System.out::println);
        }
    }

    private static void displayServices(List<Service> services) {
        if (services.isEmpty()) {
            System.out.println("No services available.");
        } else {
            services.forEach(System.out::println);
        }
    }

    private static void filterCars(Scanner scanner, CarMarketplace marketplace) {
        System.out.print("Enter brand to filter: ");
        String brand = scanner.nextLine();
        List<Car> filteredCars = new CarFilter().apply(marketplace.getCars(), CarFilter.byBrand(brand));
        displayCars(filteredCars);
    }

    private static void filterParts(Scanner scanner, CarMarketplace marketplace) {
        System.out.print("Enter manufacturer to filter: ");
        String manufacturer = scanner.nextLine();
        List<Part> filteredParts = new PartFilter().apply(marketplace.getParts(), PartFilter.byManufacturer(manufacturer));
        displayParts(filteredParts);
    }

    private static void filterServices(Scanner scanner, CarMarketplace marketplace) {
        System.out.print("Enter max price to filter: ");
        double maxPrice = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        List<Service> filteredServices = new ServiceFilter().apply(marketplace.getServices(), ServiceFilter.byPrice(maxPrice));
        displayServices(filteredServices);
    }
}

