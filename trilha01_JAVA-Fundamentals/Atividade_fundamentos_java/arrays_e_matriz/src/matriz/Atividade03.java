package matriz;

import java.util.Locale;
import java.util.Scanner;

public class Atividade03 {
	public static void main(String[] args) {
		/*
		 * Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em
		 * seguida, mostre na tela:
		 * 
		 * -Todos os elementos da Diagonal Principal -Todos os elementos da Diagonal
		 * Secundária -A Soma de todos os elementos da Diagonal Principal -A Soma de
		 * todos os elementos da Diagonal Secundária
		 */

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		int matriz[][] = new int[3][3];
		int tamanho = matriz.length;
		int diagPrincip[] = new int[tamanho];
		int diagSecund[] = new int[tamanho];
		int somaDiagPrincip = 0;
        int somaDiagSecund = 0;
        boolean calcDiagPrincip = true;
		
		

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.print("Digite ujm valor para a posição [" + linha + "][" + coluna + "]: ");
				matriz[linha][coluna] = leia.nextInt();
			}
		}

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("[" + linha + "][" + coluna + "]: " + matriz[linha][coluna]);

			}
		}

		// percorre os elementos da diagonal principal
		for (int i = 0; i < tamanho; i++) {
			diagPrincip[i] = matriz[i][i];
			
			
		}

		System.out.println("Elementos da Diagonal Principal: ");
		for (int i = 0; i < tamanho; i++) {
			System.out.print(diagPrincip[i] + " ");
		}

		// percorre os elementos da diagonal principal
		for(int i = 0; i < tamanho; i++) {
			diagSecund[i] = matriz[(tamanho-1-i)][i];
		}
		
		// Imprimime a diagonal secundária
		System.out.println("Elementos da Diagonal Secundária: ");
		for(int i = 0; i < tamanho; i++) {
			System.out.print(diagSecund[i]+ " ");	
		}
		
		for (int i = 0; i < tamanho; i++) {
			somaDiagPrincip += matriz[i][i];

            if (calcDiagPrincip) {
            	somaDiagSecund += matriz[i][tamanho - 1 - i];
            }

            
            if (i == tamanho - 1) {
            	calcDiagPrincip = false;
            }
        }
		
		
		System.out.println("Soma dos elementos da Diagonal Principal: " + somaDiagPrincip);
        System.out.println("Soma dos elementos da Diagonal Secundária: " + somaDiagSecund);
		
		
		leia.close();

	}

}
