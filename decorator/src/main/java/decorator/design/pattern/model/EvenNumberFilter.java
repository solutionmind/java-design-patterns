package decorator.design.pattern.model;

public class EvenNumberFilter<T> extends NumericFilter<T> {

	public EvenNumberFilter(T t) {
		super(t);
	}

	@Override
	public boolean test(T t) {
		Integer i = (Integer)t;
		return i % 2 == 0;
	}

}
