package collections_arraylist;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Atividade03 {
	public static void main(String[] args) {
		/*
		 *Escreva um programa Java para criar uma Collection 
		 *Set de Objetos da Classe Wrapper Integer. O programa
		 *deverá solicitar ao usuário, que ele digite via 
		 *teclado 10 valores inteiros não repetidos e 
		 *adicione-os individualmente na Collection Set. 
		 *Em seguida, faça o que se pede:
		 *
		 *Mostre na tela todos os elementos da Collection Set,
		 * utilizando a Classe Iterator.  
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int input;
		
		Set<Integer> numero = new TreeSet<Integer>();
		
		System.out.println("Insira 10 número abaixo:");
		for(int i = 0;i < 10; i++) {
			input = leia.nextInt();
			numero.add(input);
		}

		Iterator<Integer> iterate = numero.iterator();
		
		System.out.println("Lista de elementos em ordem crescente:");
		while(iterate.hasNext()) {
			System.out.println(iterate.next());	
		}
		
		leia.close();
	}

}
