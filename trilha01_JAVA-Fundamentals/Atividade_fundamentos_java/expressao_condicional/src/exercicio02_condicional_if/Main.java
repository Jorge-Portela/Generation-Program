package exercicio02_condicional_if;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela 
		 * uma mensagem indicando se este número é par ou ímpar e se o número é positivo ou
		 *  negativo. Veja os exemplos abaixo:
		 */

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int n;
		System.out.println("Digite um número: ");
		n = leia.nextInt();
		
		if(n %2 ==0 ) {
			System.out.print("O Número " + n + " é par ");
		} else if(n %2 !=0 ) {
			System.out.print("O Número " + n + " é impar ");
		} 
		
		if( n < 0) {
			System.out.print(" e positivo!");
		}else {
			System.out.print(" e negativo!");
		}
		
		
		
		
	}
	

}
