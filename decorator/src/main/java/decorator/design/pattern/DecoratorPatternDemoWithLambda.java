package decorator.design.pattern;

import java.util.Arrays;
import java.util.List;

import decorator.design.pattern.model.FilterCriteria;
import decorator.design.pattern.model.GenericFilter;

public class DecoratorPatternDemoWithLambda {

	public static void main(String[] args) {
		
		List<Integer> integerList = Arrays.asList(2, 4, 11, 66, 9, 0, 3, 7,78,888,564,3467,89765,100,874);
		List<String> stringList = Arrays.asList("java","python","",".net","c#","","","","","","scala","","","go");
		
		//creating criteria with lambda
		FilterCriteria<Integer> evenNumberCriteria = number -> number % 2 == 0;
		
		FilterCriteria<Integer> oddNumberCriteria = number -> !(number % 2 == 0);
		
		FilterCriteria<Integer> multipleOf5NumberCriteria = number -> number % 5 == 0;
		
		FilterCriteria<String> emptyStringRemoveCriteria = string -> !string.isEmpty();
		
		GenericFilter<Integer> evenNumberFilter = new GenericFilter(evenNumberCriteria);
		List<Integer> evenFilteredList = evenNumberFilter.filterList(integerList);
		System.out.println("evenFilteredList :: " + evenFilteredList);

		GenericFilter<Integer> oddNumberFilter = new GenericFilter(oddNumberCriteria);
		List<Integer> oddFilteredList = oddNumberFilter.filterList(integerList);
		System.out.println("oddFilteredList :: " + oddFilteredList);
		
		GenericFilter<Integer> multipleOf5NumberFilter = new GenericFilter(multipleOf5NumberCriteria);
		List<Integer> multipleOf5FilteredList = multipleOf5NumberFilter.filterList(integerList);
		System.out.println("multipleOf5FilteredList :: " + multipleOf5FilteredList);
		
		GenericFilter<String> emptyStringRemoveFilter = new GenericFilter(emptyStringRemoveCriteria);
		List<String> emptyStringRemoveFilteredList = emptyStringRemoveFilter.filterList(stringList);
		System.out.println("emptyStringRemoveFilteredList :: " + emptyStringRemoveFilteredList);

	}

}
