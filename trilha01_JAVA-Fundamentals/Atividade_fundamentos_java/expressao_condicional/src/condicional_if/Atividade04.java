package condicional_if;

import java.util.Locale;
import java.util.Scanner;

public class Atividade04 {
	public static void main(String[] args) {
    /*
     * Escreva um algoritmo em Java, que leia 3 palavras (String), que definem as características de um 
     * tipo de animal possível segundo o diagrama abaixo, que deve ser lido da esquerda para a direita. 
     */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		String palavra1, palavra2, palavra3;
		
		System.out.println("Digite primeira clase");
		palavra1 = leia.nextLine();
		
		System.out.println("Digite segunda clase");
		palavra2 = leia.nextLine();
		
		System.out.println("Digite terceira clase");
		palavra3 = leia.nextLine();
		
		if(palavra1.equalsIgnoreCase("Vertebrado") && palavra2.equalsIgnoreCase("ave") && palavra3.equalsIgnoreCase("carnívoro")) {
			System.out.println("Águia");
		} else if(palavra1.equalsIgnoreCase("vertebrado") && palavra2.equalsIgnoreCase("ave") && palavra3.equalsIgnoreCase("onívoro")) {
			System.out.println("Pomba");	
		} else if(palavra1.equalsIgnoreCase("vertebrado") && palavra2.equalsIgnoreCase("mamífero") && palavra3.equalsIgnoreCase("Onívoro")) {
			System.out.println("Homem");
		}else if(palavra1.equalsIgnoreCase("vertebrado") && palavra2.equalsIgnoreCase("mamífero") && palavra3.equalsIgnoreCase("herbívero")) {
			System.out.println("Vaca");
		}else if(palavra1.equalsIgnoreCase("invertebrado") && palavra2.equalsIgnoreCase("inseto") && palavra3.equalsIgnoreCase("hematófogo")) {
			System.out.println("Pulga");
		}else if(palavra1.equalsIgnoreCase("invertebrado") && palavra2.equalsIgnoreCase("inseto") && palavra3.equalsIgnoreCase("herbívero")) {
			System.out.println("Lagarta");
		}else if(palavra1.equalsIgnoreCase("invertebrado") && palavra2.equalsIgnoreCase("Anelídeo") && palavra3.equalsIgnoreCase("hematófogo")) {
			System.out.println("Sanguesunga");
		}else if(palavra1.equalsIgnoreCase("invertebrado") && palavra2.equalsIgnoreCase("Anelídeo") && palavra3.equalsIgnoreCase("onívoro")) {
			System.out.println("Minhoca");
		}
		
		
		leia.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
