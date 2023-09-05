package matriz;

import java.util.Locale;
import java.util.Scanner;

public class Atividade03 {
	public static void main(String[] args) {
		/*
		 * Elabore um algoritmo que leia uma Matriz 3x3 
		 * de números inteiros e em seguida, mostre na tela:
		 * 
		 *-Todos os elementos da Diagonal Principal
		 *-Todos os elementos da Diagonal Secundária
		 *-A Soma de todos os elementos da Diagonal Principal
		 *-A Soma de todos os elementos da Diagonal Secundária
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		
		int matriz[][] = new int[3][3];
		int input;
		
		for(int linha = 0; linha<3;linha++) {
			for(int coluna = 0;coluna<3;coluna++) {
				System.out.print("Digite ujm valor para a posição ["+linha+"]["+coluna+"]: ");
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		
		for(int linha = 0; linha<3;linha++) {
			for(int coluna = 0;coluna<3;coluna++) {
				System.out.println("O valor armazenado na posição: ["+linha+"]["+coluna+"]: "+matriz[linha][coluna]);
				
			}
		}
		
		
		
		
	}

}
