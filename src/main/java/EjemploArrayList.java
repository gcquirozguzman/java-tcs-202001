package main.java;

import java.util.ArrayList;

public class EjemploArrayList {
	
	public static void main(String[] args) {
		
		// Declarando ArrayList
		ArrayList<String> lista = new ArrayList<String>();
	    
		// Agregado valores
	    lista.add("valor 1");
	    lista.add("valor 2");
	    lista.add("valor 3");
	    lista.add("valor 4");
	    lista.add("valor 5");
	    lista.add("valor 6");
	    // ... Podemos seguir agregando los valores que queramos
	    
	    // Recorriendo ArrayList
	    for (int i=0;i<lista.size();i++) {
	      System.out.println(lista.get(i));
	    }

	 // Declarando ArrayList con Objeto
	ArrayList<Computador> listaComputador = new ArrayList<Computador>();
	    
	}
	
}

