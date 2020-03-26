package main.java;

import java.util.HashMap;

public class EjemploHashMap {
	
	public static void main(String[] args) {
		
		// Creando un HashMap
	    HashMap<String, String> valores = new HashMap<String, String>();

	    // Agregar Valores
	    valores.put("Puerto", "8080");
	    valores.put("IP", "192.168.1.1");
	    valores.put("Servidor", "SERVIDOR_7654");
	    System.out.println("Obtener todos los valores : "+valores);
		
	    // Obteniendo valor "Puerto"
	    System.out.println("Obtener valor puesto : "+valores.get("Puerto"));
	    
	    // Eliminando valor "Servidor"
	    valores.remove("Servidor");
	    System.out.println("Obtener todos los valores : "+valores);
	    
	    // Obteniendo tamaño de lista
	    System.out.println("Tamaño : "+valores.size());
	    
	    // Recorriendo con Bucle
	    for (String i : valores.keySet()) {
    	  System.out.println("Listado Bucle : "+i);
    	}
	    
	    // Borrando todos los valores
	    valores.clear();
	    System.out.println("Obtener todos los valores : "+valores);

	}
	
}

