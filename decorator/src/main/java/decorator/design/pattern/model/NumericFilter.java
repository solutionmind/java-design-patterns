package decorator.design.pattern.model;

public abstract class NumericFilter<T> implements FilterCriteria<T> {

	public NumericFilter(T t){
		if(!(t instanceof Integer)){
			throw new IllegalArgumentException("NumericFilter applies only on Numeric");
		}
	}
}
