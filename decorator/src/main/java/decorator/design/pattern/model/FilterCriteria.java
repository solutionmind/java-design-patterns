package decorator.design.pattern.model;

@FunctionalInterface
public interface FilterCriteria<T> {

	public boolean test(T t);	
}
