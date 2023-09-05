package collections_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Atividade02 {
	public static void main(String[] args) {
		/*
		 *Escreva um programa Java para criar uma Collection 
		 *ArrayList de Objetos da Classe Wrapper Integer, 
		 *inicializada com 10 valores inteiros. O programa 
		 *deverá solicitar ao usuário, que ele digite via 
		 *teclado 1 número inteiro e caso ele seja encontrado
		 *no ArrayList, exiba na tela a posição deste número 
		 *na Collection. Caso o número não seja encontrado, 
		 *ele deverá exibir na tela a mensagem: 
		 *"O número NN não foi encontrado!" 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int input;
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		for(int i = 1; i <= 10;i++) {
			numeros.add(i);
		}
		
		System.out.println(numeros);
		
		System.out.print("Digite o número que você deseja encontrar: ");
		input = leia.nextInt();
		
		if(numeros.contains(input)) {
			System.out.println("\nO número "+input+" está localizado na posição: "+numeros.get(input));
		}else {
			System.out.println("\nO número "+input+" não foi encontrado!");
			
		}
		
		leia.close();
	}

}
