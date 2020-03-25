package main.java;

public class ArregloAsignadoValores {
	
	public static void main(String[] args) {
		
		String[] mi_arreglo_string = new String[5];
		
		mi_arreglo_string[0] = "Letra A";
		mi_arreglo_string[1] = "Letra B";
		mi_arreglo_string[4] = "Letra C";
		
		System.out.println("Tamaño de arreglo es : "+mi_arreglo_string.length);
		System.out.println(mi_arreglo_string[0]);
		System.out.println(mi_arreglo_string[1]);
		System.out.println(mi_arreglo_string[2]);
		System.out.println(mi_arreglo_string[3]);
		System.out.println(mi_arreglo_string[4]);
		
		
		
		mi_arreglo_string = new String[5];
		
		mi_arreglo_string[0] = "Letra A";
		mi_arreglo_string[1] = "Letra B";
		mi_arreglo_string[2] = "Letra C";
		mi_arreglo_string[3] = "Letra D";
		mi_arreglo_string[4] = "Letra E";
		
		System.out.println("Tamaño de arreglo es : "+mi_arreglo_string.length);
		System.out.println(mi_arreglo_string[0]);
		System.out.println(mi_arreglo_string[1]);
		System.out.println(mi_arreglo_string[2]);
		System.out.println(mi_arreglo_string[3]);
		System.out.println(mi_arreglo_string[4]);
		
		
		
		
		
		mi_arreglo_string = new String[5];
		
		mi_arreglo_string[0] = "Letra A";
		mi_arreglo_string[1] = "Letra B";
		mi_arreglo_string[2] = "Letra C";
		mi_arreglo_string[3] = "Letra D";
		mi_arreglo_string[4] = "Letra E";
		
		mi_arreglo_string[2] = null;
		
		System.out.println("Tamaño de arreglo es : "+mi_arreglo_string.length);
		System.out.println(mi_arreglo_string[0]);
		System.out.println(mi_arreglo_string[1]);
		System.out.println(mi_arreglo_string[2]);
		System.out.println(mi_arreglo_string[3]);
		System.out.println(mi_arreglo_string[4]);
		
	}
	
}

