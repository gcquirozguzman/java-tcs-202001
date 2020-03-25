package main.java;

public class Alumno extends Persona{
	
	private Integer grado_actual;

	public Alumno(String nombre, Integer dias, Integer grado_actual) {
		super(nombre, dias);
		this.grado_actual = grado_actual;
	}
	
	public Alumno(String nombre, Integer dias) {
		super(nombre, dias);
	}
	
	public void llamar_persona(){
		super.mensaje();
	}
	
	@Override
	public void mensaje(){
		System.out.println("Este es un mensaje de Alumno");
	}

	public Integer getGrado_actual() {
		return grado_actual;
	}

	public void setGrado_actual(Integer grado_actual) {
		this.grado_actual = grado_actual;
	}
	
}
