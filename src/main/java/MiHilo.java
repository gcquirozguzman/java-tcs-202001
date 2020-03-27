package main.java;

public class MiHilo extends Thread {
	
	private String carro;
	private Integer velocidad;

	public MiHilo(String c, Integer v) {
		carro = c;
		velocidad = v;
	}

	public void run() {
		for (int i = 0; i < 1000; i=i+velocidad) {

			System.out.println(carro);
			System.out.flush();
		}
	}

	public static void main(String[] args) {
		Thread tP = new MiHilo("CarroA",8);
		Thread tp = new MiHilo("CarroB",1);
		tp.start();
		tP.start();
	}
}
