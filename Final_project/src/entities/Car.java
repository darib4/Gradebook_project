package entities;

public class Car extends Product {
    private String brand;
    private String model;
    private int year;

    public Car(String name, String category, double price, String brand, String model, int year) {
        super(name, category, price);
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Car(String brand, String model, int year) {
        super(brand + " " + model, "Vehicle", 0.0);
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + brand + " " + model + " (" + year + ")";
    }
}

