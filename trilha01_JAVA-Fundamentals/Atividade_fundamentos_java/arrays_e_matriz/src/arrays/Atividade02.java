package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Atividade02 {
	public static void main(String[] args) {
		/*
		 * Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em
		 * seguida, mostre na tela: - Todos os elementos dos índices ímpares do vetor -
		 * Todos os elementos do vetor que são números pares - A Soma de todos os
		 * elementos do vetor. - A Média de todos os elementos do vetor, armazenada em
		 * uma variável do tipo real
		 */

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		int vetor[] = new int[10], posicao, i = 0;
		float soma = 0, media;

		// Insira os elementos do vetor
		for (i = 0; i < 10; i++) {
			System.out.print("\nAdicione um inteiro no indice " + i + ": ");
			vetor[i] = leia.nextInt();
		}

		// Mostre s elementos do vetor
		System.out.print("\nvetor: ");
		for (i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " | ");
		}

		// Mostre os elementos dos índices ímpares do vetor
		System.out.print("\n\nElementos nos índices ímpares: ");
		for (i = 0; i < vetor.length; i++) {
			if (i % 2 != 0) {
				System.out.print(vetor[i] + " | ");
			}
		}

		// Mostre os elementos pares do vetor
		System.out.print("\n\nElementos pares: ");
		for (i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " | ");
			}
		}

		// Mostre a soma dos elementos do vetor
		for (i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		System.out.print("\n\nSoma: " + soma);

		// Mostre a média dos elementos do vetor
		media = soma / vetor.length;
		System.out.printf("\n\nMédia: %.2f", media);
	}

}
