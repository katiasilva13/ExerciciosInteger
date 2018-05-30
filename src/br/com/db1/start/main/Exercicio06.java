package br.com.db1.start.main;

public class Exercicio06 {

	public String maiorQue(Integer valor1, Integer valor2) {
		if (valor1 > valor2) {
			return "O primeiro número é o maior.";
		} else if (valor1 == valor2) {
			return "Os números são iguais.";
		}
		return "O segundo número é o maior.";

	}

}
