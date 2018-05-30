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
		assertEquals("A soma dos valores � = 6", soma.somar(3, 3));
	}

	@Test
	public void subtrairTest() {
		assertEquals("A subtra��o dos valores � = 2", subtracao.subtrair(21, 19));
	}

	@Test
	public void multiplicarTest() {
		assertEquals("A multiplica��o dos valores � = 4", multiplicacao.multiplicar(2, 2));
	}

	@Test
	public void dividirTest() {
		assertEquals("A divis�o dos valores � = 2", divisao.dividir(4, 2));
	}

	@Test
	public void parTest() {
		assertEquals("O n�mero: 3 � �mpar.", ehPar.par1(3));
		assertEquals("O n�mero: 32 � par.", ehPar.par1(32));

		assertEquals("O n�mero: 3 � �mpar.", ehPar.par2(3));
		assertEquals("O n�mero: 32 � par.", ehPar.par2(32));
	}

	@Test
	public void maiorQueTest() {
		assertEquals("O primeiro n�mero � o maior.", maiorQue.maiorQue(3, 2));
		assertEquals("Os n�meros s�o iguais.", maiorQue.maiorQue(10, 10));
		assertEquals("O segundo n�mero � o maior.", maiorQue.maiorQue(13, 27));

	}

}
