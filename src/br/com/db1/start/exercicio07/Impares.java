package br.com.db1.start.exercicio07;

public class Impares {

	private int contador;

	public void ate100 (Integer numero) {
	
		for (contador=0;contador < 100 ; contador++) {
			if (numero % 2 != 0 && numero < 100) {
				
				System.out.println(numero);
				numero+=2;
			}
		}
		
	}
		
	
}
