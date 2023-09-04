package lista03_expressao_repeticao_do_while;

import java.util.Locale;
import java.util.Scanner;

public class Atividade06 {
	public static void main(String[] args) {
		/*
		 *Escreva um algoritmo em Java, que leia números inteiros via teclado, 
		 *até que o número zero seja digitado. Ao final, mostre na tela a média
		 * de todos os números digitados, que sejam múltiplos de 3. 
		 */
		
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		
		int numberInput,contador=0;
		float acumulador=0f;
		
		
		
		
		do {
			System.out.println("Digite um número: ");
			numberInput = leia.nextInt();	
			
			if( numberInput != 0 && numberInput % 3 == 0 ) {
				
				acumulador += numberInput;
				contador++;
			}
			
			
		}while(numberInput != 0);
		
		float media=acumulador/contador;
		
		System.out.println("A média de todos os números múltiplos de 3 é "+media);
		
		
		
		
		
		
	}

}
