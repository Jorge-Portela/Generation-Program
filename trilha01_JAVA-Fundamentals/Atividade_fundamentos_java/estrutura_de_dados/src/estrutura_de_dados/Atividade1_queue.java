package estrutura_de_dados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1_queue {

	public static void main(String[] args) {
		/*
		 * Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da
		 * Classe String, para organizar a ordem de chegada dos Clientes de um Banco. O
		 * programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
		 *
		 * 1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente. 
		 * 2: Listar todos os Clientes na fila 
		 * 3: Chamar (retirar) uma pessoa da fila 0: O
		 * programa deve ser finalizado.
		 *
		 * Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao
		 * tentar retirar (chamar) um cliente da fila..
		 */

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		int opcao, input;

		Queue<String> clientes = new LinkedList<String>();
		Iterator<String> iterator = clientes.iterator();

		System.out.print("1: Adicionar Cliente na fila." 
						+ "\n2: Listar todos os Clientes na fila"
						+ "\n3: Chamar(retirar) uma pessoa da fila"
						+ "\n0: O programa deve ser finalizado.");
		System.out.println("\nDigite uma opção:");
		input = leia.nextInt();
		opcao = input;

		while (opcao != 0) {

			if (opcao == 1) {
				System.out.print("\nDigite o nome:");
				String addCliente = leia.next();
				clientes.add(addCliente);

			} else if (opcao == 2) {
				System.out.println("Lista de Clientes na Fila:");

				
					System.out.println(clientes);
				

			} else if (opcao == 3) {
				if (clientes.isEmpty()) {
					System.out.println("A Fila está vazia!");
				} else {
					System.out.println("Fila:");
					clientes.poll();
					System.out.println(clientes);

				}

			}

			System.out.print("\nDigite uma opção:");
			input = leia.nextInt();
			opcao = input;
		}

		System.out.println("\nPrograma Finalizado!");

	}

}
