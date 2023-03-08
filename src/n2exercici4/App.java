package n2exercici4;

import java.util.*;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lista1 = Arrays.asList("2", "El pollo", "coc3odrilo", "5", "lA puerta esta cerrada");

		System.out.println(o1(lista1));
		System.out.println(o2(lista1));
		System.out.println(o3(lista1));
		System.out.println(o4(lista1));

	}

	private static List<String> o1(List<String> lista1) {
		return lista1.stream().sorted().collect(Collectors.toList());
	}

	public static List<String> o2(List<String> lista1) {
		List<String> listaE = lista1.stream().filter(a -> a.contains("e") || a.contains("E"))
				.collect(Collectors.toList());

		listaE.addAll(((lista1).stream().filter(a -> !a.contains("e")).collect(Collectors.toList())));

		return listaE;

	}

	public static List<String> o3(List<String> lista1) {
		return lista1.stream().map(a -> a.toLowerCase().replace("a", "4")).collect(Collectors.toList());
	}

	public static List<String> o4(List<String> lista1) {
		return lista1.stream().filter(a -> a.chars().allMatch(value -> Character.isDigit(value)))
				.collect(Collectors.toList());
	}

}
