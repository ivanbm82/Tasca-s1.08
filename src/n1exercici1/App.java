package n1exercici1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lista1 = Arrays.asList("gato", "pollo", "cocodrilo", "ivan", "lapiz");

		List<String> listaFiltrada = lista1.stream()
				.filter((a) -> a.contains("o"))
				.collect(Collectors.toList());
		listaFiltrada.forEach(a -> System.out.println(a));

	}

}
