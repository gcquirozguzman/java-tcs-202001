package main.java;

public class AccionesAlumnoImpl implements AccionesAlumno, AccionesAlumno2{

	@Override
	public void estudiar() {
		System.out.println("Hola estoy estudiando");
	}

	@Override
	public Integer obtenerNota() {
		return 20;
	}

	@Override
	public String obtenerNombre() {
		return "Gian";
	}

	@Override
	public String obtenerNombre(String codigoAlumno) {
		return "Soy Gian y mi código es "+codigoAlumno;
	}

	@Override
	public void reprueba() {
		System.out.println("Usted ha reprobado u.u");
	}
	
}
