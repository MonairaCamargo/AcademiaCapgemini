package br.com.capgemini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Monaira Barbosa da Silva Camargo
 * @since 17/02/2022
 * 
 *        Classe de implementação da questão 03 do Processo Seletivo da Academia
 *        Java 2022 da Capgemini.
 */
public class Questao03 {

	/**
	 * Método principal do Programa
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Entrada de informação:
		System.out.println("Digite uma palavra:");
		Scanner in = new Scanner(System.in);
		String palavra = in.nextLine();

		/* Palavra convertida para caixa baixa para não dar diferença na comparação de
		 * pares 
		*/ 
		palavra = palavra.toLowerCase();

		// Passo 01 - Pega todas as substring possíveis
		List<String> subStrings = new ArrayList<>();

		for (int i = 1; i < palavra.length(); i++) {
			for (int j = 0; j < palavra.length() - i + 1; j++) {
        
				// Corta a palavra baseada na posição de j, j + i
				String novaPalavra = palavra.substring(j, j + i);
				subStrings.add(novaPalavra);

			}
		}

		System.out.println(subStrings);

		// Passo 02 - Ordenar Palavras em ordem alfabética
		List<String> palavrasOrdenadas = new ArrayList<>();

		for (String ordenada : subStrings) {
			
			// Converte a string para Array de Char
			char[] stringToChar = ordenada.toCharArray();

			// Coloca o array em ordem alfabética
			Arrays.sort(stringToChar);

			palavrasOrdenadas.add(new String(stringToChar));
		}

		System.out.println("Lista de palavras ordenadas: ");
		System.out.println(palavrasOrdenadas);

		// Passo 03 - Compara os pares de tamanhos iguais
		int quantidade = 0;

		System.out.println("Pares de anagramas: ");

		for (int i = 0; i < palavrasOrdenadas.size(); i++) {

			for (int j = i + 1; j < palavrasOrdenadas.size(); j++) {

				if (palavrasOrdenadas.get(i).equals(palavrasOrdenadas.get(j))) {
					System.out.println("[" + palavrasOrdenadas.get(i) + "," + palavrasOrdenadas.get(j) + "]");
					quantidade++;
				}

			}

		}

		System.out.println("Quantidade de pares: ");
		System.out.println(quantidade);

	}
}
