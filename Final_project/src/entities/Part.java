package entities;

public class Part extends Product {
    private String manufacturer;

    public Part(String name, String category, double price, String manufacturer) {
        super(name, category, price);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return super.toString() + " - Manufacturer: " + manufacturer;
    }
}
