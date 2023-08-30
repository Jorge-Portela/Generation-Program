package atividade04_diferenca_de_produto;

import java.util.Locale;
import java.util.Scanner;

public class DiferencaDeProduto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		float numero1, numero2, numero3,numero4, diferenca;
		
		System.out.printf("Digite o primeiro número: "); 
		numero1 = leia.nextFloat();
		
		System.out.printf("Digite o segunda número: "); 
		numero2 = leia.nextFloat();
		
		System.out.printf("Digite o terceiro número: "); 
		numero3 = leia.nextFloat();
		
		System.out.printf("Digite o quarto número: "); 
		numero4 = leia.nextFloat();
		
		diferenca = (numero1 * numero2) - (numero3 * numero4);
		
		System.out.printf("Diferença: %.2f",diferenca); 
		
		leia.close();

	}

}
