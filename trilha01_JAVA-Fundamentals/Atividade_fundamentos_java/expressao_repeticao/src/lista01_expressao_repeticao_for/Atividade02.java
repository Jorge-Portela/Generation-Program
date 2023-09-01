package lista01_expressao_repeticao_for;

import java.util.Locale;
import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre
		 * na tela quantos números são pares e quantos número são ímpares. Veja o exemplo
		 * abaixo: 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int number1,acumuladorPar = 0,acumuladorImpar=0,contador=1;
		
		
		
		for(int i = 1; i <=10; i++) {
			System.out.println("Digite o "+i+"º número: ");
			number1 = leia.nextInt();
			
			if(number1 % 2 ==0) {
				acumuladorPar +=1;
			}else {
				acumuladorImpar += 1;
			}
			
			
		
			
		}
		
		System.out.println("Total de números pares:" + acumuladorPar);
		System.out.println("Total de números ímpar:" + acumuladorImpar);
		
		

	}

}
