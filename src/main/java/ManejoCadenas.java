package main.java;

public class ManejoCadenas {
	
	public static void main(String[] args) {
		
		String cadena = "      Hola me llamo Gian     ";
		String nueva_cadena = null;
		
		// Retirar espacio de los lados
		nueva_cadena = cadena.trim();
		System.out.println("Usando trim : "+nueva_cadena);
		
		// Obtener tamaño de cadena
		Integer tamanio = cadena.length();
		System.out.println("Usando length : "+tamanio);
		
		// Convertir en Mayuscula toda la cadena
		nueva_cadena = cadena.toUpperCase();
		System.out.println("Usando UpperCase : "+nueva_cadena);
		
		// Convertir en Minuscula toda la cadena
		nueva_cadena = cadena.toLowerCase();
		System.out.println("Usando LowerCase : "+nueva_cadena);
		
		// Obtener parte de la cadena. Desde el inicio hasta la posicion 2
		nueva_cadena = cadena.substring(0, 2);
		System.out.println(nueva_cadena);
		
		
		
		
		String cadena2 = "Hola mundo Java";
		
		// Buscar la palabra Java en la cadena
		System.out.println(cadena2.contains("Java"));
		
		// Verificar si la cadena empieza con H
		System.out.println(cadena2.startsWith("H"));
		
		// Veriricar si la cadena termina con a
		System.out.println(cadena2.endsWith("a"));
		
		// Unir la cadena a " soy Gian"
		System.out.println(cadena2.concat(" soy Gian"));
		
		
		
		
		
		String cadena_1 = "Hola me llamo Gian";
		String cadena_2 = "hola me llamo gian";
		
		// Comparar 2 cadenas
		System.out.println("Resultado de comparacion : "+cadena_1.equals(cadena_2));
		
		// Comparar 2 cadenas ignorando mayusculas y minusculas (0 = coincidencia)
		System.out.println("Resultado de comparacion : "+cadena_1.compareToIgnoreCase(cadena_2));
		
	}
	
}

