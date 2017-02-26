package decorator.design.pattern.model;

public class EmptyStringRemoveFilter<T> extends NonNumericFilter<T> {

	public EmptyStringRemoveFilter(T t) {
		super(t);
	}

	@Override
	public boolean test(T t) {
		String s = (String)t;
		return !s.isEmpty();
	}

}
