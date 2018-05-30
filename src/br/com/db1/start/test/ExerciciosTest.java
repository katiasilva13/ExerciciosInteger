package br.com.db1.start.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.db1.start.main.Exercicio01;
import br.com.db1.start.main.Exercicio02;
import br.com.db1.start.main.Exercicio03;
import br.com.db1.start.main.Exercicio04;
import br.com.db1.start.main.Exercicio05;
import br.com.db1.start.main.Exercicio06;

class ExerciciosTest {

	Exercicio01 soma = new Exercicio01();
	Exercicio02 subtracao = new Exercicio02();
	Exercicio03 multiplicacao = new Exercicio03();
	Exercicio04 divisao = new Exercicio04();
	Exercicio05 ehPar = new Exercicio05();
	Exercicio06 maiorQue = new Exercicio06();

	@Test
	public void somarTest() {
		assertEquals("A soma dos valores é = 6", soma.somar(3, 3));
	}

	@Test
	public void subtrairTest() {
		assertEquals("A subtração dos valores é = 2", subtracao.subtrair(21, 19));
	}

	@Test
	public void multiplicarTest() {
		assertEquals("A multiplicação dos valores é = 4", multiplicacao.multiplicar(2, 2));
	}

	@Test
	public void dividirTest() {
		assertEquals("A divisão dos valores é = 2", divisao.dividir(4, 2));
	}

	@Test
	public void parTest() {
		assertEquals("O número: 3 é ímpar.", ehPar.par1(3));
		assertEquals("O número: 32 é par.", ehPar.par1(32));

		assertEquals("O número: 3 é ímpar.", ehPar.par2(3));
		assertEquals("O número: 32 é par.", ehPar.par2(32));
	}

	@Test
	public void maiorQueTest() {
		assertEquals("O primeiro número é o maior.", maiorQue.maiorQue(3, 2));
		assertEquals("Os números são iguais.", maiorQue.maiorQue(10, 10));
		assertEquals("O segundo número é o maior.", maiorQue.maiorQue(13, 27));

	}

}
