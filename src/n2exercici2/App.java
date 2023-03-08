package n2exercici2;

import java.util.*;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println(cadenaNumeros(listaNumeros));

	}

	public static String cadenaNumeros(List<Integer> listaNumeros) {

		return listaNumeros.stream().map(a -> {
			if (a % 2 == 0)
				return "e" + a;
			else
				return "o" + a;
		}).collect(Collectors.joining(","));

	}

}
