package main.java;

public class EnumEjemplo {
	public static void main(String[] args) {
		
		// Ejemplo simple
		//System.out.println(DiasSemana.LUNES);
		
		// Ejemplo complejo
		System.out.println(MonedaEnum.SOLES.getCodigo());
		System.out.println(MonedaEnum.SOLES.getDiminutivo());
		System.out.println(MonedaEnum.SOLES.getNombreGenerico());
	}
}

