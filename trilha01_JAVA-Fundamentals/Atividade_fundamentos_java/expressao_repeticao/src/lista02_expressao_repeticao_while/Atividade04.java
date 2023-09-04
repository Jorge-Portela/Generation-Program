package lista02_expressao_repeticao_while;

import java.util.Locale;
import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		/*
		 * Uma empresa desenvolveu uma pesquisa interna para conhecer os colaboradores
		 * da área de Desenvolvimento e precisam de um sistema para analisar os dados.
		 * Escreva um algoritmo em Java, que leia via teclado as seguintes informações
		 * de cada colaborador:
		 *
		 * - Idade (Número inteiro) 
		 * - Sexo (Número Inteiro): 1 – Masculino 2 – Feminino 3 – Outros 
		 * - Categoria (Número Inteiro): 1 – Backend 2 – Frontend 3 – Mobile  4 – FullStack
		 *
		 * Após digitar a categoria, o sistema deverá perguntar ao usuário se ele deseja
		 * continuar a leitura dos dados de um novo colaboradore ou não (S/N). 
		 * Caso seja pressionada a tecla N, mostre na tela: 
		 * 
		 * - O número de pessoas desenvolvedoras Backend 
		 * - O número de mulheres desenvolvedoras Frontend 
		 * - O número de homens desenvolvedores Mobile maiores de 40 anos 
		 * - O número de mulheres desenvolvedoras FullStack menores de 30 anos
		 */

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		String confirmacao = "S"; // inicializado a varíavel com "S" para poder utilizar o loop while
		int idade, genero, categoria, PrimeiraAcumulador = 0, SegundoAcumulador = 0, TerceiroAcumulador = 0,
				QuartoAcumulador = 0;

		while (confirmacao.equalsIgnoreCase("S")) {

			System.out.print("\nDigite a Idade: ");
			idade = leia.nextInt();
			
			// validação de idade
			while (idade < 1 || idade > 120) {
				System.out.print("\nIdade inválida. Digite novamente: ");
				idade = leia.nextInt();
			}

			
			// validação de gênero
			System.out.print("\nDigite o genero (1 – Masculino 2 – Feminino 3 – Outros): ");
			genero = leia.nextInt();
			while(genero < 1 || genero > 3) {
				System.out.print("\nGênero inválido. Digite novamente: ");
				genero = leia.nextInt();
			}

			
			// validação de categoria
			System.out.print("\nDigite a Categoria: (1 – Backend 2 – Frontend 3 – Mobile 4 – FullStack): ");
			categoria = leia.nextInt();
			while (categoria < 1 || categoria > 4) {
				System.out.print("\nDigite a Categoria: (1 – Backend 2 – Frontend 3 – Mobile 4 – FullStack): ");
				categoria = leia.nextInt();

			}

			
			System.out.println("\nDeseja continuar (S/N): ");
			confirmacao = leia.next();

			if (categoria == 1) { // Total de pessoas desenvolvedoras Backend:
				PrimeiraAcumulador++;
			}

			if (genero == 2 && categoria == 2) { // Total de mulheres desenvolvedoras Frontend:
				SegundoAcumulador++;
			}

			if (idade > 40 && genero == 1 && categoria == 3) { // Total de homens desenvolvedores Mobile maiores de 40
																// anos:
				TerceiroAcumulador++;
			}

			if ((idade < 30 && genero == 2) && categoria == 4) { // Total de mulheres desenvolvedoras FullStack menores
																	// de 30 anos:
				QuartoAcumulador++;
			}

		}

		System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + PrimeiraAcumulador);
		System.out.println("\nTotal de mulheres desenvolvedoras Frontend: " + SegundoAcumulador);
		System.out.println("\nTotal de homens desenvolvedores Mobile maiores de 40 anos: " + TerceiroAcumulador);
		System.out.println("\nTotal de mulheres desenvolvedoras FullStack menores de 30 anos: " + QuartoAcumulador);

		leia.close();

	}

}
