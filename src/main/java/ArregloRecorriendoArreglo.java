package main.java;

public class ArregloRecorriendoArreglo {
	
	public static void main(String[] args) {
		
		String[] mi_arreglo_string = new String[5];
		
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
		
		for (int i = 0; i < mi_arreglo_string.length; i++) {
			System.out.println(mi_arreglo_string[i]);
		}
		
		for (int i = 0; i < mi_arreglo_string.length; i=i+2) {
			System.out.println(mi_arreglo_string[i]);
		}
		
	}
	
}

