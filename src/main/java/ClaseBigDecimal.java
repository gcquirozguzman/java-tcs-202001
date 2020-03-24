package main.java;

import java.math.BigDecimal;

public class ClaseBigDecimal {
	
	public static void main(String[] args) {
		
		double valor_1 = 0.01;
		double total_1 = valor_1 + valor_1;
		System.out.println("Resultado de la Suma es : "+total_1);
		
		double valor_2 = 0.01;
		double total_2 = valor_2 + valor_2 + valor_2 + valor_2 + valor_2 + valor_2;
		System.out.println("Resultado de la Suma es : "+total_2);
		
		BigDecimal valor;
		BigDecimal total;
		
		// Asignamos valor a BigDecimal
		valor = new BigDecimal("0.01");
		
		// Suma
		total = valor.add(valor);
		System.out.println("Resultado Suma : "+total);
		
		// Resta
		total = valor.subtract(valor);
		System.out.println("Resultado Suma : "+total);
		
		// Multiplicar
		total = valor.multiply(valor);
		System.out.println("Resultado Suma : "+total);
		
		// Dividir
		total = valor.divide(valor);
		System.out.println("Resultado Suma : "+total);
		
		// Prueba de Suma 6 Veces
		total = valor.add(valor).add(valor).add(valor).add(valor).add(valor);
		System.out.println("Resultado Suma : "+total);
		
	}
	
}

