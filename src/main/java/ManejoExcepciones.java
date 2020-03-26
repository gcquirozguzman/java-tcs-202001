package main.java;

public class ManejoExcepciones {
	
	public static void main(String[] args) {
		
		// Primer ejemplo
		
		try {
			// Llamando a la base de datos (Para forzar el error pondre una division entre 0)
			Integer resultado = 9/0;
		} catch (Exception e) {
			// Si la base de datos no esta disponible produciria un error
			// Ante ese error nuestro aplicativo nos manda a esta parte
			System.out.println("Hay un error. Ahora que hacemos?");
			// Esto nos permite, que ante el error, tengamos una desicion de que hacer
			// Podriamos enviar un mensaje al usuario, cerrar la sesion, etc.. 
		} finally {
			System.out.println("Me ejecuto siempre al final");
		}
		
		// Segundo ejemplo
		
		try {
			division(9,0);
		} catch (ControlErrorDivision e) {
			System.out.println(e);
		} finally {
			System.out.println("Me ejecuto siempre al final");
		}
		
	}
	
	static int division(int a, int b) throws ControlErrorDivision{
		if(b == 0){
			throw new ControlErrorDivision();
		}
		return a/b;
	}
	
}

