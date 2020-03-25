package main.java;

public class OperadorTernario {
	
	public static void main(String[] args) {
		
		String dia_actual = "LUNES";
		Integer hora_actual = 15;
		String resultado;
		
		if(dia_actual.equals("LUNES")){
			resultado = "Hoy es lunes";
		} else {
			resultado = "Hoy no es lunes";
		}
		
		System.out.println("Salida 1: "+resultado);
		
		resultado = (dia_actual.equals("LUNES"))? "Hoy es lunes":"Hoy no es lunes";
		
		System.out.println("Salida 2: "+resultado);
		
		if(dia_actual.equals("LUNES")){
			if(hora_actual == 15){
				resultado = "Hoy es lunes y la hora es 15";
			}else{
				resultado = "Hoy es lunes y la hora no es 15";
			}
		} else {
			resultado = "Hoy no es lunes";
		}
		
		System.out.println("Salida 1: "+resultado);
		
		resultado = (dia_actual.equals("LUNES"))? ((hora_actual == 15)?"Hoy es lunes y la hora es 15":"Hoy es lunes y la hora no es 15"):"Hoy no es lunes";
		
		System.out.println("Salida 2: "+resultado);
		
	}
	
}

