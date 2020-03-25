package main.java;

public class Alumno extends Persona{
	
	private Integer grado_actual;

	public Alumno(String nombre, Integer dias, Integer grado_actual) {
		super(nombre, dias);
		this.grado_actual = grado_actual;
	}

	public Integer getGrado_actual() {
		return grado_actual;
	}

	public void setGrado_actual(Integer grado_actual) {
		this.grado_actual = grado_actual;
	}
	
}
