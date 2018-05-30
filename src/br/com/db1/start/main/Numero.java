package br.com.db1.start.main;

import java.util.Scanner;

public class Numero {

	private Scanner entrada;

	public Exercicio01 soma = new Exercicio01();
	public Exercicio02 subtracao = new Exercicio02();
	public Exercicio03 multiplicacao = new Exercicio03();
	public Exercicio04 divisao = new Exercicio04();
	public Exercicio05 ehPar = new Exercicio05();
	public Exercicio06 maiorQue = new Exercicio06();

	private void recebeEntrada() {

		entrada = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		Integer valor1 = entrada.nextInt();
		System.out.println(ehPar.par1(valor1));

		System.out.println("Digite um número inteiro: ");
		Integer valor2 = entrada.nextInt();
		System.out.println(ehPar.par2(valor2));

		System.out.println(soma.somar(valor1, valor2));
		System.out.println(subtracao.subtrair(valor1, valor2));
		System.out.println(multiplicacao.multiplicar(valor1, valor2));
		System.out.println(divisao.dividir(valor1, valor2));

		System.out.println(maiorQue.maiorQue(valor1, valor2));

	}

	public static void main(String[] args) {

		Numero executar = new Numero();
		executar.recebeEntrada();

	}

}
