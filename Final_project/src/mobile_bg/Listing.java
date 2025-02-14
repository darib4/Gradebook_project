package mobile_bg;

import entities.Car;

public class Listing {
    private Car car;
    private double price;

    public Listing(Car car, double price) {
        this.car = car;
        this.price = price;
    }

    public Car getCar() {
        return car;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return car.getBrand() + " " + car.getModel() + " - $" + price;
    }
}


