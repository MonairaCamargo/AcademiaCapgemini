package br.com.capgemini.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.capgemini.Questao02;

/**
 * 
 * @author Monaira Barbosa da Silva Camargo
 * 
 *         Classe de Teste Unit�rio da Quest�o 02 - Academia Java 2022 da
 *         Capgemini.
 * 
 */
public class TestQuestao02 {

	@Test
	public void testaSenhaIgualLimite() {
		// Cen�rio
		Questao02 q2 = new Questao02();

		// A��o
		int qtdCaracteres = q2.verificaSenha("1a3b5@");

		// Verifica��o
		Assert.assertEquals(qtdCaracteres, 0);

	}

	@Test
	public void testaSenhaMenorLimite() {
		// Cen�rio
		Questao02 q2 = new Questao02();

		// A��o
		int qtdCaracteres = q2.verificaSenha("1a3b5");

		// Verifica��o
		Assert.assertEquals(qtdCaracteres, 1);

	}

	@Test
	public void testaSenhaMaiorLimite() {
		// Cen�rio
		Questao02 q2 = new Questao02();

		// A��o
		int qtdCaracteres = q2.verificaSenha("1a3b5@3");

		// Verifica��o
		Assert.assertEquals(qtdCaracteres, -1);

	}

}
