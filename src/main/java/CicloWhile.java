package main.java;

public class CicloWhile {
	
	public static void main(String[] args) {
		
		int e = 0;
		while(e < 5){
			e++;
			System.out.println("Valor de e: "+e);
		}
		
		int a = 0;
		while(true){
			a++;
			if(a==5){
				System.out.println("Finalizar bucle");
				break;
			}else{
				System.out.println("Valor de a : "+a);
			}
		}
		
	}
	
}

