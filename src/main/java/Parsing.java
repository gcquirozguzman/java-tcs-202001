package main.java;

public class Parsing {
	public static void main(String[] args) {
		
		String texto = "2050";
		
		Integer entero = Integer.parseInt(texto);
		
		Double decimal = Double.parseDouble(texto);
		
		System.out.println("Salida entero : "+entero);
		
		System.out.println("Salida decimal : "+decimal);
		
	}
}

