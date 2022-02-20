package br.com.capgemini.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.capgemini.Questao03;

/**
 * 
 * @author Monaira Barbosa da Silva Camargo
 * 
 *         Classe de Teste Unitário da Questão 03 - Academia Java 2022 da
 *         Capgemini.
 * 
 */
public class TestQuestao03 {
	
	@Test
	public void testaParesAnagramaOvo () {
		// Cenário
		Questao03 q03 = new Questao03();
		
		// Ação
		int qtdPalavras = q03.qtdParesAnagramas("ovo"); 
				
		// Verificação
		Assert.assertEquals(qtdPalavras, 2);
	}
	
	@Test
	public void testaParesAnagramasIfailuhkqq () {
		// Cenário
		Questao03 q03 = new Questao03();
		
		// Ação
		int qtdPalavras = q03.qtdParesAnagramas("ifailuhkqq"); 
				
		// Verificação
		Assert.assertEquals(qtdPalavras, 3);
	}
	
	@Test
	public void testaParesAnagramasIfailuhkqqCamelCase () {
		// Cenário
		Questao03 q03 = new Questao03();
		
		// Ação
		int qtdPalavras = q03.qtdParesAnagramas("IfAiluHkqq"); 
				
		// Verificação
		Assert.assertEquals(qtdPalavras, 3);
	}
}

