package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Aitividade01 {
	public static void main(String[] args) {
		/*
		 *Dado um vetor contendo 10 números inteiros não 
		 *ordenados e não repetidos, construa um algoritmo
		 *que consiga pesquisar dados no vetor, onde o
		 *usuário irá digitar um número e o programa deve
		 *exibir na tela a posição deste número no vetor.
		 *Caso o número não seja encontrado, a mensagem: 
		 *“Não foi encontrado!” deve ser exibida na tela. 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		int  numeros[] = {11, 17, 89, 6, 4, 8, 97, 71, 41, 10};
		int posicao;
		System.out.print("Digite o número que você deseja encontrar: ");
		posicao = leia.nextInt();
		
		for(int i = 0; i < numeros.length; i++ ) {
			
			
			if(posicao == numeros[i]) {
				System.out.println("O número "+posicao+" está localizado na posição:"+i);
			}else {
				System.out.println("Esse número não faz parte do array.");
			}
		}
		
		
		leia.close();
		
		
		
		
	}

}
