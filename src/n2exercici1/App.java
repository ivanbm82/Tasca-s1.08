package n2exercici1;

import java.util.*;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lista1 = Arrays.asList("Ato", "Ana", "Ala", "Ivan", "lapiz");

		lista1.stream().filter(a -> (a.charAt(0) == 'A') && (a.length() == 3)).forEach(t -> System.out.println(t));

	}

}
