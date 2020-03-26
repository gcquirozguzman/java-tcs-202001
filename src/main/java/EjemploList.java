package main.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class EjemploList {
	
	public static void main(String[] args) {
		
		List a = new ArrayList();
		List b = new LinkedList();
		List c = new Vector(); 
		List d = new Stack(); 
		
		// Creando list 
        List<Integer> listadoNotas = new ArrayList<Integer>(); 
        
        // Agregando valor en la posicion 0
        listadoNotas.add(0, 18);
        // Agregando valor en la posicion 1
        listadoNotas.add(1, 17);
        
        // Consultando valores
        System.out.println(listadoNotas);
        
        // Creando list
        List<String> listaNombres = new ArrayList<String>(); 
        // Agregando valor sin indicar posicion
        // Por defecto se almacenan de forma consecutiva
        listaNombres.add("Gian"); 
        listaNombres.add("Shester"); 
        listaNombres.add("Java"); 
        
        // Consultando valores
        System.out.println(listaNombres);
        
        // Creando list 
        List<Integer> listadoEdades = new ArrayList<Integer>(); 
        listadoEdades.add(20);
        listadoEdades.add(30);
        
        // Agregando lista de edades a la lista de notas
        // Se agrega la lista de edades en el lugar indicado
        listadoNotas.addAll(1, listadoEdades); 
        System.out.println(listadoNotas); 

        // Eliminando elemento
        listadoNotas.remove(1); 
        System.out.println(listadoNotas); 
  
        // Consultando elemento en posicion 2
        System.out.println(listadoNotas.get(2)); 
  
        // Reemplazando elemento en posicion 1 con otro valor 
        listadoNotas.set(1, 99); 
        System.out.println(listadoNotas); 
        
        // Recorriendo List con bucle
        for (int i = 0; i < listadoNotas.size(); i++) {
        	System.out.println(listadoNotas.get(i));
		}
        
	}
	
}

