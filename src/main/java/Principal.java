package main.java;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(VariablesSistema.ip_base_datos);
		
		VariablesSistema variablesSistema = new VariablesSistema();
		System.out.println(variablesSistema.puerto);
		
		//VariablesSistema.dias_semana = 20;
		
		Alumno alumno_1 = new Alumno("Gian", 50, 5);
		
		alumno_1.mensaje();
		
		// Clase Polimorfismo
		
		Persona persona_1 = new Persona();
		persona_1.saludar();
		
		Persona persona_2 = new Alumno();
		persona_2.saludar();
		
		Persona persona_3 = new Profesor();
		persona_3.saludar();
		
//		Alumno alumno = new Alumno();
//		alumno = new Persona();
		
		// Clases Abstractas
		Perro perro = new Perro();
		System.out.println(perro.getAtributo_animal_1());
		System.out.println(perro.getAtributo_animal_2());
		System.out.println(perro.getAtributo_animal_3());
		
		System.out.println(perro.getAtributo_perro_1());
		System.out.println(perro.getAtributo_perro_2());
		
	}
	
}
