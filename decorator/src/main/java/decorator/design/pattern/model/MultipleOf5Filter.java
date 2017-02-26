package decorator.design.pattern.model;

public class MultipleOf5Filter<T> extends NumericFilter<T> {

	public MultipleOf5Filter(T t) {
		super(t);
	}

	@Override
	public boolean test(T t) {
		Integer i = (Integer)t;
		return i % 5 == 0;
	}

}
