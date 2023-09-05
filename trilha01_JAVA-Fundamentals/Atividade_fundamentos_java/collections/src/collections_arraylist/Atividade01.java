package collections_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa Java para criar uma Collection ArrayList de Objetos da
		 * Classe String. O programa deverá solicitar ao usuário, que ele digite via
		 * teclado 5 cores e deverá adicioná-las individualmente no ArrayList. Em
		 * seguida, faça o que se pede:
		 * 
		 * - Mostre na tela todas as cores que foram adicionadas. - Mostre na tela todas
		 * as cores que foram adicionadas ordenadas em ordem crescente.
		 */

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		List<String> cores = new ArrayList<String>();

		String input;

		System.out.println("Insira 5 cores abaixo:");
		for (int i = 0; i < 5; i++) {
			input = leia.next();
			cores.add(input);
		}

		System.out.println("\nLista de todas as cores:");
		for (int i = 0; i < 5; i++) {
			System.out.println(cores.get(i));

		}

		
		Collections.sort(cores);

		System.out.println("\nOrdem alfabética: ");
		for(int i = 0; i <5;i++) {
			System.out.println(cores.get(i));

		}

		leia.close();

	}

}
