package condicional_if;

import java.util.Locale;
import java.util.Scanner;

public class Atividade01 {
	public static void main(String[] args) {
		
		/*
		 * Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e 
		 * imprima na tela se a soma de A + B é maior, menor ou igual a C. 
	     */
		
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
