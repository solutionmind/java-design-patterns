package decorator.design.pattern;

import java.util.Arrays;
import java.util.List;

import decorator.design.pattern.model.EvenNumberFilter;
import decorator.design.pattern.model.GenericFilter;
import decorator.design.pattern.model.OddNumberFilter;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,4,11,66,9,0,3,7);
		
		Integer i = 6;
		
		GenericFilter<Integer> evenFilter = new GenericFilter(new EvenNumberFilter(i));
		
		List<Integer> evenFilteredList = evenFilter.filterList(list);
		
		GenericFilter<Integer> oddFilter = new GenericFilter(new OddNumberFilter(i));
		
		List<Integer> oddFilteredList = oddFilter.filterList(list);
		
		System.out.println("evenFilteredList : "  + evenFilteredList);
		
		System.out.println("oddFilteredList : "  + oddFilteredList);

	}
	
}
