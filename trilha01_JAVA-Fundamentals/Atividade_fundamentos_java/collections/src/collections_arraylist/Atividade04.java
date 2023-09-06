package collections_arraylist;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Atividade04 {
	public static void main(String[] args) {
		/*
		 * Escreva um programa Java para criar uma Collection Set de Objetos da Classe
		 * Wrapper Integer, inicializada com 10 valores inteiros. O programa deverá
		 * solicitar ao usuário, que ele digite via teclado 1 número inteiro e caso ele
		 * seja encontrado no Set, exiba na tela a mensagem: "Número 00 Encontrado!"
		 * Caso o número não seja encontrado, ele deverá exibir na tela a mensagem: O
		 * número NN não foi encontrado!
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		int input;
		Set<Integer> setNumero = new HashSet<Integer>();

		for (int i = 1; i <= 10; i++) {
			setNumero.add(i);
		}

		System.out.println("Digite o número que você deseja encontrar: ");
		input = leia.nextInt();

		if (setNumero.contains(input)) {
			System.out.println("O número " + input + " foi encontrado!");
		} else {
			System.out.println("O número " + input + " não foi encontrado!");
		}

		leia.close();

	}

}
