package condicional_if;

import java.util.Locale;
import java.util.Scanner;

public class Atividade07 {
	public static void main(String[] args) {
		/*
		 * Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com idade entre
		 * 60 e 69 anos, só podem doar se não for a sua primeira doação. Escreva um Algoritmo em 
		 * Java que obtenha via teclado o nome do doador (String), a idade (inteiro) do doador e 
		 * se é a primeira doação (boolean). De acordo com as Regras para a doação, mostre na 
		 * tela se o doador está Apto ou Não Apto para doar sangue. Veja os exemplos abaixo:
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		String doador;
		int idade;
		boolean primeiraDoacao;
		
		System.out.println("Digite o Nome do doador: ");
		doador = leia.nextLine();
		
		System.out.println("Digite a Idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue? ");
		primeiraDoacao = leia.nextBoolean();
		
		
		if(idade >= 18 && idade <= 59 ) {
			System.out.println( doador + " não está apto para doar sangue!");
		} 
		
		
		
		leia.close();
		
		
	}

}
