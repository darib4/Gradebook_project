package data;

import entities.Car;
import entities.Part;
import entities.Service;
import entities.Product;
import java.util.List;

public class ProductList {

    // Данни за автомобили
    public static List<Car> getCars() {
        return List.of(
                new Car("Audi A7", "Sedan", 38000, "Audi", "A7", 2024),
                new Car("Mercedes S-Class", "Sedan", 42000, "Mercedes", "S-Class", 2021),
                new Car("Honda CR-V", "SUV", 32000, "Honda", "CR-V", 2016),
                new Car("Hyundai Kona", "Crossover", 27000, "Hyundai", "Kona", 2023)
        );
    }

    // Данни за автомобилни части
    public static List<Part> getParts() {
        return List.of(
                new Part("Brake Pads", "Braking System", 150, "Brembo"),
                new Part("Air Filter", "Engine", 50, "Bosch"),
                new Part("Battery", "Electrical", 200, "Varta"),
                new Part("Oil Filter", "Engine", 30, "Mann")
        );
    }

    // Данни за автомобилни услуги
    public static List<Service> getServices() {
        return List.of(
                new Service("Car Wash", "Exterior cleaning", 15),
                new Service("Oil Change", "Engine maintenance", 60),
                new Service("Tire Replacement", "Tire service", 100),
                new Service("Brake Inspection", "Braking system check", 40)
        );
    }

    public static List<Product> getAllProducts() {
        List<Product> allProducts = new java.util.ArrayList<>();
        allProducts.addAll(getCars());
        allProducts.addAll(getParts());
        allProducts.addAll(getServices());
        return allProducts;
    }
}
