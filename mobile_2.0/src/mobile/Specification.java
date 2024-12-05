package mobile;

public interface Specification<T> {
    boolean isSatisfiedBy(T item);
}
