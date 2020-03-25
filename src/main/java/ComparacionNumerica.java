package main.java;

import java.math.BigDecimal;

public class ComparacionNumerica {
	
	public static void main(String[] args) {
		
		// Comparacion Enteros
		
		Integer valor_1_1 = 10;
		Integer valor_1_2 = 20;
		
		System.out.println(valor_1_1 < valor_1_2);
		System.out.println(valor_1_1 > valor_1_2);
		System.out.println(valor_1_1 <= valor_1_2);
		System.out.println(valor_1_1 >= valor_1_2);
		System.out.println(valor_1_1 == valor_1_2);
		System.out.println(valor_1_1 != valor_1_2);
		
		// Comparacion Decimales
		
		Double valor_2_1 = 10.0;
		Double valor_2_2 = 20.0;
		
		System.out.println("Resultado comparacion " + Double.compare(valor_2_1, valor_2_2));
		
		// Comparacion BigDecimales
		
		BigDecimal valor_3_1 = new BigDecimal("10.0");
		BigDecimal valor_3_2 = new BigDecimal("20.0");
		
		System.out.println("Resultado comparacion " + valor_3_1.compareTo(valor_3_2));
		
	}
	
}

