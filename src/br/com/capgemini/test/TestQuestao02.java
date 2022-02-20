package br.com.capgemini.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.capgemini.Questao02;

/**
 * 
 * @author Monaira Barbosa da Silva Camargo
 * 
 *         Classe de Teste Unitário da Questão 02 - Academia Java 2022 da
 *         Capgemini.
 * 
 */
public class TestQuestao02 {

	@Test
	public void testaSenhaIgualLimite() {
		// Cenário
		Questao02 q2 = new Questao02();

		// Ação
		int qtdCaracteres = q2.verificaSenha("1a3b5@");

		// Verificação
		Assert.assertEquals(qtdCaracteres, 0);

	}

	@Test
	public void testaSenhaMenorLimite() {
		// Cenário
		Questao02 q2 = new Questao02();

		// Ação
		int qtdCaracteres = q2.verificaSenha("1a3b5");

		// Verificação
		Assert.assertEquals(qtdCaracteres, 1);

	}

	@Test
	public void testaSenhaMaiorLimite() {
		// Cenário
		Questao02 q2 = new Questao02();

		// Ação
		int qtdCaracteres = q2.verificaSenha("1a3b5@3");

		// Verificação
		Assert.assertEquals(qtdCaracteres, -1);

	}

}
