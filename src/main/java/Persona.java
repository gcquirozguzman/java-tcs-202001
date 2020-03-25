package main.java;

public class Persona {

	private String nombre;
	
	private Integer edad;

	public Persona(String nombre, Integer edad) {
		this.nombre = nombre;
		this.setEdad(edad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

}
