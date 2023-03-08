package n1exercici7;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lista1 = Arrays.asList("2", "El pollo", "cocodrilo", "5", "la puerta esta cerrada");

		lista1.stream().sorted((s1, s2) -> s2.length() - s1.length()).forEach(System.out::println);

	}
}
