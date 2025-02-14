package filter;

import java.util.List;
import java.util.function.Predicate;

public interface Filter<T> {
    List<T> apply(List<T> items, Predicate<T> condition);
}

