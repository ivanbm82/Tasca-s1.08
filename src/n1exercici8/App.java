package n1exercici8;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverseInterface palabra = palabra1 -> {

			StringBuilder stringBuilder = new StringBuilder(palabra1);
			return stringBuilder.reverse().toString();

		};
		System.out.println(palabra.myReverse("hola, como estas"));
	}
}
