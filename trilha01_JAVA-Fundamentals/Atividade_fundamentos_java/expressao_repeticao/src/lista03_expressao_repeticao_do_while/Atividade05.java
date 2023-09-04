package lista03_expressao_repeticao_do_while;

import java.util.Locale;
import java.util.Scanner;

public class Atividade05 {
	public static void main(String[] args) {
		/*
		 *Escreva um algoritmo em Java, que leia números inteiros via teclado, 
		 *até que o número zero seja digitado. Ao final, mostre na tela a soma 
		 *de todos os números digitados, que sejam positivos. Veja o exemplo 
		 *abaixo: 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int number1,acumulador=0;
		
	
		
		
		do {
			System.out.println("Digite um número: ");
			number1 = leia.nextInt();
			
			if(number1 >0) {
				
				acumulador+=number1;
				
			}
			
			
		}while(number1 !=0);
		
		System.out.println("A soma dos números positivos é: "+acumulador);
		
		leia.close();		
		
		
		
	}

}
