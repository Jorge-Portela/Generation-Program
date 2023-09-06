package condicional_if;

import java.util.Locale;
import java.util.Scanner;

public class Atividade05 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		int valueA, valueB, valueC, sum;

		System.out.print("Digite o número A: ");
		valueA = leia.nextInt();

		System.out.print("Digite o número B: ");
		valueB = leia.nextInt();

		System.out.print("Digite o número C: ");
		valueC = leia.nextInt();

		sum = valueA + valueB;

		if (sum > valueC) {
			System.out.println(valueA + " + " + valueB + " = " + sum + " > " + valueC);
			System.out.println("A soma de A + B é maior do que C");
		} else if (sum == valueC) {
			System.out.println(valueA + " + " + valueB + " = " + sum + " = " + valueC);
			System.out.println("A soma de A + B é igual a C");
		} else {

			System.out.println(valueA + " + " + valueB + " = " + sum + " < " + valueC);
			System.out.println("A soma de A + B é menor do que C");
		}

	}

}
