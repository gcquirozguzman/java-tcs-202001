package main.java;

public class CondicionalSwitch {
	
	public static void main(String[] args) {
		
		Integer dato_evaluar = 2;
		
		switch(dato_evaluar){
			case 1:
				System.out.println("El valor es 1");
				break;
			case 2:
				System.out.println("El valor es 2");
				break;
			case 3:
				System.out.println("El valor es 3");
				break;
			default:
				System.out.println("El valor no es 1, 2 o 3");
				break;
		}
		
		String dia_actual = "LUNES";
		
		switch(dia_actual){
			case "LUNES":
				System.out.println("Hoy es Lunes");
				break;
			case "MARTES":
				System.out.println("Hoy es Martes");
				break;
			case "MIERCOLES":
				System.out.println("Hoy es Miercoles");
				break;
			case "JUEVES":
				System.out.println("Hoy es Jueves");
				break;
			case "VIERNES":
				System.out.println("Hoy es Viernes");
				break;
			default:
				System.out.println("Hoy es Sabado o Domingo");
				break;
		}
		
	}
	
}

