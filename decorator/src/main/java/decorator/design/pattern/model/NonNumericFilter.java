package decorator.design.pattern.model;

public abstract class NonNumericFilter<T> implements FilterCriteria<T> {

	public NonNumericFilter(T t){
		if(!(t instanceof String)){
			throw new IllegalArgumentException("NonNumericFilter applies only on String");
		}
	}
}
