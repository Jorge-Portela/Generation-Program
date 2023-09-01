package exercicio01_condicional_switch;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de
		 * um item (número inteiro de 1 a 6) e a quantidade comprada deste item (número
		 * inteiro). A seguir, mostre na tela o valor total da conta e o nome do produto
		 * que foi comprado.
		 */

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		int codigo, qtd;

		System.out.println("Menu de lanches: ");
		System.out.println("1 - Cachorro Quente - R$ 10.00 " + "\n2 - X-Salada - R$ 15.00" + "\n3 - X-Bacon -R$ 18.00 "
				+ "\n4 - Bauru - R$ 12.00" + "\n5 - Refrigerante - R$ 8.00" + "\n6 - Suco de laranja - R$ 13.00");

		System.out.println("Código do Produto: ");
		codigo = leia.nextInt();

		System.out.println("Quantidade: ");
		qtd = leia.nextInt();

		switch (codigo) {
		case 1:
			float valor = qtd * 10.00f;
			System.out.println("Produto: Cachorro Quente");
			System.out.printf("Valor total:  R$ %.2f", valor);

			break;
		case 2:
			valor = qtd * 15.00f;
			System.out.println("Produto: X-Salada");
			System.out.printf("Valor total:  R$ %.2f", valor);

			break;
		case 3:
			valor = qtd * 18.00f;
			System.out.println("Produto: X-Bacon");
			System.out.printf("Valor total:  R$ %.2f", valor);

			break;
		case 4:
			valor = qtd * 12.00f;
			System.out.println("Produto: Bauru");
			System.out.printf("Valor total:  R$ %.2f", valor);

			break;
		case 5:
			valor = qtd * 8.00f;
			System.out.println("Produto: Refrigerante");
			System.out.printf("Valor total:  R$ %.2f", valor);

			break;
		case 6:
			valor = qtd * 13.00f;
			System.out.println("Produto: Suco de laranja");
			System.out.printf("Valor total:  R$ %.2f", valor);

			break;

		default:
			System.out.println("Opção Inválida. Favor, selecione uma opção do menu");
			break;
		}
		
		

		leia.close();

	}

}
