package lista02_expressao_repeticao_while;

import java.util.Locale;
import java.util.Scanner;

public class Atividade03 {
	public static void main(String[] args) {
		
		/*
		 * Escreva um algoritmo em Java, que leia a idade de várias pessoas 
		 * (números inteiros), via teclado e mostre na tela o total de pessoas
		 *  cuja idade seja menor que 21 anos e o total de pessoas cuja idade 
		 *  seja maior que 50 anos. A leitura dos dados deve ser finalizada ao 
		 *  digitar uma idade negativa
		 */
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int idadeInput, acumulador,acumuladorMenorQ21=0,acumuladorMaiorQ50=0;
		
		System.out.println("Digite uma idade");
		idadeInput = leia.nextInt();
		
		while(idadeInput > 0 ) {
			
			if(idadeInput <=21 ) {
				acumuladorMenorQ21++;
			}else if(idadeInput >50) {
				acumuladorMaiorQ50++;
			}
			
			
			System.out.println("Digite uma idade");
			idadeInput = leia.nextInt();
			
		}
		
		
		System.out.println("Total de pessoas menores de 21 anos: "+acumuladorMenorQ21);
		System.out.println("Total de pessoas maiores de 50 anos:"+acumuladorMaiorQ50);
		
		
		
		
		
		
		
		
		
	}

}
