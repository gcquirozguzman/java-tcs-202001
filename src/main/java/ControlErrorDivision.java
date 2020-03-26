package main.java;

@SuppressWarnings("serial")
public class ControlErrorDivision extends Exception {
	ControlErrorDivision() {
        super("No es posible dividir entre cero");
    }
 }

