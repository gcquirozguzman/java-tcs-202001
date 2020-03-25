package main.java;

public interface AccionesAlumno {

	void estudiar();
	
	Integer obtenerNota();
	
	String obtenerNombre();
	
	String obtenerNombre(String codigoAlumno);
	
//	default void despedirse(){
//		System.out.println("Nos vemos");
//	}
	
}
