package filter;

import entities.Car;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CarFilter implements Filter<Car> {
    @Override
    public List<Car> apply(List<Car> cars, Predicate<Car> condition) {
        return cars.stream().filter(condition).collect(Collectors.toList());
    }

    public static Predicate<Car> byBrand(String brand) {
        return car -> car.getBrand().equalsIgnoreCase(brand);
    }

    public static Predicate<Car> byYearRange(int minYear, int maxYear) {
        return car -> car.getYear() >= minYear && car.getYear() <= maxYear;
    }
}

