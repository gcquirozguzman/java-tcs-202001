package main.java;

public class Profesor extends Persona{

	private String especialidad;

	public void saludar(){
		System.out.println("Hola soy un Profesor");
	}
	
	public Profesor(){
		
	}
	
	public Profesor(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
}