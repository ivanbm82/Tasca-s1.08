package n2exercici3;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionalInterface suma = (n1,n2) ->n1+n2;
		
		FunctionalInterface resta = (n1,n2)->n1-n2;
		
		FunctionalInterface multiplicacion = (n1,n2)->n1*n2;
		
		FunctionalInterface division = (n1,n2)->n1/n2;
		
		System.out.println(suma.operacio(2, 3));
		
		
	}
	
}

