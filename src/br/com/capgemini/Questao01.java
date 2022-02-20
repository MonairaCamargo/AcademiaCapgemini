package br.com.capgemini;

import java.util.Scanner;

/**
 * 
 * @author Monaira Barbosa da Silva Camargo
 * @since 17/02/2022
 * 
 *        Classe de implementação da questão 01 do Processo Seletivo da Academia
 *        Java 2022 da Capgemini.
 */
public class Questao01 {

	/**
	 * Método principal do Programa
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// Informa o tamanho "n" da escada.
		System.out.println("Tamanho da Escada:");
		int tamanho = in.nextInt();

		// Pecorre a linha e coluna, tratando a escada como uma matriz
		for (int i = tamanho; i >= 1; i--) {
			for (int j = 1; j <= tamanho; j++) {

				// 3) Se linha é menor que coluna imprime espaço
				if (j < i) {
					System.out.print(" ");
				} else {
					// 4) Caso contrário imprimi o degrau.
					System.out.print("*");
				}
			}
			// Quebra de linha para delimitar o final do degrau
			System.out.println();
		}
	}
}
