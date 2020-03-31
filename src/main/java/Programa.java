package main.java;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Programa {

	JFrame frame;
	JTextArea textArea = new JTextArea();
	JComboBox comboBox = new JComboBox();	
	ArrayList<String> ingredientes = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Programa window = new Programa();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Programa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 99, 376, 120);
		frame.getContentPane().add(scrollPane);
		
		scrollPane.setViewportView(textArea);
		
		comboBox.addItem("Seleccione Día");
		comboBox.addItem("Lunes");
		comboBox.addItem("Martes");
		comboBox.addItem("Miércoles");
		comboBox.addItem("Jueves");
		comboBox.addItem("Viernes");
		comboBox.addItem("Sábado");
		comboBox.addItem("Domingo");
		comboBox.setBounds(274, 68, 132, 20);
		frame.getContentPane().add(comboBox);
		
		JButton btnProcesar = new JButton("Guardar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Obtengo texto de Cuadro Texto
				String cuadro = textArea.getText();
				// Separo los valores cada vez que salta de linea
				String[] separated = cuadro.split("\n");
				// Recorro los valores
				
				
				ingredientes.add("Día Compra : "+comboBox.getSelectedItem());
				
				for (int i = 0; i < separated.length; i++) {
					// Almaceno los valores en un array
					ingredientes.add(separated[i]);
				}
				limpiar();
			}
		});
		btnProcesar.setBounds(30, 227, 100, 23);
		frame.getContentPane().add(btnProcesar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limpiar();
			}
		});
		btnLimpiar.setBounds(306, 227, 100, 23);
		frame.getContentPane().add(btnLimpiar);
		
		JLabel lblIngresarIngredientes = new JLabel("Ingresar Ingredientes:");
		lblIngresarIngredientes.setBounds(30, 71, 137, 14);
		frame.getContentPane().add(lblIngresarIngredientes);
		
		JLabel lblGeneradorDeLista = new JLabel("GENERADOR DE LISTA DE MERCADO");
		lblGeneradorDeLista.setBackground(Color.BLUE);
		lblGeneradorDeLista.setBounds(78, 23, 281, 23);
		frame.getContentPane().add(lblGeneradorDeLista);
		
		JButton button = new JButton("Generar Lista");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String listaTotal = "";
				for (int i = 0; i < ingredientes.size(); i++) {
					listaTotal = listaTotal + ingredientes.get(i) + "\n";
				}
				JOptionPane.showMessageDialog(null, listaTotal);
			}
		});
		button.setBounds(155, 227, 123, 23);
		frame.getContentPane().add(button);
		
		
	}
	
	public void limpiar() {
		// Limpio cuadro
		textArea.setText("");
		// vuelvo a posicion cuadro incial
		comboBox.setSelectedIndex(0);
	}
	
}
