package lista01_expressao_repeticao_for;

import java.util.Locale;
import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		int number1, number2;

		System.out.println("Digite o primeiro número do intervalo: ");
		number1 = leia.nextInt();

		System.out.println("Digite o último número do intervalo:");
		number2 = leia.nextInt();

		if(number1 > number2  ) {
			System.out.println("Intervalo inválido!");
		}else {
			for (int i = number1 + 1; i < number2; i++) {
				
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			}
			
		}

	}

}
