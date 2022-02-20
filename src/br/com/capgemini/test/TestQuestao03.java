package br.com.capgemini.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.capgemini.Questao03;

/**
 * 
 * @author Monaira Barbosa da Silva Camargo
 * 
 *         Classe de Teste Unit�rio da Quest�o 03 - Academia Java 2022 da
 *         Capgemini.
 * 
 */
public class TestQuestao03 {
	
	@Test
	public void testaParesAnagramaOvo () {
		// Cen�rio
		Questao03 q03 = new Questao03();
		
		// A��o
		int qtdPalavras = q03.qtdParesAnagramas("ovo"); 
				
		// Verifica��o
		Assert.assertEquals(qtdPalavras, 2);
	}
	
	@Test
	public void testaParesAnagramasIfailuhkqq () {
		// Cen�rio
		Questao03 q03 = new Questao03();
		
		// A��o
		int qtdPalavras = q03.qtdParesAnagramas("ifailuhkqq"); 
				
		// Verifica��o
		Assert.assertEquals(qtdPalavras, 3);
	}
	
	@Test
	public void testaParesAnagramasIfailuhkqqCamelCase () {
		// Cen�rio
		Questao03 q03 = new Questao03();
		
		// A��o
		int qtdPalavras = q03.qtdParesAnagramas("IfAiluHkqq"); 
				
		// Verifica��o
		Assert.assertEquals(qtdPalavras, 3);
	}
}

