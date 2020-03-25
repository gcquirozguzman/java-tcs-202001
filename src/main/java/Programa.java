package main.java;

import javax.swing.JOptionPane;

public class Programa {
	
	public static void main(String[] args) {
		
		// ShowMessageDialog
		
		JOptionPane.showMessageDialog(null, "Mensaje");
		JOptionPane.showMessageDialog(null, "Mensaje", "Titulo", JOptionPane.ERROR_MESSAGE);
		
		// ShowInputDialog
		
		String respuesta = JOptionPane.showInputDialog("Cuanto es 1 + 1?");
		System.out.println("El valor ingresado es "+respuesta);
		
		respuesta = JOptionPane.showInputDialog("Cuanto es 1 + 1?", "La respuesta es 2");
		System.out.println("El valor ingresado es "+respuesta);
		
		respuesta = JOptionPane.showInputDialog(null, "Ingrese su clave nuevamente", "Error!", JOptionPane.ERROR_MESSAGE);
		System.out.println("El valor ingresado es "+respuesta);
		
		String[] alumnos = {
				"Alumno 1",
				"Alumno 2",
				"Alumno 3"
		};
		
		respuesta = (String) JOptionPane.showInputDialog(null, "Seleccione Alumno", "Jalados", JOptionPane.DEFAULT_OPTION, null, alumnos, alumnos[2]);
		System.out.println("El valor ingresado es "+respuesta);
		
		// ShowConfirmDialog
		
		int respuesta2 = JOptionPane.showConfirmDialog(null, "¿Está seguro?");
		System.out.println("El valor ingresado es "+respuesta2);		
		
		respuesta2 = JOptionPane.showConfirmDialog(null, "¿Está seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
		System.out.println("El valor ingresado es "+respuesta2);
		
		respuesta2 = JOptionPane.showConfirmDialog(null, "¿Está seguro?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
		System.out.println("El valor ingresado es "+respuesta2);
	
		// ShowOptionDialog
		String options[] = {
				"Carne",
				"Pollo",
				"Agua",
				"Azucar"
		};
		int seleccion = JOptionPane.showOptionDialog(null, "Que opcion deseas?", "Lista de Compras", JOptionPane.DEFAULT_OPTION, 
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		System.out.println("El valor ingresado es "+seleccion);
	}
	
}
