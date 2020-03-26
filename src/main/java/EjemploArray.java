package main.java;

public class EjemploArray {
	
	public static void main(String[] args) {
		
		// Declaramos Array
		String[] alumnos;

		// Declaramos un Array con Valores
		String[] cursos = {"Java", "CSS", "JS", "HTML"};		
		int[] notasAlumnos = {15, 16, 20, 16};
		
		// Podemos obtener un valor indicando el espacio del Array que ocupa
		System.out.println(cursos[0]);
		System.out.println(cursos[1]);
		System.out.println(cursos[2]);
		System.out.println(cursos[3]);
		
		System.out.println(notasAlumnos[0]);
		System.out.println(notasAlumnos[1]);
		System.out.println(notasAlumnos[2]);
		System.out.println(notasAlumnos[3]);
		
		// Podemos modificar un valor del Array y luego volver a consultarlo
		cursos[2] = "C++";
		System.out.println(cursos[0]);
		System.out.println(cursos[1]);
		System.out.println(cursos[2]);
		System.out.println(cursos[3]);
		
		// Podemos recorrer los valores de Array con un bucle
		for (String i : cursos) {
		  System.out.println("Valor cursos : "+i);
		}
		
		for (int i : notasAlumnos) {
		  System.out.println("Valor notas alumnos : "+i);
		}
		
		// Es posible usar un array en arreglo
		int[][] arregloNotasGrupo = { {12, 18, 16, 20}, {16, 14, 19} };
		
		// De la misma forma podemos obtener sus datos
		
		// Obteniendo valor {12, 18, 16, 20}
		System.out.println(arregloNotasGrupo[0][0]);
		System.out.println(arregloNotasGrupo[0][1]);
		System.out.println(arregloNotasGrupo[0][2]);
		System.out.println(arregloNotasGrupo[0][3]);
		
		// Obteniendo valores {16, 14, 19}
		System.out.println(arregloNotasGrupo[1][0]);
		System.out.println(arregloNotasGrupo[1][1]);
		System.out.println(arregloNotasGrupo[1][2]);
	
		// Es posible tambien recorrerlos con un bucle doble
		for (int i = 0; i < arregloNotasGrupo.length; ++i) {
	      for(int j = 0; j < arregloNotasGrupo[i].length; ++j) {
	        System.out.println("Recorriendo con bucle : "+arregloNotasGrupo[i][j]);
	      }
	    }
		
		
	}
	
}

