package main.java;

public class Persona {

	private String nombre;
	
	private Integer dias;

	public Persona(String nombre, Integer dias) {
		this.nombre = nombre;
		this.dias = dias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}
	
}
