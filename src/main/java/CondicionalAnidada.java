package main.java;

public class CondicionalAnidada {
	
	public static void main(String[] args) {
		
		String persona = "Gian";
		Integer edad = 100;
		
		if(persona.equals("Juan")){
			if(edad == 10){
				System.out.println("Persona Juan con edad 10");
			}else{
				System.out.println("Persona Juan con edad diferente 10");
			}
		} else if(persona.equals("Alex")){
			if(edad == 30){
				System.out.println("Persona Alex con edad 30");
			}else{
				System.out.println("Persona Alex con edad diferente 10");
			}
		} else if(persona.equals("Gian")){
			if(edad == 100){
				System.out.println("Persona Gian con edad 100");
			}else{
				System.out.println("Persona Gian con edad diferente 100");
			}
		} else {
			if(edad == 28){
				System.out.println("Persona diferente a Gian, Juan y Alex con edad 28");
			}else{
				System.out.println("Persona diferente a Gian, Juan y Alex con edad diferente 28");
			}
		}
		
	}
	
}

