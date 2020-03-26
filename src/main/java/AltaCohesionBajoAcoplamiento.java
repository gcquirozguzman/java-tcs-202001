package main.java;

import java.util.HashMap;
import java.util.Map;

public class AltaCohesionBajoAcoplamiento {
	
	public static void main(String[] args) {
		calcularNotasAlumno();
		calificarProfesor();
	}
	
	static void calcularNotasAlumno(){
		Map<Integer, Integer> nota = obtenerNotasAlumno();
		Integer notasSumadas = sumarNotas(nota);
		mostrarNotas(notasSumadas);
	}
	
	static void calificarProfesor(){
		Map<Integer, Integer> nota = obtenerNotasProfesor();
		Integer notasSumadas = sumarNotas(nota);
		mostrarNotas(notasSumadas);
	}
	

	private static void mostrarNotas(Integer notasSumadas) {
		System.out.println("La suma de todas tus notas es : "+notasSumadas);
	}

	private static Integer sumarNotas(Map<Integer, Integer> nota) {
		Integer nota1 = nota.get(1);
		Integer nota2 = nota.get(2);
		return nota1 + nota2;
	}

	private static Map<Integer, Integer> obtenerNotasAlumno() {
		Map<Integer, Integer> nota = new HashMap<Integer, Integer>();
		nota.put(1, 16);
		nota.put(2, 18);
		return nota;
	}
	
	private static Map<Integer, Integer> obtenerNotasProfesor() {
		Map<Integer, Integer> nota = new HashMap<Integer, Integer>();
		nota.put(1, 16);
		nota.put(2, 14);
		return nota;
	}
	
}

