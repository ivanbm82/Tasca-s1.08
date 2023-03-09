package pruebaethod;

import java.util.Arrays;
import java.util.List;

public class app {
	public static void main(String[] args) {

	List<Integer> numbers = Arrays.asList(5, 3, 50, 24, 40, 2, 9, 18);
	numbers.stream()
	  .sorted(Integer::compareTo).forEach(System.out::println);
	
	}
}
