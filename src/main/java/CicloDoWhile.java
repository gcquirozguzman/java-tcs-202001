package main.java;

public class CicloDoWhile {
	
	public static void main(String[] args) {
		
		int u = 0;
		do {
			System.out.println("Valor actual de u es : "+u);
			u++;
		} while (u < 5);
		
		int i = 0;
		
		do {
			if(i == 4){
				break;
			} else{
				System.out.println("Valor actual de i es : "+i);
			}
		} while (true);
		
	}
	
}

