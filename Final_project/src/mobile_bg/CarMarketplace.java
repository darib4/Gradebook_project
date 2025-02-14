package mobile_bg;

import entities.Car;
import entities.Part;
import entities.Service;
import mobile_bg.Listing;
import data.ProductList;
import java.util.ArrayList;
import java.util.List;
import filter.CarFilter;
import filter.PartFilter;
import filter.ServiceFilter;

public class CarMarketplace {
    private List<Car> cars;
    private List<Part> parts;
    private List<Service> services;
    private List<Listing> listings;

    public CarMarketplace() {
        this.cars = ProductList.getCars(); // Зарежда данните за коли
        this.parts = ProductList.getParts(); // Зарежда данните за части
        this.services = ProductList.getServices(); // Зарежда данните за услуги
        this.listings = new ArrayList<>(); // Инициализира списъка с обяви
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Part> getParts() {
        return parts;
    }

    public List<Service> getServices() {
        return services;
    }

    public List<Car> filterCarsByBrand(String brand) {
        return new CarFilter().apply(cars, CarFilter.byBrand(brand));
    }

    public List<Car> filterCarsByYear(int minYear, int maxYear) {
        return new CarFilter().apply(cars, CarFilter.byYearRange(minYear, maxYear));
    }

    public List<Part> filterPartsByManufacturer(String manufacturer) {
        return new PartFilter().apply(parts, PartFilter.byManufacturer(manufacturer));
    }

    public List<Service> filterServicesByPrice(double maxPrice) {
        return new ServiceFilter().apply(services, ServiceFilter.byPrice(maxPrice));
    }

    public void displayStatistics() {
        System.out.println("Car statistics:");
        System.out.println("Total cars: " + cars.size());
        System.out.println("Total parts: " + parts.size());
        System.out.println("Total services: " + services.size());
        System.out.println("Total listings: " + listings.size());
    }

    public void addListing(Listing listing) {
        listings.add(listing);
    }

    public List<Listing> getListings() {
        return listings;
    }

    public List<Listing> search(String query) {
        return new ArrayList<>();
    }
}
