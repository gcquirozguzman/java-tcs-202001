package main.java;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		Integer valor_1 = 20;
		Integer valor_2 = 15;
		Integer resultado;
		
		// Suma
		resultado = valor_1 + valor_2;
		System.out.println("Salida suma : "+resultado);
		
		// Resta
		resultado = valor_1 - valor_2;
		System.out.println("Salida resta : "+resultado);

		// Multiplicacion
		resultado = valor_1 * valor_2;
		System.out.println("Salida multiplicacion : "+resultado);

		// Division
		resultado = valor_1 / valor_2;
		System.out.println("Salida division : "+resultado);

		// Resto
		resultado = valor_1 % valor_2;
		System.out.println("Salida resto : "+resultado);
		
		// x--
		valor_1--;
		System.out.println(valor_1);
		
		// x++
		valor_1++;
		System.out.println(valor_1);
		
		// x+=y
		valor_1+=valor_2;
		System.out.println(valor_1);
		
		// x-=y
		valor_1-=valor_2;
		System.out.println(valor_1);
		
		// x*=y
		valor_1*=valor_2;
		System.out.println(valor_1);
		
		// x/=y
		valor_1/=valor_2;
		System.out.println(valor_1);
		
		// x%=y
		valor_1%=valor_2;
		System.out.println(valor_1);
		
	}
	
}
