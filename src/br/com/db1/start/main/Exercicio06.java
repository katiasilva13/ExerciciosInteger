package br.com.db1.start.main;

public class Exercicio06 {

	public String maiorQue(Integer valor1, Integer valor2) {
		if (valor1 > valor2) {
			return "O primeiro n�mero � o maior.";
		} else if (valor1 == valor2) {
			return "Os n�meros s�o iguais.";
		}
		return "O segundo n�mero � o maior.";

	}

}
