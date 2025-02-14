package filter;

import entities.Part;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartFilter implements Filter<Part> {
    @Override
    public List<Part> apply(List<Part> parts, Predicate<Part> condition) {
        return parts.stream().filter(condition).collect(Collectors.toList());
    }

    public static Predicate<Part> byManufacturer(String manufacturer) {
        return part -> part.getManufacturer().equalsIgnoreCase(manufacturer);
    }
}

