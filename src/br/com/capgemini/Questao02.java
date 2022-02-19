package br.com.capgemini;

import java.util.Scanner;

/**
 * 
 * @author Monaira Barbosa da Silva Camargo
 * @since 17/02/2022
 * 
 *        Classe de implementação da questão 02 do Processo Seletivo da Academia
 *        Java 2022 da Capgemini.
 */
public class Questao02 {

	/**
	 * Método principal do Programa
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// Quantidade de caracteres para uma senha forte
		int qtdSenhaForte = 6;

		// Coleta entrada da senha:
		System.out.println("Senha:");
		String senha = in.nextLine();

		// A senha tem que ser uma senha forte e com minímo de caractere permitido
		int var = qtdSenhaForte - senha.length();
		if (var <= 0) {
			System.out.println("Já possui a quantidade de caracteres para uma senha forte");
		} else {
			System.out.println(var);
		}
	}
}