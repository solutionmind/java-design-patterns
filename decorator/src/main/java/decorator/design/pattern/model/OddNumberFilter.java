package decorator.design.pattern.model;

public class OddNumberFilter<T> extends NumericFilter<T>{

	public OddNumberFilter(T t) {
		super(t);
	}

	@Override
	public boolean test(T t) {
		Integer i = (Integer)t;
		return !(i % 2 == 0);
	}

}
