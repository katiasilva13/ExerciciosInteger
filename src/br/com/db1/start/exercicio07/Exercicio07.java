package br.com.db1.start.exercicio07;

import java.util.Scanner;

public class Exercicio07 {

	private Scanner in;
	private Integer numero;
	public Impares impar = new Impares();

	private void dados() {

		in = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		numero = in.nextInt();

		impar.ate100(numero);
	}

	public static void main(String[] args) {

		Exercicio07 run = new Exercicio07();
		run.dados();

	}
}
