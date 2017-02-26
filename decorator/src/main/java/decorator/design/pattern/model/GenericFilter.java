package decorator.design.pattern.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rajesh
 *
 * @param <T>
 */
public class GenericFilter<T>{

	private FilterCriteria<T> filterCriteria;
	
	/**
	 * @param criteria
	 * 
	 * Decorating GenericFilter with criteria.
	 * providing GenericFilter a behaviour at runtime dynamically.
	 */
	public GenericFilter(FilterCriteria<T> criteria){
		this.filterCriteria = criteria;
	}
	
	public List<T> filterList(List<T>list) {
		List<T> filteredList = new ArrayList<>();
		
		for(T t : list){
			if(filterCriteria.test(t)){
				filteredList.add(t);
			}
		}
		return filteredList;
	}

}
