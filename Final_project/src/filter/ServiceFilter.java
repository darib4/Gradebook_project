package filter;

import entities.Service;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ServiceFilter implements Filter<Service> {
    @Override
    public List<Service> apply(List<Service> services, Predicate<Service> condition) {
        return services.stream().filter(condition).collect(Collectors.toList());
    }

    public static Predicate<Service> byPrice(double maxPrice) {
        return service -> service.getPrice() <= maxPrice;
    }
}

