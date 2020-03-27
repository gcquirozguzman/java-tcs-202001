package main.java;

public class Vehiculo {
	
	private String color;	
	private String marca;	
	private String modelo;	
	private Integer peso;
	
	public Vehiculo(String color, String marca, String modelo, Integer peso) {
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.peso = peso;
	}
	
	public Vehiculo(String color, String marca, String modelo) {
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
	}
	
//	public Vehiculo(String color, String marca, String modelo, Integer peso) {
//		this.color = color;
//		this.marca = marca;
//		this.modelo = modelo;
//		this.peso = peso;
//	}
	
	public void mostrarColor(String color){
		System.out.println("Color recibido es "+color);
	}
	
//	public void mostrarColor(String color){
//		System.out.println("Color recibido es "+color);
//	}
	
	public void mostrarColor(){
		System.out.println("Color recibido es Blanco");
	}
	
	public void mostrarColor(String color, String mensaje){
		System.out.println("Color recibido es "+color+" . El mensaje es : "+mensaje);
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getPeso() {
		return peso;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	
}

