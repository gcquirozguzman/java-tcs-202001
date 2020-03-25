package main.java;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(VariablesSistema.ip_base_datos);
		
		VariablesSistema variablesSistema = new VariablesSistema();
		System.out.println(variablesSistema.puerto);
		
		//VariablesSistema.dias_semana = 20;
		
		Alumno alumno_1 = new Alumno("Gian", 50, 5);
		
		alumno_1.mensaje();
		
	}
	
}
