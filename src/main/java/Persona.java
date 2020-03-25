package main.java;

public class Persona {

	private String nombre;
	
	private Integer edad;
	
	public void saludar(){
		System.out.println("Hola soy una Persona");
	}
	
	public Persona(){
		
	}
	
	public void mensaje(){
		System.out.println("Este es un mensaje de Persona");
	}

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
